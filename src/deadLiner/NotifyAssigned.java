package deadLiner;

public class NotifyAssigned implements INotification{
    @Override
    public void showNotification(String message, Task sourceTask, Student student) {
        System.out.println("Wahai "+student.getName()+"\nTugas"+sourceTask.getTitle()+
                "Telah Ditambahakn Jangan Lupa dikerjakan");
    }
}
