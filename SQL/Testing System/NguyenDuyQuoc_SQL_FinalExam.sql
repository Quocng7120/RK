-- Câu 1: Tạo database, thêm bản ghi

CREATE DATABASE Kiem_Tra;
USE Kiem_Tra;

CREATE TABLE 	Student ( 
	ID 					INT AUTO_INCREMENT PRIMARY KEY,
	`Name`						VARCHAR(30) NOT NULL,
	Age 						INT NOT NULL,
	Gender 						ENUM('Male','Female','Unknow') NOT NULL
);

CREATE TABLE 	`Subject` ( 
	ID 					INT AUTO_INCREMENT PRIMARY KEY,
	`Name`						VARCHAR(30) NOT NULL
);

CREATE TABLE 	StudentSubject ( 
	StudentID 					INT NOT NULL,
	SubjectID 					INT NOT NULL ,
	Mark				       	INT NOT NULL,
	Date                DATE NOT NULL  
);


INSERT INTO Student 
(`Name`,               Age,        Gender  )
VALUES
('Nguyen Duy Quoc',    21,         'Male'  ),
('Do Bao Hoang',       19,         'Male'  ),
('Phan Nguyen Van Anh',18,         'Female');


INSERT INTO `Subject` 
(`Name`)
VALUES
('Toan'),
('Ly'),
('Sinh'),
('Sinh');

INSERT INTO StudentSubject 
(StudentID,               SubjectID,        Mark,    Date              )
VALUES
(1,                       2,                8,       '2021-01-02'      ),
(2,                       1,                9,       '2021-01-07'      ),
(3,                       2,                8,       '2021-01-15'      ),
(1,                       3,                6,       '2021-01-23'      ),
(1,                       1,                7,       '2021-01-22'      ),
(2,                       2,                9,       '2021-01-26'      );


-- Câu 2: 
-- a) lấy ra môn học không có bất kì điểm nào
SELECT a.ID, COUNT(Mark) as SoDiem from `Subject` as a left join StudentSubject as b on a.ID = b.SubjectID GROUP BY a.ID HAVING SoDiem=0;

-- b) lấy ra môn học có ít nhất 2 điểm
SELECT a.ID, COUNT(Mark) as SoDiem from `Subject` as a left join StudentSubject as b on a.ID = b.SubjectID GROUP BY a.ID HAVING SoDiem>=2;


-- Câu 3: 

CREATE OR REPLACE VIEW StudentInfo AS 
SELECT StudentID, SubjectID, a.name as 'Student Name', a.Age, a.Gender, c.Name as 'Subject Name', b.Mark, b.Date  
FROM ((Student as a LEFT JOIN StudentSubject as b on a.ID = b.StudentID) LEFT JOIN `Subject` as c on b.SubjectID = c.ID);

SELECT * FROM StudentInfo

-- Cau 4
-- a)
DROP TRIGGER IF EXISTS SubjectUpdateID;
DELIMITER$$
CREATE TRIGGER SubjectUpdateID 
AFTER UPDATE 
ON `Subject` FOR EACH ROW
BEGIN
    IF OLD.ID <> New.ID THEN 
		   UPDATE StudentSubject SET SubjectID = new.ID WHERE SubjectID=OLD.ID;
	  END IF;
END$$
DELIMITER;

-- b) 
DROP TRIGGER IF EXISTS StudentDeleteID;
DELIMITER$$
CREATE TRIGGER StudentDeleteID 
BEFORE DELETE 
ON Student FOR EACH ROW
BEGIN
    DELETE FROM StudentSubject WHERE StudentID = OLD.ID;
END$$
DELIMITER;



-- Cau 5 

DROP PROCEDURE IF EXISTS Xoa_Student;
DELIMITER$$
CREATE PROCEDURE Xoa_Student(IN in_name_student VARCHAR(50), OUT out_mess varchar(50))
BEGIN
    IF (in_name_student <> '*') THEN
		  DELETE FROM student WHERE `Name` = in_name_student;
		ELSE
		  DELETE FROM student;
		END IF;
		SET out_mess = 'Da Xoa';
END$$
DELIMITER;

set @a = '';
CALL Xoa_Student('Nguyen Duy Quoc', @a);
SELECT @a;		
