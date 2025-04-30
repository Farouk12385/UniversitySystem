public class Courses {
    
    int courseID;
    Courses nextCourse; 
    int currentEnrollment;  // To track the number of students currently enrolled in the chosen course.

    public Courses() {
        this.nextCourse = null;
        this.currentEnrollment = 0; // Initialize enrollment to 0
    }

    public Courses(int courseID) {
        /*
        Initialize the courseID
        and set nextCourse to null
        */
        this.courseID = courseID;
        this.nextCourse = null;
        this.currentEnrollment = 0; // Initialize enrollment to 0
    }

    public Courses(int courseID, Courses nextCourse) {
        /*
        Initialize the courseID
        and set nextCourse to the given value
         */
        this.courseID = courseID;
        this.nextCourse = nextCourse;
        this.currentEnrollment = 0; // Initialize enrollment to 0
    }

    public void addStudent(int studentID) {
        // Increment the current enrollment count
        this.currentEnrollment++;
    }
    public boolean isStudentEnrolled(int studentID) {
        // Check if the student is enrolled in this course
        // This is a placeholder implementation
        return false;
    }
}

