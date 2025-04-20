public class Student {
    // Instance variables
    // studentID is the ID of the student
    // nextStudent is a reference to the next student in the list
    // It is null if there is no next student
int studentID;// ID of the student
Student nextStudent;// reference to the next student
public Student() {
    this.nextStudent = null;
}
public Student(int StudentID) {
    // Initialize the StudentID
    // and set nextStudent to null
    this.studentID = StudentID;
    this.nextStudent = null;
}
public Student (int studentID, Student nextStudent) {
    // Initialize the StudentID
    // and set nextStudent to the given value
    this.studentID = studentID;
    this.nextStudent = nextStudent;
}
public void addcourse(int course) {
    // Add a course to the student
    if (this.nextStudent == null) {
        this.nextStudent = new Student(course);
    } else {
        this.nextStudent.addcourse(course);
    }

}
}
