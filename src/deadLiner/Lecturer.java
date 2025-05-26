package deadLiner;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class Lecturer extends User{
    List<Task> createdTask;
    List<CourseSection>taughtSections;

    public Lecturer(String name) {
        super(name);
        this.createdTask = new ArrayList<>();
        this.taughtSections = new ArrayList<>();
    }

//    public void createAssignment(String title, Date dueDate, CourseSection section){
//        this.createdTask.add(new Task(title, dueDate, section));
//    }
    
//    public void gradeAssignment(Task task, String newStatus, Double grade){//accepted
//        if(createdTask.contains(task)){
//            task.updateStatus(newStatus);
//            task.setGrade(grade);
//        }
//    }

//    public void rejectAssignment(Task task, String newStatus){//rejected
//        if(createdTask.contains(task)){
//            task.updateStatus(newStatus);
//        }
//    }

    public List<CourseSection> getTaughtSections() {
        return taughtSections;
    }
    
    public List<Task> getCreatedTask() {
        return createdTask;
    }

    public void addTaughtSection(CourseSection section){
        this.taughtSections.add(section);
    }

    public void removeTaughtSection(CourseSection section){
        this.taughtSections.remove(section);
    }
}
