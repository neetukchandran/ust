USE college;
SELECT * FROM Students;

/*Adding  new records in students table*/
INSERT INTO Students (Student_ID,Student_Name,Subject_ID)
VALUES (4,"Chloe",3);

/*Updating a table*/
UPDATE Students SET Student_Name="Chloe" WHERE Student_ID=4;

/*Retrieving data using where*/
SELECT * FROM Students WHERE Subject_ID <3;

/*Using ORDER BY*/
SELECT * FROM Students WHERE Subject_ID <3 ORDER BY Student_Name;

/*Using ORDER BY desc*/
SELECT * FROM Students WHERE Subject_ID <3 ORDER BY Student_Name DESC;

/*Deleting a record from table*/

DELETE FROM Students WHERE Student_ID = 4;

/*Joins*/

/*inner joins*/

SELECT Students.Student_Name,Subjects.Subject_Name FROM Students INNER JOIN Subjects ON Students.Student_ID=Subjects.Subject_ID;

/*LEFT JOIN*/
SELECT Students.Student_Name,Subjects.Subject_Name FROM Students LEFT JOIN Subjects ON Students.Subject_ID=Subjects.Subject_ID;

/*RIGHT JOIN*/
SELECT Students.Student_Name,Subjects.Subject_Name FROM Students RIGHT JOIN Subjects ON Students.Subject_ID=Subjects.Subject_ID;

