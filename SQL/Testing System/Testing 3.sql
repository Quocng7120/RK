
use assignment_1_01;

alter table trainee 
change column TraineeID TraineeID Int not null AUTO_INCREMENT;

INSERT INTO trainee (Full_Name, Birth_Date, gender, ET_Gmath, ET_English, Training_Class, Evaluation_Notes, VTI_Account)
VALUES ('Nguyen Duy Quoc', '2000-01-07', 'Male', 20, 19, 'L01', ' ', ''),
 ('Nguyen Bao Hoang', '2000-10-03', 'Male', 4, 8, 'L03', ' ', ''),
 ('Nguyen ', '2000-01-07', 'Male', 10, 5, 'L01', ' ', ''),
 ('Nguyen QG DD', '2000-01-07', 'Male', 12, 7, 'L01', ' ', ''),
 ('Nguyen QR VA', '2000-01-07', 'Male', 12, 9, 'L01', ' ', ''),
 ('DAS GR SF', '2000-01-07', 'Male', 4, 11, 'L01', ' ', ''),
 ('AS KY HYU', '2000-01-07', 'Male', 20, 11, 'L01', ' ', ''),
 ('Nguyen KIS DSD', '2000-01-07', 'Male', 5, 6, 'L01', ' ', ''),
 ('SDAS IHIDN ADAS', '2000-01-07', 'Male', 9, 4, 'L01', ' ', ''),
 ('DSD Duy DAS', '2000-01-07', 'Male', 7, 8, 'L01', '', ' ');
 
 select * from trainee;
 
 select * from trainee order by month(Birth_Date);
 select month(Birth_Date), count(*) as total, group_concat(Full_Name) from trainee group by month(Birth_Date);
 
 
 select Full_name, char_length(Full_Name) As Name_length, 2021 - year(Birth_Date)  from trainee order by Name_length desc limit 1;
 
 select Full_name, length(Full_Name) As Name_length from trainee order by Name_length desc;
 
 SELECT * FROM trainee where ET_IQ >= 8 AND ET_Gmath >=8 AND ET_English >= 18 AND (ET_IQ + ET_Gmath) >= 20;

DELETE FROM trainee where TraineeID = 3;

UPDATE trainee SET Training_Class = 'Class Two' Where TraineeID = 5;
 
