package deadLiner;

import java.util.Date;

public class TaskHistory {
    private Date timestamp;
    private String description;

    public TaskHistory(Date timestamp, String description){
        this.timestamp = timestamp;
        this.description = description;
    }

    public String getDetails(){
        return description;
    }

    public Date getTimestamp() { 
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
