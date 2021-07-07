SELECT
	* 
FROM
	`department`;
	
	
DROP PROCEDURE IF EXISTS account_phongban;
DELIMITER $$
CREATE PROCEDURE account_phongban (
	IN in_department_Name VARCHAR ( 255 )) BEGIN
	SELECT
		a.FullName 
	FROM
		account AS a
		JOIN Department AS b ON a.DepartmentID = b.DepartmentID 
	WHERE
		DepartmentName = in_department_Name;
	
END$$ 
DELIMITER;

CALL account_phongban ( 'PB2' );


SELECT b.GroupID, count(b.AccountID) as dem FROM account as a right join groupaccount as b on a.AccountID=b.AccountID GROUP BY b.GroupID ORDER BY dem;



DELIMITER $$
CREATE PROCEDURE Question_thang()
begin

SELECT
	TypeName,
	COUNT( QuestionID ) AS dem 
FROM
	typequestion AS a
	LEFT JOIN 
	question AS b 
	ON a.TypeID = b.TypeID 
WHERE
	MONTH(CreateDate) = 7 GROUP BY a.TypeID;
END$$
DELIMITER;


CALL Question_thang;

DELIMITER$$
CREATE PROCEDURE Nhieu_cau_hoi ()
BEGIN
SELECT TypeName, COUNT(QuestionID) as dem from question as a join typequestion as b on a.TypeID=b.TypeID GROUP BY b.TypeID ORDER BY dem DESC limit 1;
END$$
DELIMITER;

CALL Nhieu_cau_hoi;


DELIMITER $$
CREATE PROCEDURE Tim_ten(in in_group VARCHAR(50),IN in_account VARCHAR(50))
BEGIN
	IF CHAR_LENGTH(in_group) > 0 THEN
		SELECT g.GroupName
		from   `group` g
		WHERE  g.GroupName LIKE in_group; 
	ELSE
		SELECT a.Username
		from   account a
		WHERE  a.Username LIKE in_account; 
	END IF;
END $$
DELIMITER;


DELIMITER $$
CREATE PROCEDURE Tư_gan(in in_fullname VARCHAR(50),IN in_email VARCHAR(50))
BEGIN
	DECLARE p_username VARCHAR(50) DEFAULT ''; 
	DECLARE p_PositionID int DEFAULT 0;
	DECLARE p_DepartmentID int DEFAULT 0;
	DECLARE p_CreateDate date DEFAULT CURDATE();
	SET p_username = SUBSTRING_INDEX(in_email,'@',1);
	SET p_PositionID = 1;
	SET p_DepartmentID = 10;
	
	insert into account (Email,Username,Fullname,DepartmentID,PositionID,CreateDate) 
	VALUES(in_email,p_username,in_full_name,p_DepartmentID,p_PositionID,p_CreateDate);
	
	SELECT * from account as a
	WHERE a.username = username;
END $$
DELIMITER;


DELIMITER $$
CREATE PROCEDURE Dai_nhat(in in_typename VARCHAR(50))
BEGIN
	if (intype_name = 'Essay') THEN
		SELECT q.Content, MAX(CHAR_LENGTH(q.Content)) from question q
		WHERE q.TypeID = 1;
	ELSEIF (in_typename = 'Multiple-Choice') THEN
		SELECT q.Content, MAX(CHAR_LENGTH(q.Content)) from question q
		WHERE q.TypeID = 2;
  END IF;
END $$
DELIMITER;


DELIMITER $$
CREATE PROCEDURE xoa_exam(in in_examid INT)
BEGIN
	DELETE 	
  FROM 	Exam 
  WHERE	ExamID = in_examid;	
END $$
DELIMITER;