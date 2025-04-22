public class Courses {
    
    int courseID;
    Courses nextCourse;
    int maxCapacity = 30; // Max amount of students that can join the course. FCDS project required 20-30 students. So I made it 30
    int currentEnrollment;  // To track the number of students currently enrolled in the chosen course

public Courses() {
    }
public Courses(int courseID) {
        this.courseID = courseID; // Initialize the courseID 
    }
public  Courses(int courseID, Courses nextCourse) {
        this.courseID = courseID;
        this.nextCourse = nextCourse; // Set nextCourse to the given value
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
