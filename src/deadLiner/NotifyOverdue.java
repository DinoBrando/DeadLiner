package deadLiner;

public class NotifyOverdue implements INotification{
    @Override
    public void showNotification(String message, Task sourceTask, Student student) {
        System.out.println("WAHAI "+student.getName()+"\nTUGASMU "+sourceTask.getTitle()+" DAH LEWAT TENGGAT MAMPUS!");
    }
}
