package com.example.gym.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Uid;
    private String Uname;
    private String Umail;

    public Long getUid() {
        return Uid;
    }
    public void setUid(Long uid) {
        Uid = uid;
    }
    public String getUname() {
        return Uname;
    }
    public void setUname(String uname) {
        Uname = uname;
    }
    public String getUmail() {
        return Umail;
    }
    public void setUmail(String umail) {
        Umail = umail;
    }
 

}