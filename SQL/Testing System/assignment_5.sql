use adventurework;


SELECT 
    `Name`
FROM
    product
WHERE
    ProductSubcategoryID IN (SELECT 
            ProductSubcategoryID
        FROM
            productsubcategory
        WHERE
            `Name` = 'Saddles');

SELECT 
    `Name`
FROM
    product
WHERE
    ProductSubcategoryID IN (SELECT 
            ProductSubcategoryID
        FROM
            productsubcategory
        WHERE
            `Name` LIKE 'Bo%');

SELECT 
    `Name`, MIN(ListPrice)
FROM
    product
WHERE
    ProductSubcategoryID = 3;
    
    
SELECT 
    Name, ListPrice, ProductSubcategoryID
FROM
    product
WHERE
    ProductSubcategoryID = 3
ORDER BY ListPrice ASC;


SELECT 
    Name, ListPrice
FROM
    product
WHERE
    ListPrice IN (SELECT 
            MIN(ListPrice)
        FROM
            product
        WHERE
            ProductSubcategoryID = 3);
            
select * from countryregion;
select * from countryregioncurrency;

select * from currency where name = 'Alberta';

select salespersonid from salesperson;
select * from salesorderheader;

SELECT 
    b.SalesOrderID,
    b.OrderDate,
    a.SalesPersonID,
    b.SalesPersonID AS BusinessEntityID,
    a.Bonus,
    a.SalesYTD
FROM
    salesperson AS a
        JOIN
    salesorderheader AS b ON a.salespersonid = b.salespersonid
WHERE
    OnlineOrderFlag = 0;
    

select * from employee where ContactID = 377;
select * from employee;

SELECT 
    b.SalesOrderID,
    b.OrderDate,
    a.Bonus,
    a.SalesYTD,
    b.ContactID,
    c.Title AS Jobtitle
FROM
    ((salesperson AS a
    JOIN salesorderheader AS b ON a.salespersonid = b.salespersonid)
    LEFT JOIN employee AS c ON b.ContactID = c.ContactID)
WHERE
    OnlineOrderFlag = 0;
    
select* from contact;