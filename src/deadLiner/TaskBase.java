/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deadLiner;

import java.util.Date;

/**
 *
 * @author USER
 */
abstract class TaskBase{
   private String  title;
    private Date dueDate;
    private int priority;
   private String status;
    private INotifiable assignee ;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public TaskBase(String title, Date dueDate, int priority, String status, INotifiable assignee  ){
        this.title=title;
        this.dueDate=dueDate;
        this.status=status;
        this.priority=priority;
        this.assignee=assignee;
    }
    public void markComplete(){
        this.status="Selesai";
    }
    public void updateStatus(String newStatus){
        this.status=newStatus;
    }
    public String getTitle(){
        return title;
    }

    public int getPriority() {
        return priority;
    }
    public Date getDueDate(){
        return dueDate;
    }
    public String getStatus(){
        return status;
    }
    public INotifiable getAssignee(){
        return assignee;
    }
    public void setAssignee(INotifiable assignee){
        this.assignee=assignee;
    }
}


