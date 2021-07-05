use TSA_1;



SELECT 
    FullName, UserName, DepartmentName
FROM
    Department AS a
        RIGHT JOIN
    `Account` AS b ON a.DepartmentID = b.DepartmentID;

SELECT 
    UserName, FullName, DepartmentName
FROM
    Department AS a
        RIGHT JOIN
    `Account` AS b ON a.DepartmentID = b.DepartmentID
WHERE
    CreateDate > '2010-12-20';

SELECT 
    UserName, FullName
FROM
    `Account` AS a
        JOIN
    Position AS b ON a.PositionID = b.PositionID
WHERE
    PositionName = 'Dev';

SELECT 
    DepartmentName, COUNT(1) AS sonhanvien
FROM
    Department AS a
        RIGHT JOIN
    `Account` AS b ON a.DepartmentID = b.DepartmentID
GROUP BY a.DepartmentID
HAVING sonhanvien > 2;

SELECT 
    ExamID, QuestionID
FROM
    ExamQuestion
ORDER BY ExamID ASC;

SELECT 
    b.QuestionID, ExamID
FROM
    ExamQuestion AS a
        RIGHT JOIN
    Question AS b ON a.QuestionID = b.QuestionID
GROUP BY ExamID;

SELECT 
    *
FROM
    ExamQuestion;

SELECT 
    PositionName, COUNT(*) AS dem
FROM
    `account` AS a
        RIGHT JOIN
    Position AS b ON a.PositionID = b.PositionID
GROUP BY b.PositionID;

select * from `Account` as a join `GroupAccount` as b on a.AccountID = b.AccountID  where GoupID= 1
union
select * from  `Account` as a join `GroupAccount` as b on a.AccountID = b.AccountID  where GoupID= 5;

SELECT 
    GroupName, COUNT(1)
FROM
    `Account` AS a
        JOIN
    GroupAccount AS b ON a.AccountID = b.AccountID
GROUP BY AccountID > 5 
UNION ALL SELECT 
    GroupName, COUNT(1)
FROM
    `Account` AS a
        JOIN
    GroupAccount AS b ON a.AccountID = b.AccountID
GROUP BY AccountID < 7;

SELECT 
    PositionName, COUNT(*)
FROM
    Position AS a
        JOIN
    `Account` AS b ON a.PositionID = b.PositionID
GROUP BY PositionID ;

select DepartmentName, count(1) as dem from Department as a join `account` as b on a.DepartmentID = b.DepartmentID group by a.DepartmentID order by dem desc limit 1;

select a.QuestionID, count(ExamID) as 'so lan su dung' from Question as a left join ExamQuestion as b on a.QuestionID=b.QuestionID group by a.QuestionID;

select * from ExamQuestion;

select c.GroupName, c.GroupID, count(a.AccountID) as dem from ((`account` as a join GroupAccount as b on a.AccountID = b.AccountID) right join `Group` as c on b.GroupID = c.GroupID) group by b.GroupID having dem = 0 order by dem;

select * from `Group`;

