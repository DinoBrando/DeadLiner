package deadLiner;

import java.util.ArrayList;
import java.util.List;

public class UserSession {
    public static Student currentStudent = new Student("-");
    public static Lecturer currentLecturer = new Lecturer("-");
    List<Task>taskList=new ArrayList<>();
}
