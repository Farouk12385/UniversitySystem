# 📚 AFZ University System 
![Java](https://img.shields.io/badge/Java-17%2B-blue?logo=java)
![License](https://img.shields.io/badge/License-MIT-green)
![Status](https://img.shields.io/badge/Status-Complete-brightgreen)
## 🏛️ ourbackend.java (Main Controller)

### Student Management
| Method | Parameters | Description |
|--------|------------|-------------|
| `addStudent` | `int studentID` | Adds new student after validation |
| `removeStudent` | `int studentID` | Removes student and all enrollments |
| `verfiyStudent` | `int studentID` | Checks if student exists (returns boolean) |
| `GetLaststudentadded` | None | Returns last added student ID |

### Course Management
| Method | Parameters | Description |
|--------|------------|-------------|
| `addCourse` | `int courseID` | Adds new course after validation |
| `removeCourse` | `int courseID` | Removes course and all enrollments |
| `verfiyCourse` | `int courseID` | Checks if course exists (returns boolean) |
| `GetLastCourseAdded` | None | Returns last added course ID |

### Enrollment System
| Method | Parameters | Description |
|--------|------------|-------------|
| `enrollStudentinCourse` | `int studentID, int courseID` | Enrolls student if valid |
| `removeEnrollment` | `int studentID, int courseID` | Removes specific enrollment |
| `undoEnrollment` | None | Reverts last enrollment action |
| `redoEnrollment` | None | Reapplies undone enrollment |

### Reporting
| Method | Parameters | Description |
|--------|------------|-------------|
| `listAllCoursesByStudent` | `int studentID` | Prints all courses for student |
| `listAllStudentsByCourse` | `int courseID` | Prints all students in course |
| `sortStudentID` | `int courseID` | Sorts students by ID for a course |
| `sortCourseID` | `int studentID` | Sorts courses by ID for a student |

### Status Checks
| Method | Parameters | Description |
|--------|------------|-------------|
| `isFullCourse` | `int courseID` | Checks if course reached 30 students |
| `isNormalStudent` | `int studentID` | Checks if student has 2-7 courses |

## 👨‍🎓 Student.java (Model)

| Method | Description |
|--------|-------------|
| `Student(int studentID)` | Constructor with ID initialization |
| `Student(int studentID, Student nextStudent)` | Constructor with next node reference |
| `isEnrolledInCourse(int courseID)` | Checks enrollment status |
| `addCourse(int courseID)` | Adds course to student's list |
| `removeCourse(int courseID)` | Removes course from student's list |

## 📚 Courses.java (Model)

| Method | Description |
|--------|-------------|
| `Courses()` | Default constructor |
| `Courses(int courseID)` | Constructor with course ID |
| `Courses(int courseID, Courses nextCourse)` | Constructor with next node reference |
| `addStudent(int studentID)` | Increments enrollment count |
| `isStudentEnrolled(int studentID)` | Placeholder for enrollment check |

## 🔄 EnrollmentAction.java (Helper)

| Method | Description |
|--------|-------------|
| `EnrollmentAction(int studentID, int courseID)` | Tracks enrollment transactions |

## 🖥️ Uni.java (Main Application)

| Method | Description |
|--------|-------------|
| `main(String[] args)` | Entry point with menu system |

## 📊 UML Diagram
![UML Diagram](https://github.com/Farouk12385/UniversitySystem/blob/main/data%20UML.png)
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

