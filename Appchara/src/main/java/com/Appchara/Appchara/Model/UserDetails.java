package com.Appchara.Appchara.Model;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.OneToOne;

@Entity
public class UserDetails {
    @Id
    @GeneratedValue
    private Long id;
    private String userId;
    private String mobileNum;
    private String address;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinTable(name = "user_userdetail", 
      joinColumns = 
        { @JoinColumn(name = "user_detail_id", referencedColumnName = "Id") },
      inverseJoinColumns = 
        { @JoinColumn(name = "user_id", referencedColumnName = "Id") })
    private UserAuth user;


    UserDetails() {}

    public UserDetails(String userId,  String mobileNum, String address) {
        this.userId = userId;
        this.mobileNum = mobileNum;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public String getUserId() {
        return userId;
    }

    public String getMobileNum() {
        return mobileNum;
    }

    public String getAddress() {
        return address;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setMobileNum(String mobileNum) {
        this.mobileNum = mobileNum;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public UserAuth getUser() {
        return user;
    }

    public void setUser(UserAuth user) {
        this.user = user;
    }
    
}