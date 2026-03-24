package school;
import java.util.ArrayList;
import java.util.List;

/**
 * Represents a student, extending Person.
 * Adds student ID, grade level, and a list of courses the student is enrolled in
 */

public class Student extends Person {
    private String studentId;
    private String gradeLevel;
    private List<Course> enrolledCourses;

    public Student(String name, int age, String address, String studentId, String gradeLevel, String ){
        super(name, age, address);
    }


    
}
