/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernet_embeddable;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Sanket
 */
@Entity
public class TaskOfStudent 
{
    @Id
    String phoneNo;
    String completedTask;
    String targetTask;
    String currentDate;
    String remarks;

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getCompletedTask() {
        return completedTask;
    }

    public void setCompletedTask(String completedTask) {
        this.completedTask = completedTask;
    }

    public String getTargetTask() {
        return targetTask;
    }

    public void setTargetTask(String nextTask) {
        this.targetTask = nextTask;
    }

    public String getCurrentDate() {
        return currentDate;
    }

    public void setCurrentDate(String currentDate) {
        this.currentDate = currentDate;
    }
    
}
