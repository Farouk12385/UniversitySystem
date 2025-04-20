
import java.util.Scanner;
/*
    teams
    1-farook-nabil-ibrahim"not exsist bec ahmed ez fezamanoooo"
    methods
        1-add student  "done"
        2-add course   "done"
        3-remode student "done"
        4-remove course "done"
        5-get last student added"done"
        6-get last course added"done"
        15-undo enrollment stack
    2-zeyad-ayman-farouk-rashad(mmultiverse)
        7-enrool student in course
        8-removeenrollment
        9-list course by sstudent
        10-list student by course
        11-sort students by id
    3-aly amr-adham-hassouna
    methods+
        main
        12-sort courses by id
        13-if full course or not
        14-is normal student or not
        16-redo enrollment stack
        
    */
    
    //---------------------------------------------------------------------------
    
    /* method to implements
    1- add student=>add new student to the list of students linked list
    2- add course=>add new course to the list of courses linked list
    3- remove student=>remove student from the list of students linked list
    4- remove course=>remove course from the list of courses linked list
    5- get last student added=>return the id of the last student added to the list of students
    6- get last course added=>return the id of the last course added to the list of courses
    7- enroll student in course=>enroll student in the course update the both lists
    8- remove enrollment=>remove the enrollment of the student from the course
    9- list course by student=>list all the courses that the student is enrolled in
    10- list student by course=>list all the students that are enrolled in the course
    11- sort students by id=>sort the list of students by id
    12- sort courses by id=>sort the list of courses by id
    13- if full course or not=>check if the course is full or not
    14- is normal student or not=>check if the student is normal or not
    15-undo enrollment=>undo the enrollment of the student from the course "stack"
    16- redo enrollment=>redo the enrollment of the student in the course "stack"

    to make some funny games "method to flex"
     */
    //---------------------------------------------------------------------------------------



class Uni {
    public static void main(String[] args) {
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
        System.out.println("          11- Sort students by id                        ");
        System.out.println("          12- Sort courses by id                         ");
        System.out.println("          13- If full course or not                      ");
        System.out.println("          14- Is normal student or not                   ");
        System.out.println("          15- Undo enrollment                            ");
        System.out.println("          16- Redo enrollment                            ");
        System.out.println("          17- Exit                                       ");
        System.out.println("========================================================");
        System.out.println("Please enter your choice: ");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                // add student
                break;
            case 2:
                // add course
                break;
            case 3:
                // remove student
                break;
            case 4:
                // remove course
                break;
            case 5:
                // get last student added
                break;
            case 6:
                // get last course added
                break;
            case 7:
                // enroll student in course
                break;
            case 8:
                // remove enrollment
                break;
            case 9:
                // list course by student
                break;
            case 10:
                // list student by course
                break;
            case 11:
                // sort students by id
                break;
            case 12:
                // sort courses by id
                break;
            case 13:
                // if full course or not
                break;
            case 14:
                // is normal student or not
                break;
            case 15:
                // undo enrollment
                break;
            case 16:
                // redo enrollment
                break;
            case 17:
                System.out.println("Thank you for using the AFZ university system");
                System.exit(0);
        }


    }
}

