/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernet_embeddable;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Sanket
 */
@Entity
public class Student_Sai 
{
    String Name;
    @Id
    String phone;
    String emailID;
    String University;
    String RoomNo;
    String Tech;
    //DAte
    String Status;

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmailID() {
        return emailID;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

    public String getUniversity() {
        return University;
    }

    public void setUniversity(String University) {
        this.University = University;
    }

    public String getRoomNo() {
        return RoomNo;
    }

    public void setRoomNo(String RoomNo) {
        this.RoomNo = RoomNo;
    }

    public String getTech() {
        return Tech;
    }

    public void setTech(String Tech) {
        this.Tech = Tech;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }
    
    
}
