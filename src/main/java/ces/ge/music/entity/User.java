package ces.ge.music.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class User {

    private String userId;
    private String userName;
    private String phone;
    @JsonIgnore
    private String password;
    private String avator;
    private String token;
    private char gender;

    public User() {
    }

    public User(String userId, String userName, String phone, String password, String avator, String token, char gender) {
        this.userId = userId;
        this.userName = userName;
        this.phone = phone;
        this.password = password;
        this.avator = avator;
        this.token = token;
        this.gender = gender;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAvator() {
        return avator;
    }

    public void setAvator(String avator) {
        this.avator = avator;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", phone='" + phone + '\'' +
                ", password='" + password + '\'' +
                ", avator='" + avator + '\'' +
                ", token='" + token + '\'' +
                ", gender=" + gender +
                '}';
    }
}
