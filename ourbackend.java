
import java.util.Scanner;
import java.util.Stack;

public class ourbackend {
    Student headstudent;
    Courses headcourse;
    int laststudentID;
    int lastcourseID;
    Stack undostack = new Stack();
    Scanner Scanner = new Scanner(System.in);
    Stack redostack = new Stack();
public void addStudent(int studentID) {
    /*
    this method to add new studen and check if this student is already in the list or not
    singly linked list
    */
    studentID = Scanner.nextInt();// student id is paramtive int type
    while(verfiyStudent(studentID)|| studentID<=0) {//to check if student id is valid or not from method verfitstudent
        if(studentID<=0){
        System.out.println("student id  invalid id pls enter a valid id");
        }else{
        System.out.println("student id already exists pls enter a valid id");
        }
        studentID = Scanner.nextInt();
    }
            //if the list is empty
        //create a new student and set it as the head of the list
        //and set the last student id to the student id
    if (headstudent == null) {
        headstudent = new Student(studentID);// to create new Student from class and student id is paramtive int type
        
    } else {
        headstudent = new Student(studentID,headstudent);// to create new Student from class and student

    }

    laststudentID = studentID;//to know the last student id
    undostack.push(studentID);//to add student id to the stack
    System.out.println("Student id " + studentID + " added successfully");
    //stack when add stack
}
public void removeStudent(int studentID) {
    /*
    this method to remove student
    singly linked list
     */
    if (headstudent == null) {//to check if the student esist then print 
        System.out.println("There's no student ");
        return;
    }
    if (headstudent.studentID == studentID) {//to check if studemt esist then removed it
        headstudent = headstudent.nextStudent;//// small is refrence type -large S is class Student
        System.out.println("Student id " + studentID + " removed successfully");
        return;
    }
    Student current = headstudent;// small is refrence type -large S is class Student
    while (current.nextStudent != null) {// to make loop to find student id that l want to remove from mid 
        if (current.nextStudent.studentID == studentID) {//if student esist remove it
            current.nextStudent = current.nextStudent.nextStudent;
            System.out.println("Student id " + studentID + " removed successfully");
            return;
        }
        current = current.nextStudent;
    }
    System.out.println("Student id " + studentID + " not found");//else there not student print 
}

public boolean verfiyStudent(int studentID) {
    //this method to check if the student is already in the list or not
    Student current = headstudent;// small is refrence type -large S is class Student
    while (current != null) {
        if (current.studentID == studentID) {// to check if student id is exsist
            return true;
        }
        current = current.nextStudent;
    }
    return false;
}
public int GetLaststudentadded() {
    /*
    this method to get the last student added using a for loop
    */
    if (headstudent == null) {
        System.out.println("There's no student ");
        return -1;
    }
    for (Student current = headstudent; current != null; current = current.nextStudent) {
        laststudentID = current.studentID;
    }
    return laststudentID;
}
//--------------------------------------------------------------------------------------------------
public void addCourse(int courseID) {
    /*
    this method to add new course and check if this course is already in the list or not
    singly linked list
    */
    courseID = Scanner.nextInt();// student id is paramtive int type
    while(verfiyStudent(courseID)|| courseID<=0) {//to check if student id is valid or not from method verfitstudent
        if(courseID<=0){
        System.out.println("student id  invalid id pls enter a valid id");
        }else{
        System.out.println("student id already exists pls enter a valid id");
        }
        courseID = Scanner.nextInt();
    }
            //if the list is empty
        //create a new student and set it as the head of the list
        //and set the last student id to the student id
    if (headcourse == null) {
        headcourse = new Courses(courseID);// to create new Student from class and student id is paramtive int type
        
    } else {
        headcourse = new Courses(courseID,headcourse);// to create new Student from class and student

    }

    laststudentID = courseID;//to know the last student id
    undostack.push(courseID);//to add student id to the stack
    System.out.println("course id " + courseID + " added successfully");
    //stack when add stack
}
public void removeCourse(int courseID) {
    /*
    this method to remove course
    singly linked list
     */
    if (headcourse == null) {//to check if the course esist then print 
        System.out.println("There's no course ");
        return;
    }
    if (headcourse.courseID == courseID) {//to check if course esist then removed it
        headcourse = headcourse.nextCourse;//headcourse is refrence type
        System.out.println("Course id " + courseID + " removed successfully");
        return;
    }
    Courses current = headcourse;// small is refrence type -large S is class Student
    while (current.nextCourse != null) {// to make loop to find course id that l want to remove from mid 
        if (current.nextCourse.courseID == courseID) {//if course esist remove it
            current.nextCourse = current.nextCourse.nextCourse;
            System.out.println("Course id " + courseID + " removed successfully");
            return;
        }
        current = current.nextCourse;
    }
    System.out.println("Course id " + courseID + " not found");//else there not student print 
}


public boolean verfiyCourse(int courseID) {
    //this method to verify if the course esist or not
    Courses current = headcourse;
    while (current != null) {
        if (current.courseID == courseID) {
            return true;
        }
        current = current.nextCourse;
    }
    return false;
}
public int getLastCourseAdded() {
    /*
    this method to get the last course added using a for loop
    */
    if (headcourse == null) {
        System.out.println("There's no course found");
        return -1;
    }
    for (Courses current = headcourse; current != null; current = current.nextCourse) {
        lastcourseID = current.courseID;
    }
    return lastcourseID;
}
//----------------------------------------------------------------------------------------------------
public void enrollStudentInCourse(int studentID, int courseID) {
    /*
    this method to enroll student in course
     */


}
//-----------------------------------------------------------------------------------------------
public void removeEnrollment(int studentID, int courseID) {
    /*
    this method to remove enrollment
     */
}
//--------------------------------------------------------------------------------------------
public void listCourseByStudent(int studentID) {
    /*
    this method to list course by student
     */
}
public void listStudentByCourse(int courseID) {
    /*
    this method to list student by course
     */
}
//----------------------------------------------------------------------
public void sortStudentsByID() {
    /*
    this method to sort students by id
     */
}
//---------------------------------------------------------------------------
public void sortCoursesByID() {
    /*
    this method to sort courses by id
     */
}
//------------------------------------------------------------------------------------
public void isFullCourse(int courseID) {
    /*
    this method to check if the course is full or not
     */
    Courses current = headcourse; // starting from the head of te course.

    while (current != null) {
        if (current.courseID == courseID) { // To check if the current course matches the course ID entered
            if (current.currentEnrollment >= current.maxCapacity) { // To check if it has reached the full capacity
                System.out.println("Course ID " + courseID + " is full.");
            } else {
                System.out.println("Course ID " + courseID + " is not full. Current enrollment: " + current.currentEnrollment + " out of " + current.maxCapacity);
            }
            return true; // Course found

        }
        current = current.nextCourse;
    }

    System.out.println("Course with ID " + courseID + " not found.");
    return false; // Return false if the course is not found
}
//------------------------------------------------------------
public boolean isNormalStudent(int studentID) {
    /*
    this method to check if the student is normal or not
     */
    Student current = headstudent; // starting from the head of the student.
    while (current != null) {
        if (current.studentID == studentID) { // To check if the current student matches the student ID entered
            if (current.nextStudent == null) { // To check if it has reached the full capacity
                System.out.println("Student ID " + studentID + " is a normal student.");
            } else {
                System.out.println("Student ID " + studentID + " is not a normal student. Current enrollment: " + current.nextStudent.studentID);
            }
            return true; // Student found

        }
        current = current.nextStudent;
    }
    System.out.println("Student with ID " + studentID + " not found.");
    return false; // Return false if the student is not found

}
//----------------------------------------------------------------
public void undoEnrollment() {
    /*
    this method to undo enrollment
     */

}
//--------------------------------------------------------------------
public void redoEnrollment() {
    /*
    this method to redo enrollment
     */
}
//-------------------------------------------------------------------
}
