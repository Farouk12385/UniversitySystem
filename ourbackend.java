
import java.util.Scanner;
import java.util.Stack;

public class ourbackend {
    Student headstudent;
    Courses headcourse;
    int laststudentID;
    int lastcourseID;
    Scanner Scanner = new Scanner(System.in);
    Stack<EnrollmentAction> undostack = new Stack<>();
    Stack<EnrollmentAction> redostack = new Stack<>();
    




//100 done
public boolean verfiyStudent(int studentID) {
    /*
    this method to check if the student is already in the list or not

    */
    
    Student current = headstudent;// small is refrence type -large S is class Student
    while (current != null) {
        if (current.studentID == studentID) {// to check if student id is exsist
            return true;
            }
            current = current.nextStudent;
        }
        return false;
    }





//100 done
public void addStudent(int studentID) {
    /*
    this method to add new student and check if this student is already in the list or not
    singly linked list
    */
    while(verfiyStudent(studentID) || studentID <= 0) { // to check if student id is valid or not from method verifyStudent
        if(studentID <= 0) {
            System.out.println("Student ID invalid. Please enter a valid ID:");
        } else {
            System.out.println("Student ID already exists. Please enter a valid ID:");
        }
        studentID = Scanner.nextInt();
    }
    // if the list is empty
    // create a new student and set it as the head of the list
    // and set the last student id to the student id
    if (headstudent == null) {
        headstudent = new Student(studentID); // to create new Student from class and student id is primitive int type
        System.out.println("Student ID " + studentID + " added successfully.");
    } else {
        headstudent = new Student(studentID, headstudent); // to create new Student from class and student
        System.out.println("Student ID " + studentID + " added successfully.");

        
    }

    laststudentID = studentID; // to know the last student id
    


}




//100 done
public void removeStudent(int studentID) {
    /*
        this method to remove student
        singly linked list
         */
        if (!verfiyStudent(studentID)) { // Use verify method to check if the student exists
            System.out.println("Student id " + studentID + " not found");
            return;
        }
        if (headstudent.studentID == studentID) { // Check if the head student is the one to be removed
            headstudent = headstudent.nextStudent; // Update head to the next student
            System.out.println("Student id " + studentID + " removed successfully");
            return;
        }
        Student current = headstudent; // Start from the head of the list
        while (current.nextStudent != null) { // Traverse the list to find the student
            if (current.nextStudent.studentID == studentID) { // If found, remove the student
                current.nextStudent = current.nextStudent.nextStudent;
                System.out.println("Student id " + studentID + " removed successfully");
                return;
            }
            current = current.nextStudent;
        }
}





//100 done
public int GetLaststudentadded() {
    /*
        this method to get the last student added using the verify method
        */
        if (!verfiyStudent(laststudentID)) {
            System.out.println("There's no student ");
            return -1;
        }
        return laststudentID;
}



//--------------------------------------------------------------------------------------------------
//100 done
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



//------------------------------------------------------------

//100 done
public void addCourse(int courseID) {
    /*
    this method to add new course and check if this course is already in the list or not
    singly linked list
    */
    while(verfiyCourse(courseID) || courseID <= 0) { // to check if course id is valid or not from method verifycourse
        if( courseID <= 0) {
            System.out.println("Course ID invalid. Please enter a valid ID:");
        } else {
            System.out.println("Course ID already exists. Please enter a valid ID:");
        }
        courseID = Scanner.nextInt();
    }
    // if the list is empty
    // create a new student and set it as the head of the list
    // and set the last student id to the student id
    if (headcourse == null) {
        headcourse = new Courses(courseID); // to create new Student from class and student id is primitive int type
        System.out.println("Course ID " + courseID + " added successfully.");
    } else {
        headcourse = new Courses(courseID, headcourse); // to create new course from class and course
        System.out.println("Course ID " + courseID + " added successfully.");
        }
    lastcourseID =  courseID; // to know the last student id
}





//100 done
public void removeCourse(int courseID) {
    /*
    this method to remove course
    singly linked list
     */
    if (!verfiyCourse(courseID)) { // Use verify method to check if the course exists
        System.out.println("course id " + courseID + " not found");
        return;
    }
    if (headcourse.courseID == courseID) { // Check if the head course is the one to be removed
        headcourse = headcourse.nextCourse; // Update head to the next student
        System.out.println("course id " + courseID + " removed successfully");
        return;
    }
    Courses current = headcourse; // Stxart from the head of the list
    while (current.nextCourse != null) { // Traverse the list to find the student
        if (current.nextCourse.courseID == courseID) { // If found, remove the student
            current.nextCourse = current.nextCourse.nextCourse;
            System.out.println("course id " + courseID + " removed successfully");
            return;
        }
        current = current.nextCourse;
    
    }
    
}


//100 done
public int GetLastCourseAdded() {
    /*
    this method to get the last course added using a for loop
    */
    if (!verfiyCourse(lastcourseID)) {
        System.out.println("There's no Course ");
        return -1;
    }

    return lastcourseID;
}


//----------------------------------------------------------------------------------------------------
public void enrollStudentinCourse(int studentID, int courseID) {
    /*
    this method to enroll student in course
     */
    Student current = headstudent; // starting from the head of the student.
    Courses currentCourse = headcourse; // starting from the head of the course.
    // check if the course is full or not
    if (isFullCourse(courseID)) {
        System.out.println("Course is full. Cannot enroll student.");
        return;
    }

    // check if the student and course exist
    if (!verfiyStudent(studentID) || !verfiyCourse(courseID)) {
        System.out.println("Student or course not found.");
        return;
    }
    //to check if the student is already enrolled in the course
    while (current != null) {
        if (current.studentID == studentID && current.isEnrolledInCourse(courseID)) { // Check if the student is already enrolled in the course
            System.out.println("Student is already enrolled in this course.");
            return;
        }
        current = current.nextStudent;
    }

    Student currentStudent = headstudent; // starting from the head of the student.
    while (currentStudent != null) {
        if (currentStudent.studentID == studentID) {
            if (currentStudent.courseCount >= 7) { // Check if the student is already enrolled in 7 courses
                System.out.println("Student is already enrolled in 7 courses. Cannot enroll in more.");
                return;
            }
            currentStudent.addCourse(courseID); // Increment the course count for the student
            break;
        }
        currentStudent = currentStudent.nextStudent;
    }
    // enroll the student in the course
    while (currentCourse != null) {
        if (currentCourse.courseID == courseID) {
            currentCourse.currentEnrollment++;
            System.out.println("Student " + studentID + " enrolled in course " + courseID);
            undostack.push(new EnrollmentAction(studentID, courseID)); // Push the action to the undo stack
            redostack.clear(); // Clear the redo stack
            return;
        }
        currentCourse = currentCourse.nextCourse;
    }
    System.out.println("Failed to enroll student. Either student or course not found.");
}

//-----------------------------------------------------------------------------------------------
public void removeEnrollment(int studentID, int courseID) {
    /*
    this method to remove enrollment
     */
    Student current = headstudent; // starting from the head of the student.
    Courses currentCourse = headcourse; // starting from the head of the course.
    // check if the student and course exist
    if (!verfiyStudent(studentID) || !verfiyCourse(courseID)) {
        System.out.println("Student or course not found.");
        return;
    }
    // Check if the student is already enrolled in the course
    boolean enrollmentFound = false;
    while (current != null) {
        if (current.studentID == studentID && current.isEnrolledInCourse(courseID)) {
            current.removeCourse(courseID); // Remove the course from the student's enrollment
            enrollmentFound = true;
            break;
        }
        current = current.nextStudent;
    }

    if (!enrollmentFound) {
        System.out.println("Student " + studentID + " is not enrolled in course " + courseID);
        return;
    }

    // Remove the student from the course
    while (currentCourse != null) {
        if (currentCourse.courseID == courseID) {
            currentCourse.currentEnrollment--;
            System.out.println("Student " + studentID + " removed from course " + courseID);
            undostack.push(new EnrollmentAction(studentID, courseID)); // Push the action to the undo stack
            redostack.clear(); // Clear the redo stack
            return;
        }
        currentCourse = currentCourse.nextCourse;
    }

    System.out.println("Course not found.");
}

//--------------------------------------------------------------------------------------------

//---------------------------------------------------------------------------------------------
public void listAllCoursesByStudent(int studentID) {
    if (!verfiyStudent(studentID)) {
        System.out.println("Student with ID " + studentID + " not found.");
        return;
    }

    Student currentStudent = headstudent;
    while (currentStudent != null) {
        System.out.println("Checking student ID: " + currentStudent.studentID); // Debug
        if (currentStudent.studentID == studentID) {
            System.out.println("Courses enrolled by Student ID " + studentID + ":");
            if (currentStudent.courseCount == 0) {
                System.out.println("No courses enrolled.");
            } else {
                for (int i = 0; i < currentStudent.courseCount; i++) {
                    System.out.println("Course ID: " + currentStudent.enrolledCourses[i]);
                }
            }
            return;
        }
        currentStudent = currentStudent.nextStudent;
    }

    System.out.println("Student with ID " + studentID + " not found.");
}


//---------------------------------------------------------------------------------


public void listAllStudentsByCourse(int courseID) {
    if (!verfiyCourse(courseID)) { // Use verify method to check if the course exists
        System.out.println("Course with ID " + courseID + " not found.");
        return;
    }

    System.out.println("Students enrolled in Course ID " + courseID + ":");
    Student currentStudent = headstudent;
    boolean found = false;

    while (currentStudent != null) {
        System.out.println("Checking student ID: " + currentStudent.studentID); // Debug
        if (currentStudent.isEnrolledInCourse(courseID)) {
            System.out.println("Student ID: " + currentStudent.studentID);
            found = true;
        }
        currentStudent = currentStudent.nextStudent;
    }

    if (!found) {
        System.out.println("No students are enrolled in Course ID " + courseID + ".");
    }
}



//----------------------------------------------------------------------
//----------------------------------------------------------------------
public void sortStudentID(int courseID) {
    /*
     * this method to sort the List of students in ascending order by course id and display
     */
    if (!verfiyCourse(courseID)) {
        System.out.println("Course with ID " + courseID + " not found.");
        return;
    }

    // First, count how many students are enrolled in this course
    int count = 0;
    Student current = headstudent;
    while (current != null) {
        if (current.isEnrolledInCourse(courseID)) {
            count++;
        }
        current = current.nextStudent;
    }

    if (count == 0) {
        System.out.println("No students enrolled in course " + courseID);
        return;
    }

    // Create an array to hold the student IDs
    int[] studentIDs = new int[count];
    int index = 0;
    current = headstudent;
    while (current != null) {
        if (current.isEnrolledInCourse(courseID)) {
            studentIDs[index++] = current.studentID;
        }
        current = current.nextStudent;
    }

    // Sort the array using bubble sort (simple implementation)
    for (int i = 0; i < count - 1; i++) {
        for (int j = 0; j < count - i - 1; j++) {
            if (studentIDs[j] > studentIDs[j + 1]) {
                // Swap
                int temp = studentIDs[j];
                studentIDs[j] = studentIDs[j + 1];
                studentIDs[j + 1] = temp;
            }
        }
    }

    // Display the sorted list
    System.out.println("Students enrolled in course " + courseID + " (sorted by ID):");
    for (int id : studentIDs) {
        System.out.println(id);
    }
}

//---------------------------------------------------------------------------
public void sortCourseID(int studentID) {
    /*
     * this method to sort the List of courses in ascending order by student id and display
     */
    if (!verfiyStudent(studentID)) {
        System.out.println("Student with ID " + studentID + " not found.");
        return;
    }

    // Find the student
    Student currentStudent = headstudent;
    while (currentStudent != null) {
        if (currentStudent.studentID == studentID) {
            break;
        }
        currentStudent = currentStudent.nextStudent;
    }

    if (currentStudent == null || currentStudent.courseCount == 0) {
        System.out.println("Student " + studentID + " is not enrolled in any courses.");
        return;
    }

    // Get the enrolled courses
    int[] courseIDs = new int[currentStudent.courseCount];
    for (int i = 0; i < currentStudent.courseCount; i++) {
        courseIDs[i] = currentStudent.enrolledCourses[i];
    }

    // Sort the array using bubble sort
    for (int i = 0; i < courseIDs.length - 1; i++) {
        for (int j = 0; j < courseIDs.length - i - 1; j++) {
            if (courseIDs[j] > courseIDs[j + 1]) {
                // Swap
                int temp = courseIDs[j];
                courseIDs[j] = courseIDs[j + 1];
                courseIDs[j + 1] = temp;
            }
        }
    }

    // Display the sorted list
    System.out.println("Courses enrolled by student " + studentID + " (sorted by ID):");
    for (int id : courseIDs) {
        System.out.println(id);
    }
}



//------------------------------------------------------------------------------------
public boolean isFullCourse(int courseID) {
    /*
        this method to check if a course is full or not
    */
    if (!verfiyCourse(courseID)) { // Use verify method to check if the course exists
        System.out.println("Course with ID " + courseID + " not found.");
        return false; // Return false if the course is not found
    }
    Courses current = headcourse; // Start from the head of the course list
    while (current != null) {
        if (current.courseID == courseID) { // Check if the current course matches the course ID
            if (current.currentEnrollment >= 30) { // Check if the course is full or not
                System.out.println("Course ID " + courseID + " is full.");
                return true; // Course is full
            } else {
                System.out.println("Course ID " + courseID + " is not full. Current enrollment: " + current.currentEnrollment);
                return false; // Course is not full
            }
        }
        current = current.nextCourse; // Move to the next course in the list
    }
    System.out.println("Course with ID " + courseID + " not found.");
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
            if (current.courseCount >= 2 && current.courseCount <= 7) { // Check if the student is enrolled in 2-7 courses
                System.out.println("Student ID " + studentID + " is a normal student.");
                return true; // Student is normal
            } else {
                System.out.println("Student ID " + studentID + " is not a normal student. Current courses enrolled by ID: " + current.courseCount);
                return false; // Student is not normal
            }
        }
        current = current.nextStudent;
    }
    System.out.println("Student with ID " + studentID + " not found.");
    return false; // Return false if the student is not found

}


//----------------------------------------------------------------

// Update isFullCourse status after undoEnrollment
public void undoEnrollment() {
    if (undostack.isEmpty()) {
        System.out.println("No actions to undo.");
        return;
    }

    EnrollmentAction action = undostack.pop();
    int studentID = action.studentID;
    int courseID = action.courseID;

    // Reverse the enrollment directly
    Student currentStudent = headstudent;
    while (currentStudent != null) {
        if (currentStudent.studentID == studentID) {
            currentStudent.removeCourse(courseID);
            break;
        }
        currentStudent = currentStudent.nextStudent;
    }

    Courses currentCourse = headcourse;
    while (currentCourse != null) {
        if (currentCourse.courseID == courseID) {
            currentCourse.currentEnrollment--;
            // Check and update if the course is full
            isFullCourse(courseID);
            break;
        }
        currentCourse = currentCourse.nextCourse;
    }

    // Add to redo stack
    redostack.push(action);
}

// Update isFullCourse status after redoEnrollment
public void redoEnrollment() {
    if (redostack.isEmpty()) {
        System.out.println("No actions to redo.");
        return;
    }

    EnrollmentAction action = redostack.pop();
    int studentID = action.studentID;
    int courseID = action.courseID;

    // Reapply the enrollment directly
    Student currentStudent = headstudent;
    while (currentStudent != null) {
        if (currentStudent.studentID == studentID) {
            currentStudent.addCourse(courseID);
            break;
        }
        currentStudent = currentStudent.nextStudent;
    }

    Courses currentCourse = headcourse;
    while (currentCourse != null) {
        if (currentCourse.courseID == courseID) {
            currentCourse.currentEnrollment++;
            // Check and update if the course is full
            isFullCourse(courseID);
            break;
        }
        currentCourse = currentCourse.nextCourse;
    }

    // Add to undo stack
    undostack.push(action);

    // Check and update the student's normal status
    isNormalStudent(studentID);
}


//-------------------------------------------------------------------
}
// for redo and undo
class EnrollmentAction {
    int studentID;
    int courseID;

    EnrollmentAction(int studentID, int courseID) {
        this.studentID = studentID;
    this.courseID = courseID;
    }
}

// Define the Student class with required methods

