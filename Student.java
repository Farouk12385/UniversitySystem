class Student {
    int studentID;
    int courseCount;
    Student nextStudent;
    int[] enrolledCourses = new int[7]; // Assuming a student can enroll in up to 7 courses

    public Student(int studentID) {
        this.studentID = studentID;
        this.courseCount = 0;
        this.nextStudent = null;
        

    }


    
    public Student(int studentID, Student nextStudent) {
        this.studentID = studentID;
        this.courseCount = 0;
        this.nextStudent = nextStudent;


    }



    public boolean isEnrolledInCourse(int courseID) {
        for (int i = 0; i < courseCount; i++) {
            if (enrolledCourses[i] == courseID) {
                return true;
            }
        }
        return false;
    }

    public void addCourse(int courseID) {
        if (courseCount < 7) {
            enrolledCourses[courseCount++] = courseID;
        }
    }

   public void removeCourse(int courseID) {
        for (int i = 0; i < courseCount; i++) {
            if (enrolledCourses[i] == courseID) {
                // Shift remaining courses to fill the gap
                for (int j = i; j < courseCount - 1; j++) {
                    enrolledCourses[j] = enrolledCourses[j + 1];
                }
                courseCount--;
                break;
            }
        }

    }
}
