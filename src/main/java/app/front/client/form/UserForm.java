package app.front.client.form;

import java.util.*;

public class UserForm {

    private String userName;
    private String firstName;
    private String lastName;
    private Date birthDate;
    private String licence;
    private Date GraduatedAt;

    public UserForm() {
    }

    public UserForm(String userName, String firstName, String lastName, Date birthDate, String licence, Date graduatedAt) {
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.licence = licence;
        GraduatedAt = graduatedAt;
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

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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
        return GraduatedAt;
    }

    public void setGraduatedAt(Date graduatedAt) {
        GraduatedAt = graduatedAt;
    }

    @Override
    public String toString() {
        return "UserForm{" +
                "userName='" + userName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate=" + birthDate +
                ", licence='" + licence + '\'' +
                ", GraduatedAt=" + GraduatedAt +
                '}';
    }
}