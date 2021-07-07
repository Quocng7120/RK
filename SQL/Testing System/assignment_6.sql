use testingsystem_assignment_extra_6;


DROP PROCEDURE IF EXISTS Remove_projects;

DELIMITER $$
create procedure Remove_projects()
begin
delete from  Work_Done where ModuleID in(select ModuleID from project_modules where projectID in(select projectID from projects where DATEDIFF(ProjectCompletedOn, CURDATE()) <=90));
DELETE FROM project_modules 
WHERE
    projectID IN (SELECT 
        projectID
    FROM
        projects
    
    WHERE
        DATEDIFF(ProjectCompletedOn, CURDATE()) <= 90);
DELETE FROM projects 
WHERE
    DATEDIFF(ProjectCompletedOn, CURDATE()) <= 90;
end$$

call Remove_projects;

select * from projects;

select a.moduleID from project_modules as a join Work_Done as b on a.ModuleID = b.ModuleID where b.WorkDoneStatus = 0;

DROP PROCEDURE IF EXISTS dang_thuc_hien;
DELIMITER $$
create procedure dang_thuc_hien(OUT out_moduleID int)
begin
select a.moduleID into out_moduleID from project_modules as a join Work_Done as b on a.ModuleID = b.ModuleID where b.WorkDoneStatus = 0; 
end$$

set @v_out_moduleID = '';
call dang_thuc_hien(@v_out_moduleID);
select @v_out_moduleID;