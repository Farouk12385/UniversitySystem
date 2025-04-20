public class Courses {
    
    int courseID;
    Courses nextCourse;

public Courses() {
        this.nextCourse = null;
    }
public Courses(int courseID) {
        // Initialize the courseID
        // and set nextCourse to null
        this.courseID = courseID;
        this.nextCourse = null;
    }
public  Courses(int courseID, Courses nextCourse) {
        // Initialize the courseID
        // and set nextCourse to the given value
        this.courseID = courseID;
        this.nextCourse = nextCourse;
    }
    public void addStudent(int studentID) {
        // Add a student to the course
        if (this.nextCourse == null) {
            this.nextCourse = new Courses(studentID);
        } else {
            this.nextCourse.addStudent(studentID);
        }
    }

}
