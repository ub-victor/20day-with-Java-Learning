package school;
import java.util.ArrayList;
import java.util.List;
import school.Course;

/**
 * Represents a student, extending Person.
 * Adds student ID, grade level, and a list of courses the student is enrolled in
 */

public class Student extends Person {
    private String studentId;
    private String gradeLevel;
    private List<Course> enrolledCourses;
    

    public Student(String name, int age, String address, String studentId, String gradeLevel) {
        super(name, age, address);
        this.studentId = studentId;
        this.gradeLevel = gradeLevel;
        this.enrolledCourses = new ArrayList<>();
    }


    public String getStudentId() {
        return studentId;
    }


    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }


    public String getGradeLevel() {
        return gradeLevel;
    }


    public void setGradeLevel(String gradeLevel) {
        this.gradeLevel = gradeLevel;
    }


    public List<Course> getEnrolledCourses() {
        return enrolledCourses;
    }


    public void setEnrolledCourses(List<Course> enrolledCourses) {
        this.enrolledCourses = enrolledCourses;
    }

    /**
     * Drops a course
     * @param course the course to drop
     */


   
}
