package deadLiner;
import javax.management.Notification;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class Task extends TaskBase {
    private String category;
    private List<TaskHistory>history;
    private NotificationManager  notificationManager;

    public void setCategory(String category) {
        this.category = category;
    }

    public void setHistory(List<TaskHistory> history) {
        this.history = history;
    }

    public NotificationManager getNotificationManager() {
        return notificationManager;
    }

    public void setNotificationManager(NotificationManager notificationManager) {
        this.notificationManager = notificationManager;
    }

    public Task(String title, Date dueDate, int priority, String status, INotifiable assignee, String category, NotificationManager notificationManager) {
        super(title, dueDate, priority, status, assignee);
        this.category = category;
        this.notificationManager = notificationManager;
        this.history = new ArrayList<>();
    }
    public void SendReminder(){
        if (getAssignee()!=null && notificationManager != null){
            notificationManager.sendNotification(getAssignee(), "Tugas"+getTitle()+"is due on "+ getDueDate());
        }
    }
    public void addHistory(TaskHistory entry){
        if(entry !=null){
            history.add(entry);

        }
    }
    public List<TaskHistory>getHistory(){
        return history;
    }
    public String getCategory(){
        return category;
    }
}
