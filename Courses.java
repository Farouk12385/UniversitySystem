public class Courses {
    
    int courseID;
    Courses nextCourse;
    int maxCapacity; // Max amount of students that can join the course. FCDS project required 20-30 students. So I made it 30.
    int currentEnrollment;  // To track the number of students currently enrolled in the chosen course. 

public Courses() {
        this.nextCourse = null;
        this.maxCapacity = 30;  // 30 as chosen by Dr. Doaa
        this.currentEnrollment = 0;  // Initial value, untill a student is added later on. 
    }
public Courses(int courseID) {
        // Initialize the courseID
        // and set nextCourse to null
        this.courseID = courseID;
        this.nextCourse = null;
        this.maxCapacity = 30;  
        this.currentEnrollment = 0;  
    }
public  Courses(int courseID, Courses nextCourse) {
        // Initialize the courseID
        // and set nextCourse to the given value
        this.courseID = courseID;
        this.nextCourse = nextCourse;
        this.maxCapacity = 30;  
        this.currentEnrollment = 0;  
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
