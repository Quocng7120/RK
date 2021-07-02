use TSA_1;



select FullName, UserName, DepartmentName from Department as a right join `Account` as b on a.DepartmentID = b.DepartmentID;

select UserName, FullName, DepartmentName from Department as a right join `Account` as b on a.DepartmentID = b.DepartmentID where CreateDate > '2010-12-20';

select UserName, FullName from `Account` as a join Position as b on a.PositionID = b.PositionID where PositionName = 'Dev';

select DepartmentName, count(1) as sonhanvien from Department as a right join `Account` as b on a.DepartmentID = b.DepartmentID group by a.DepartmentID having sonhanvien>2;

select ExamID ,QuestionID from ExamQuestion order by ExamID asc;

select b.QuestionID, ExamID from ExamQuestion as a right join Question as b on a.QuestionID = b.QuestionID group by ExamID;

select * from ExamQuestion;



select * from `Account` as a join `GroupAccount` as b on a.AccountID = b.AccountID  where GoupID= 1
union
select * from  `Account` as a join `GroupAccount` as b on a.AccountID = b.AccountID  where GoupID= 5;

select GroupName, count(1) from `Account` as a join GroupAccount as b on a.AccountID = b.AccountID group by AccountID > 5
union all
select GroupName, count(1) from `Account` as a join GroupAccount as b on a.AccountID = b.AccountID group by AccountID < 7;

select PositionName, count(1) from Position as a join `Account` as b on a.PositionID = b.PositionID group by PositionID asc limit 1;
