package deadLiner;
import java.util.Date;
public class TaskHistory {
    Date timestamp;
    String description;

    public TaskHistory(Date timestamp, String description){
        this.description=description;
        this.timestamp=timestamp;
    }
    public String getDetails(){
        return timestamp+description;
    }

}
