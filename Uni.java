
import java.util.Scanner;



class Uni {
    public static void main(String[] args) {
        ourbackend ourbackend = new ourbackend();
        




        while (true) {
        System.out.println("========================================================");
        System.out.println("          Welcome to the AFZ university system           ");
        System.out.println("          ====================================           ");
        System.out.println("          1- Add student                                 ");
        System.out.println("          2- Add course                                  ");
        System.out.println("          3- Remove student                              ");
        System.out.println("          4- Remove course                               ");
        System.out.println("          5- Get last student added                      ");
        System.out.println("          6- Get last course added                       ");
        System.out.println("          7- Enroll student in course                   ");
        System.out.println("          8- Remove enrollment                           ");
        System.out.println("          9- List course by student                      ");
        System.out.println("          10- List student by course                     ");
        System.out.println("          11- Sort courses by id                        ");
        System.out.println("          12- Sort student by id                         ");
        System.out.println("          13- If full course or not                      ");
        System.out.println("          14- Is normal student or not                   ");
        System.out.println("          15- Undo enrollment                            ");
        System.out.println("          16- Redo enrollment                            ");
        System.out.println("          17- Exit                                       ");
        System.out.println("========================================================");
        System.out.println("Please enter your choice: ");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch(choice) {
            case 1:
                // add student
                System.out.println("Please enter the student ID: ");
                int studentID = scanner.nextInt();
                ourbackend.addStudent(studentID);
                break;
            case 2:
                // add course
                System.out.println("Please enter the course ID: ");
                int courseID = scanner.nextInt();
                ourbackend.addCourse(courseID);
                break;
            case 3:
                // remove student
                System.out.println("Please enter the student ID to remove: ");
                int removeStudentID = scanner.nextInt();
                ourbackend.removeStudent(removeStudentID);
                break;
            case 4:
                // remove course
                System.out.println("Please enter the course ID to remove: ");
                int removeCourseID = scanner.nextInt();
                ourbackend.removeCourse(removeCourseID);
                break;
            case 5:
                // get last student added
                System.out.println("last Student added is: " + ourbackend.GetLaststudentadded());

                break;
            case 6:
                // get last course added
                System.out.println("last Course added is: " + ourbackend.GetLastCourseAdded());
                break;
            case 7:
                // enroll student in course
                System.out.println("Please enter the student ID to enroll: ");
                int enrollStudentID = scanner.nextInt();
                System.out.println("Please enter the course ID to enroll in: ");
                int enrollCourseID = scanner.nextInt();
                ourbackend.enrollStudentinCourse(enrollStudentID, enrollCourseID);
                break;
            case 8:
                // remove enrollment
                System.out.println("Please enter the student ID to remove enrollment: ");
                int removeEnrollmentStudentID = scanner.nextInt();
                System.out.println("Please enter the course ID to remove enrollment from: ");
                int removeEnrollmentCourseID = scanner.nextInt();
                ourbackend.removeEnrollment(removeEnrollmentStudentID, removeEnrollmentCourseID);
                break;
            case 9:
                // list course by student
                System.out.println("Please enter the student ID to list courses: ");
                int listCoursesStudentID = scanner.nextInt();
                ourbackend.listAllCoursesByStudent(listCoursesStudentID);
                break;
            case 10:
                // list student by course id
                System.out.println("Please enter the course ID to list students: ");
                int listStudentsCourseID = scanner.nextInt();
                ourbackend.listAllStudentsByCourse(listStudentsCourseID);
                break;
            case 11:
                // sort students by id
                System.out.println("Please enter the Student ID to sort enrolled students: ");
                int sortStudentID = scanner.nextInt();
                ourbackend.sortCourseID(sortStudentID);;
                break;
            case 12:
                // sort courses by id
                System.out.println("Please enter the courses ID to sort enrolled courses: ");
                int sortCourseID = scanner.nextInt();
                ourbackend.sortStudentID(sortCourseID);
                break;
            case 13:
                // if full course or not
                System.out.println("Please enter the course ID to check if full: ");
                int checkFullCourseID = scanner.nextInt();
                boolean isFull = ourbackend.isFullCourse(checkFullCourseID);
                break;
            case 14:
                // is normal student or not
                System.out.println("Please enter the student ID to check if normal: ");
                int checkNormalStudentID = scanner.nextInt();
                boolean isNormal = ourbackend.isNormalStudent(checkNormalStudentID);
                break;
            case 15:
                // undo enrollment
                ourbackend.undoEnrollment();
                System.out.println("Undo enrollment successful.");
                break;
            case 16:
                // redo enrollment
                ourbackend.redoEnrollment();
                System.out.println("Redo enrollment successful.");

                break;
            case 17:
                System.out.println("Thank you for using the AFZ university system");
                System.exit(0);
        }


    }
}

}
