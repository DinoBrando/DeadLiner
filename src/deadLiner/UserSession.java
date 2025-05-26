package deadLiner;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class UserSession {
    public static Student currentStudent = new Student("-");
    public static Lecturer currentLecturer = new Lecturer("-");
    
    public static List<Task> taskList = new ArrayList<>();
    
        
    public static String[] getTaskDetails(int x){
        SimpleDateFormat sdf = new SimpleDateFormat("dd MMM yyyy");
        String formattedDeadline = sdf.format(taskList.get(x).getDueDate());
        
        return new String[] {taskList.get(x).getTitle(), taskList.get(x).getCourse(), formattedDeadline, taskList.get(x).getStrStatus()};
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
