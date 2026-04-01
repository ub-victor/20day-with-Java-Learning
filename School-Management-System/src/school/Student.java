package school;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a student, extending Person.
 * Adds student ID, grade level, and a list of courses the student is enrolled in
 */
public class Student extends Person {
    private String studentId;
    private String gradeLevel;  // e.g., "9th", "10th"
    private List<Course> enrolledCourses;
    
    public Student(String name, int age, String address, String studentId, String gradeLevel,
            List<Course> enrolledCourses) {
        super(name, age, address);
        this.studentId = studentId;
        this.gradeLevel = gradeLevel;
        this.enrolledCourses = new ArrayList<>(); 
     }
     
}