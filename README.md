l we hope the spark that started this project and passion kept it going
------------------------------------------------------------------------------
UMl class Diagram
class Uni{
      main()

}
-----------------
class Student{
attributes
    int studentid
    Student nextstudent//refrence to next students
constractors
    student(int student id)
    student(int studentid,Student nextstudent)
methods
    addCourse :(void)
}
-------------------
class Courses{
attributes
    int courseid
    Courses nextcourse
constractors
    courses()
    courses(int courseid)
    courses(int courseid,Courses next courses)
methods
    addStudent:(void)
}
---------------------
class ourbackend{
attributes
    Student headstudent;
    Courses headcourse;
    int laststudentID;
    int lastcourseID;
    stack undo;
    stack redo;
methods
    1- add student=>add new student to the list of students linked list
    2- add course=>add new course to the list of courses linked list
    3- remove student=>remove student from the list of students linked list
    4- remove course=>remove course from the list of courses linked list
    5- get last student added=>return the id of the last student added to the list of students
    6- get last course added=>return the id of the last course added to the list of courses
    7- enroll student in course=>enroll student in the course update the both lists
    8- remove enrollment=>remove the enrollment of the student from the course
    9- list course by student=>list all the courses that the student is enrolled in
    10- list student by course=>list all the students that are enrolled in the course
    11- sort students by id=>sort the list of students by id
    12- sort courses by id=>sort the list of courses by id
    13- if full course or not=>check if the course is full or not
    14- is normal student or not=>check if the student is normal or not
    15-undo enrollment=>undo the enrollment of the student from the course "stack"
    16- redo enrollment=>redo the enrollment of the student in the course "stack"

    to make some funny games "method to flex"
}
----------------------------------------------------------------------------------------------------
 teams
    #1-farook-nabil-ibrahim"not exsist bec ahmed ez fezamanoooo"
    methods+main
        1-add student  "done"
        2-add course   "done"
        3-remode student "done"
        4-remove course "done"
        5-get last student added"done"
        6-get last course added"done"
        15-undo enrollment stack
    #2-zeyad-ayman-farouk-rashad(mmultiverse)
        7-enrool student in course "done" by rashad
        8-removeenrollment
        9-list course by sstudent 
        10-list student by course
        11-sort students by id
    #3-aly amr-adham-hassouna
    methods
        12-sort courses by id
        13-if full course or not "done" by aly
        14-is normal student or not"done" by aly
        16-redo enrollment stack
        test
