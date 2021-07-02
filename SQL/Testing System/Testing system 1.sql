create database TSA_1;
use TSA_1;

CREATE TABLE Department (
    DepartmentID INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    DepartmentName VARCHAR(50)
);

Insert into Department (DepartmentName)
value ("PB1"),
("PB2"),
("PB3"),
("PB4"),
("PB5"),
("PB6"),
("PB7"),
("PB8"),
("PB9"),
("PB10");

select * from Department;



CREATE TABLE `Position` (
    PositionID INT not null AUTO_INCREMENT,
    PositionName VARCHAR(50)
);

insert into `Position` (PositionName)
value ("(Dev"),
("Test"),
("Scrum Master"),
("PM");

UPDATE `Position` SET PositionName = 'Dev' Where PositionID = 1;



select * from `Position`;



CREATE TABLE `Group` (
    GroupID INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    GroupName VARCHAR(50),
    CreatorID INT,
    CreateDate DATE
);

insert into `Group` (GroupName, CreatorID, CreateDate)
value ('GP1', 3, '2020-03-01'),
('GP2', 2, '2020-04-23'),
('GP3', 5, '2020-11-19'),
('GP4', 1, '2021-01-05'),
('GP5', 4, '2021-02-28');

select * from `Group`;

CREATE TABLE GroupAccount (
    GroupID INT,
    AccountID INT,
    JoinDate DATE
);

insert into GroupAccount (GroupID, AccountID, JoinDate)
value (1, 3, '2020-03-01'),
(1, 5, '2020-03-02'),
(2, 7, '2020-03-03'),
(2, 2, '2020-03-04'),
(2, 1, '2020-05-11'),
(2, 4, '2020-05-12'),
(3, 6, '2020-06-15'),
(3, 8, '2020-10-17'),
(3, 9, '2020-11-09'),
(3, 10, '2020-11-20');


CREATE TABLE TypeQuestion (
    TypeID INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    TypeName VARCHAR(50)
);

insert into TypeQuestion (TypeName)
value('Essay'),
('Multiple-Choice');


CREATE TABLE CategoryQuestion (
    CategoryID INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    CategoryName VARCHAR(255)
);

insert into CategoryQuestion (CategoryName)
value('JAVA'),
('.NET'),
('SQL'),
('Postman'),
('Ruby'),
('C#'),
('Python'),
('Pascal'),
('Core'),
('Random');

CREATE TABLE Question (
    QuestionID INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    Content VARCHAR(255),
    CategoryID INT,
    TypeID INT,
    CreatorID INT,
    CreateDate DATE
);

insert into Question (Content, CategoryID, TypeID, CreatorID, CreateDate)
value ('ABC', 2, 1, 2, '2020-02-01'),
('ABCD', 1, 1, 3, '2020-03-12'),
('asSAC', 3, 2, 1, '2020-05-21'),
('ABCASDA', 2, 1, 5, '2020-07-05'),
('ABCQWEA', 6, 2, 4, '2020-10-11'),
('ABCSDFX', 5, 1, 6, '2021-01-20'),
('ABCWSDA', 7, 1, 3, '2021-02-19'),
('SDFSABC', 3, 2, 5, '2021-02-23'),
('ABCADF', 8, 2, 3, '2021-03-22'),
('ABQWAC', 9, 1, 1, '2021-05-30');

CREATE TABLE Answer (
    AnswerID INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    Content VARCHAR(255),
    QuestionID INT,
    isCorrect BOOLEAN
);

insert into Answer (Content, QuestionID, isCorrect)
value ('qwasd',1 , true),
('asdasd',2 , false),
('qweasd',3 , false),
('asdfz',4 , true),
('sdfxcv',5 , true),
('dfsdf',6 , false),
('xvcxdf',7 , true),
('afdfsf',8 , false),
('asdfdf',9 , true),
('sdfdf',10 , true);

CREATE TABLE exam (
    ExamID INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    `Code` VARCHAR(10),
    Title VARCHAR(255),
    CategoryID INT,
    Duration DATE,
    CreatorID INT,
    CreateDate DATE
);

insert into exam (`Code`, Title, CategoryID, Duration, CreatorID, CreateDate)
value ('CD01', 'asdads',2 , '2020-02-12', 3 , '2020-01-10'),
('CD02', 'asdads',1 , '2020-03-04', 1 , '2020-02-14'),
('CD03', 'asdads',3 , '2020-05-23', 5 , '2020-03-12'),
('CD04', 'asdads',5 , '2020-06-12', 9 , '2020-04-15'),
('CD05', 'asdads',2 , '2020-07-06', 1 , '2020-05-26'),
('CD06', 'asdads',4 , '2020-08-15', 1 , '2020-06-29'),
('CD07', 'asdads',8 , '2020-09-17', 7 , '2020-07-12'),
('CD08', 'asdads',5 , '2020-10-23', 6 , '2020-08-14'),
('CD09', 'asdads',9 , '2020-11-21', 3 , '2020-09-16'),
('CD10', 'asdads',6 , '2020-12-22', 5 , '2020-11-18');

CREATE TABLE ExamQuestion (
    ExamID INT,
    QuestionID INT
);

insert into ExamQuestion (ExamID, QuestionID)
value(1,2),
(1,3),
(1,5),
(1,8),
(2,2),
(2,1),
(2,4),
(3,5),
(3,7),
(3,9);

CREATE TABLE `Account` (
    AccountID INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    Email VARCHAR(50),
    Username VARCHAR(255),
    FullName VARCHAR(255),
    DepartmentID INT,
    PositionID INT,
    CreateDate DATE
);

insert into `Account` (Email, Username, FullName, DepartmentID, PositionID, CreateDate)
value ('', 'quoc01', 'Quoc11', 2, 1, '2020-01-21'),
('', 'quoc02', 'Quoc12', 3, 1, '2020-01-21'),
('', 'quoc03', 'Quoc13', 4, 2, '2020-01-21'),
('', 'quoc04', 'Quoc14', 6, 1, '2020-01-21'),
('', 'quoc05', 'Quoc15', 3, 3, '2020-01-21'),
('', 'quoc06', 'Quoc16', 2, 2, '2020-01-21'),
('', 'quoc07', 'Quoc17', 1, 4, '2020-01-21'),
('', 'quoc08', 'Quoc18', 1, 4, '2020-01-21'),
('', 'quoc09', 'Quoc19', 2, 3, '2020-01-21'),
('', 'quoc10', 'Quoc21', 4, 1, '2020-01-21');

