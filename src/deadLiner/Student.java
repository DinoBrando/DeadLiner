package deadLiner;

import java.util.ArrayList;
import java.util.List;

public class Student extends User {
    List<Task> assignedTasks;
    List<CourseSection> enrolledSections;
    int preferredReminderTime;

    public Student(String name) {
        super(name);
        this.assignedTasks = new ArrayList<>();
        this.enrolledSections = new ArrayList<>();
        this.preferredReminderTime = 24;
    }

    public void recieveNewAssignment(Task task){
        this.assignedTasks.add(task);
    }
    
    public void submitAssignment(Task task){
        task.markComplete();
    }

    public List<Task> getAssignedTask(){
        return this.assignedTasks;
    }

    public int getPreferredReminderTime(){
        return this.preferredReminderTime;
    }
    
    public void setPreferredReminderTime(int preferredReminderTime){
        this.preferredReminderTime = preferredReminderTime;
    }
    
    public List<CourseSection> getEnrolledList(){
        return this.enrolledSections;
    }

    public void enrollInSection(CourseSection section){
        this.enrolledSections.add(section);
    }

    public void leaveSection(CourseSection section){
        this.enrolledSections.remove(section);
    }

    public void manageTaskPriority(Task task, int newPriority){
        if(assignedTasks.contains(task)){
            task.setPriority(newPriority);
        }else{
            throw new IllegalArgumentException("There is no such task.");
        }
    }

}
