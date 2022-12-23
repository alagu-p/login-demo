package com.login.logindemo.dto;


public class UserDto {
  
    private int userid;
    private String username;
    private String email;
    private int phone;
    
    public UserDto(int userid, String username, String email, int phone) {
        this.userid = userid;
        this.username = username;
        this.email = email;
        this.phone = phone;
    }

    public UserDto() {
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "UserDto [userid=" + userid + ", username=" + username + ", email=" + email + ", phone=" + phone + "]";
    }
    

}
