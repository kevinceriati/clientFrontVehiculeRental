package app.front.client.model;

import java.util.*;

public class Reservation {

    private int id;
    private int user;
    private int car;
    private Date beginDate;
    private Date endDate;

    public Reservation () {}

    public Reservation (int id, int user, int car, Date beginDate, Date endDate) {
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

    public Date getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    public Date getEndDate() {
        return endDate;
    }
}
