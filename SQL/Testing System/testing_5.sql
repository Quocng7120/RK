use tsa_1;

-- cau 1
CREATE OR REPLACE VIEW danhsachsale AS
    SELECT 
        a.DepartmentName, b.username, b.fullname
    FROM
        Department AS a
            JOIN
        `Account` AS b ON a.DepartmentID = b.DepartmentID
    WHERE
        a.DepartmentName = 'PB2';

select * from danhsachsale;
select * from `account`;
select * from `Department`;


-- cau 2
CREATE OR REPLACE VIEW thamgia AS
    SELECT 
        GroupID, COUNT(a.AccountID) as tong
    FROM
        `account` AS a
            LEFT JOIN
        GroupAccount AS b ON a.AccountID = b.AccountID
    GROUP BY GroupID order by tong desc limit 1;
    

select * from `GroupAccount`;


-- cau 3
CREATE OR REPLACE VIEW caudai AS
    SELECT 
        QuestionID, CHAR_LENGTH(Content) AS length_content
    FROM
        Question
    WHERE
        CHAR_LENGTH(Content) > 5;

select * from `caudai`;

 -- cau 4
CREATE OR REPLACE VIEW phongban AS
    SELECT 
        a.DepartmentID, DepartmentName, COUNT(1) AS dem
    FROM
        Department AS a
            JOIN
        `account` AS b ON a.DepartmentID = b.DepartmentID
    GROUP BY a.DepartmentID;

SELECT 
    DepartmentName, MAX(dem) AS 'so nguoi'
FROM
    `phongban`;
    
-- cau 5
select * from Question;

CREATE OR REPLACE VIEW nguoitaocauhoi AS
    SELECT 
        QuestionID, fullname
    FROM
        `account` AS a
            RIGHT JOIN
        Question AS b ON a.AccountID = b.CreatorID
    WHERE
        fullname LIKE '%13';
