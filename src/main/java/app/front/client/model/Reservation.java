package app.front.client.model;

import java.util.*;

public class Reservation {

    private int id;
    private int user;
    private int car;
    private String beginDate;


    private String endDate;

    public Reservation () {}

    public Reservation(int car, String beginDate, String endDate) {
        this.car = car;
        this.beginDate = beginDate;
        this.endDate = endDate;
    }

    public Reservation(int id, int user, int car, String beginDate, String endDate) {
        this.id = id;
        this.user = user;
        this.car = car;
        this.beginDate = beginDate;
        this.endDate = endDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUser() {
        return user;
    }

    public void setUser(int user) {
        this.user = user;
    }

    public int getCar() {
        return car;
    }

    public void setCar(int car) {
        this.car = car;
    }

    public String getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(String beginDate) {
        this.beginDate = beginDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Reservation{" + "id=" + id + ", user=" + user + ", car=" + car + ", beginDate=" + beginDate + ", endDate=" + endDate + '}';
    }
}
