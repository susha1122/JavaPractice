/*
Design a Course class.
• Instance variables: courseName, enrolledStudents.
• Static variable: maxCapacity, the maximum number of students for any 
course.
• Instance methods: enrollStudent(String studentName), 
unenrollStudent(String studentName).
• Static method: setMaxCapacity(int capacity), to set the maximum 
capacity for courses.
*/
package challenges;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Challenge52 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Initialize courses
        Course cs = new Course("Computer Science");
        Course ai = new Course("Artificial Intelligence");
        Course ml = new Course("Machine Learning");
        
        Course[] courseList = {cs, ai, ml};
        Course.setMaxCapacity(10); // Set shared capacity for all

        System.out.print("Enter your name: ");
        String studentName = input.nextLine();

        // Use any course instance to start the enrollment logic
        cs.enrollmentLogic(studentName, courseList);
        input.close();
    }
}

class Course {
    String courseName;
    static int maxCapacity;
    List<String> enrolledStudents = new ArrayList<>();

    // Constructor to set course name
    Course(String name) {
        this.courseName = name;
    }

    static void setMaxCapacity(int capacity) {
        maxCapacity = capacity;
    }

    void enrollmentLogic(String studentName, Course[] courseList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Available Courses:");
        for (int i = 0; i < courseList.length; i++) {
            System.out.println((i + 1) + ". " + courseList[i].courseName);
        }

        System.out.print("Enter the name of the course you want to join: ");
        String selected = scanner.nextLine();

        boolean found = false;
        for (Course course : courseList) {
            // Check if the input matches this specific course's name
            if (course.courseName.equalsIgnoreCase(selected)) {
                course.enrollStudent(studentName); // Add name to THIS course's list
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Course not found.");
        }
    }

    void enrollStudent(String studentName) {
        if (enrolledStudents.size() < maxCapacity) {
            enrolledStudents.add(studentName);
            System.out.println("Successfully enrolled in " + courseName);
        } else {
            System.out.println("Course is full!");
        }
    }
    
}

/* 
courseName = ComputerScience
courseName = Aritical Intelligence and Data Science
coursename = Electronic, Electrical and Engineering

studentName = 

select course 
print all the course
select one course
do you want to enrol? yes-----
                              |- thanks for enrolling
                              |- save to enrolledStudent
                      no------
                      |- save to unenrolledStudent
                      |- do you want to try other courses? yes
                                                          |- 

*/