package deadLiner;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Task {
    public enum TaskStatus {
        ASSIGNED,
        SUBMITTED,
        OVERDUE,
        GRADED
    }

    private String title;
    private Date dueDate;
    private int priority; //1-3
    private Student asignee;
    private TaskStatus status;
    private String course; //temp
    private Double grade;
    private String description;
    private List<TaskHistory> history;
        
    public Task(String title, String course ,Date dueDate, String description) {
        this.title = title;
        this.dueDate = dueDate;
        this.course = course;
        this.description = description;
        this.status = TaskStatus.ASSIGNED;
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

    public void markComplete(){
        this.status = TaskStatus.SUBMITTED;
    }

    public TaskStatus getStatus() {
        return this.status;
    }
    
    public String getStrStatus() {
        switch (status) {
            case TaskStatus.ASSIGNED ->{
                return "Assigned";
            }case TaskStatus.SUBMITTED -> {
                return "Submitted";
            }case TaskStatus.OVERDUE ->{
                return "Overdue";
            }case TaskStatus.GRADED ->{
                return "Graded";
            }default ->{
                return null;
            }
        }
    }


    public void updateStatus(TaskStatus status) {
        this.status = status;
    }

    public Student getAsignee() {
        return asignee;
    }

    public void setAsignee(Student asignee) {
        this.asignee = asignee;
    }

    public String getCourse() {
        return this.course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
    
    public Double getGrade() {
        return grade;
    }

    public void setGrade(Double grade) {
        this.grade = grade;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void addHistory(TaskHistory entry){
        if(entry !=null){
            history.add(entry);

        }
    }

    public List<TaskHistory> getHistory(){
        return history;
    }

    

}
