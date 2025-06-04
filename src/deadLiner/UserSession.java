package deadLiner;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class UserSession {
    public static Student currentStudent = new Student("-");
    public static Lecturer currentLecturer = new Lecturer("-");
    
    
    public static List<Task> taskList = new ArrayList<>();
    
        
    public static String[] getTaskDetails(int x){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM HH:mm");
        String formatted = taskList.get(x).getDueDate().format(formatter);

        return new String[] {taskList.get(x).getTitle(), taskList.get(x).getCourse(), formatted, taskList.get(x).getStrStatus()};
    }
    
    public static void addTask(Task task) {
        taskList.add(task);
    }
    
    public static Integer getTask(String name){
        for(int i = 0;i<taskList.size();i++){
            if(taskList.get(i).getTitle().equalsIgnoreCase(name)){
                return i;
            }
        }
            return null;
    }
        

    
}
