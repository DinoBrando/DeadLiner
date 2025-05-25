package deadLiner;

import java.util.List;

public class Lecturer extends User{
    List<Task> createdTask;
    List<CourseSection>taughSections;

    public Lecturer(String id, String name, List<Task> createdTask, List<CourseSection> taughSections) {
        super(id, name);
        this.createdTask = createdTask;
        this.taughSections = taughSections;
    }

    public List<Task> getCreatedTask() {
        return createdTask;
    }

    public void setCreatedTask(List<Task> createdTask) {
        this.createdTask = createdTask;
    }

    public List<CourseSection> getTaughSections() {
        return taughSections;
    }

    public void setTaughSections(List<CourseSection> taughSections) {
        this.taughSections = taughSections;
    }
    public void addTaughSection(CourseSection section){
        addTaughSection(section);
    }
    public void removeTaughSection(CourseSection section){
        removeTaughSection(section);
    }
}
