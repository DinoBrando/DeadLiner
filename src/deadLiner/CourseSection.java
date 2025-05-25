package deadLiner;

import java.util.ArrayList;
import java.util.List;

public class CourseSection {
    private String idenrifier;
    private Course course;
    private Lecturer instructor;
    private List<Student> enrolledStudent;

    public CourseSection(String idenrifier, Course course, Lecturer instructor) {
        this.idenrifier = idenrifier;
        this.course = course;
        this.instructor = instructor;
        this.enrolledStudent = new ArrayList<>();
    }

    public String getIdenrifier() {
        return idenrifier;
    }

    public void setIdenrifier(String idenrifier) {
        this.idenrifier = idenrifier;
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
        if (student != null) {
            enrolledStudent.add(student);
        }
    }

    public void removedStudent(Student student) {
        enrolledStudent.remove(student);
    }
}
