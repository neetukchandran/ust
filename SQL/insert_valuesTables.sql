USE College;

/* inseting into the departments table*/
INSERT INTO Departments(Department_ID,Department_Name) VALUES (1,"ECE"), (2,"CS"),(3,"Mechanical");

/* inserting into Lecturers*/
INSERT INTO Lecturers (Lecturer_ID,Lecturer_Name,Department_ID) VALUES (1,"John",1),(2,"Steeve",2),(3,"Smith",3);


/*inserting into subjects*/

INSERT INTO Subjects (Subject_ID,Subject_name,Lecturer_ID) VALUES (1,"Basics of ECE",1),(2,"Basics of CS",2),(3,"Mechanics",3);

/*Inserting into students*/

INSERT INTO Students (Student_ID,Student_name,Subject_ID) VALUES (1,"James",1),(2,"Shiva",2),(3,"Brad",3);




