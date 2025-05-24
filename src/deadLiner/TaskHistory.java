package deadLiner;
import java.util.Date;
public class TaskHistory {
 private    Date timestamp;
 private   String description;

    public TaskHistory(Date timestamp, String description){
        this.description=description;
        this.timestamp=timestamp;
    }
    public String getDetails(){
        return timestamp+description;
    }

    public Date getTimestamp() { 
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
