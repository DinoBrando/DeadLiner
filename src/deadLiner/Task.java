package deadLiner;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class Task {
    private String title;
    private Date dueDate;
    private int priority; //1-3
    private String status;
    private Student asignee;
    private CourseSection courseSection;
    private Double grade;
    private List<TaskHistory> history;
    
    public Task(String title, Date dueDate, CourseSection courseSection) {
        this.title = title;
        this.dueDate = dueDate;
        this.courseSection = courseSection;
        this.history = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Student getAsignee() {
        return asignee;
    }

    public void setAsignee(Student asignee) {
        this.asignee = asignee;
    }

    public CourseSection getCourseSection() {
        return courseSection;
    }

    public void setCourseSection(CourseSection courseSection) {
        this.courseSection = courseSection;
    }

    public Double getGrade() {
        return grade;
    }

    public void setGrade(Double grade) {
        this.grade = grade;
    }

    public void addHistory(TaskHistory entry){
        if(entry !=null){
            history.add(entry);

        }
    }

    public List<TaskHistory>getHistory(){
        return history;
    }

    

}
