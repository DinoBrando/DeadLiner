package deadLiner;

public class NotifyBeforeDue implements INotification{
    @Override
    public void showNotification(String message, Task sourceTask, Student student){
        System.out.println("WAHAI "+student.getName()+"\nTugasmu "+sourceTask.getTitle()+" Hampir Tenggat WOI");
    }
}
