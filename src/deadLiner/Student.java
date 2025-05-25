package deadLiner;

import java.util.List;

public class Student extends User {
    List<Task> assignedTasks;
    List<CourseSection> enrolledSections;
    int preferredReminderTime = 24;
    Double grade;
}
