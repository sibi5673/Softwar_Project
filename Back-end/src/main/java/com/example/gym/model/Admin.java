package com.example.gym.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Admin {

   @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Aid;
    private String Aname;
    private String Aemail;
    private String Apass;

    public String getApass() {
        return Apass;
    }
    public void setApass(String apass) {
        Apass = apass;
    }
    public Long getAid() {
        return Aid;
    }
    public void setAid(Long aid) {
        Aid = aid;
    }
    public String getAname() {
        return Aname;
    }
    public void setAname(String aname) {
        Aname = aname;
    }
    public String getAemail() {
        return Aemail;
    }
    public void setAemail(String aemail) {
        Aemail = aemail;
    }
    
}
