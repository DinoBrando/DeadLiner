package deadLiner;

import java.util.ArrayList;
import java.util.List;

public class CourseSection {
    private String identifier;
    private Course course;
    private Lecturer instructor;
    private List<Student> enrolledStudent;

    public CourseSection(String identifier, Course course, Lecturer instructor) {
        this.identifier = identifier;
        this.course = course;
        this.instructor = instructor;
        this.enrolledStudent = new ArrayList<>();
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Lecturer getInstructor() {
        return instructor;
    }

    public void setInstructor(Lecturer instructor) {
        this.instructor = instructor;
    }

    public List<Student> getEnrolledStudent() {
        return enrolledStudent;
    }

    public void addStudent(Student student) {
        enrolledStudent.add(student);
    }

    public void removeStudent(Student student) {
        enrolledStudent.remove(student);
    }
}
