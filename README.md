# 🏛️ AFZ University Management System

![Java](https://img.shields.io/badge/Java-17+-blue?logo=java)
![License](https://img.shields.io/badge/License-MIT-green)
![Status](https://img.shields.io/badge/Status-Complete-brightgreen)

A complete Java backend system for university enrollment management with undo/redo functionality.

## 📌 Core Components

### `ourbackend.java` - The Brain
```java
// Manages all university operations
public class ourbackend {
    Student headstudent;  // Student linked list
    Courses headcourse;   // Course linked list
    Stack<EnrollmentAction> undostack; // Undo history
    Stack<EnrollmentAction> redostack; // Redo buffer
    
    // Key Methods:
    public void enrollStudentinCourse(int studentID, int courseID) {...}
    public void undoEnrollment() {...}
    public boolean isFullCourse(int courseID) {...}
    //
}
----------------------------------------------------------------------------------------------------
 teams
    #1-farook-nabil-ibrahim"not exsist bec ahmed ez fezamanoooo"
    methods+main"done"
        1-add student  "done"
        2-add course   "done"
        3-remode student "done"
        4-remove course "done"
        5-get last student added"done"
        6-get last course added"done"
    #2-zeyad-ayman-farouk(mmultiverse)-rashad
        7-enrool student in course"done ' by rashad
        8-removeenrollment"done' by Farouk(mmultiverse) 
        9-list course by sstudent "done" by ayman
        10-list student by course "done" by ayman
        11-sort students by id"done "by zeyad
    #3-aly amr-adham-hassouna
    methods
        12-sort courses by id "done " by hassouna
        13-if full course or not "done" by aly
        14-is normal student or not "done" by aly
        16-redo and 15-undo enrollment stack "done " by adham

