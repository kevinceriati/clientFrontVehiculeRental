package app.front.client.model;

import java.util.*;

public class Reservation {

    private int id;
    private int user;
    private int car;
    private Date beginDate;
    private Date endDate;

    public Reservation () {}

    public Reservation (int id, int user, int car, Date begining, Date end) {
        this.id = id;
        this.user = user;
        this.car = car;
        this.begining = begining;
        this.end = end;
    }
}
