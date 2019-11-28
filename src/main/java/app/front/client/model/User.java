package app.front.client.model;

import java.util.*;

public class User {

    private int id;
    private String userName;
    private String firstName;
    private Date birthDate;
    private String licence;
    private Date graduatedAt;

    public User() {
    }

    public User(int id, String userName, String firstName, Date birthDate, String licence, Date graduatedAt) {
        this.id = id;
        this.userName = userName;
        this.firstName = firstName;
        this.birthDate = birthDate;
        this.licence = licence;
        this.graduatedAt = graduatedAt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getLicence() {
        return licence;
    }

    public void setLicence(String licence) {
        this.licence = licence;
    }

    public Date getGraduatedAt() {
        return graduatedAt;
    }

    public void setGraduatedAt(Date graduatedAt) {
        this.graduatedAt = graduatedAt;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", birthDate=" + birthDate +
                ", licence='" + licence + '\'' +
                ", graduatedAt=" + graduatedAt +
                '}';
    }
}
