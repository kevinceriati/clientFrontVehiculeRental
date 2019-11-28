package app.front.client.form;

public class CarDateForm {

    private int car;
    private String beginDate;
    private String endDate;

    public CarDateForm() {}

    public CarDateForm(String beginDate, String endDate) {
        this.car = car;
        this.beginDate = beginDate;
        this.endDate = endDate;
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
}