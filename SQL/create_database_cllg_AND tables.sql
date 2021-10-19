CREATE DATABASE college;
USE  college;

CREATE TABLE Students (
Student_ID INT PRIMARY KEY,
Student_Name VARCHAR(255),
Subject_ID INT,
FOREIGN KEY (Subject_ID) REFERENCES Subjects(Subject_ID)
);

CREATE TABLE Subjects (
Subject_ID INT,
Subject_Name VARCHAR(255),
Lecturer_ID INT,
PRIMARY KEY (Subject_ID),
FOREIGN KEY(Lecturer_ID) REFERENCES Lecturers(Lecturer_ID)
);

CREATE TABLE Lecturers (
Lecturer_ID INT,
Lecturer_Name VARCHAR(255),
Department_ID INT ,
PRIMARY KEY(Lecturer_ID),
FOREIGN KEY(Department_ID) REFERENCES Departments(Department_ID)
);

CREATE TABLE Departments (
Department_ID INT,
Department_Name VARCHAR(255),
PRIMARY KEY(Department_ID)
);

CREATE TABLE Fee_Structure (
Student_ID INT,
Fees INT,
FOREIGN KEY(Student_ID)  REFERENCES Students(Student_ID)
)





