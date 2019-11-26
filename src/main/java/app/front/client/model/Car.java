package app.front.client.model;

public class Car {

    private Integer id;

    private String brand;
    private String model;
    private String imat;
    private String color;
    private Integer fraisAnnexe;
    private Integer fraisLocation;
    private Integer chevauxFiscaux;


    public Car (){}

    public Car(String model, String brand, Integer id,String imat, String color, Integer fraisAnnexe, Integer fraisLocation, Integer chevauxFiscaux) {
        this.model = model;
        this.brand = brand;
        this.id = id;
        this.imat = imat;
        this.color = color;
        this.fraisAnnexe = fraisAnnexe;
        this.fraisLocation = fraisLocation;
        this.chevauxFiscaux = chevauxFiscaux;

    }


    public String getBrand() {

        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getId() {

        return id;
    }

    public void setId(Integer id) {

        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getImat() {
        return imat;
    }

    public void setImat(String imat) {
        this.imat = imat;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getFraisAnnexe() {
        return fraisAnnexe;
    }

    public void setFraisAnnexe(Integer fraisAnnexe) {
        this.fraisAnnexe = fraisAnnexe;
    }

    public Integer getFraisLocation() {
        return fraisLocation;
    }

    public void setFraisLocation(Integer fraisLocation) {
        this.fraisLocation = fraisLocation;
    }

    public Integer getChevauxFiscaux() {
        return chevauxFiscaux;
    }

    public void setChevauxFiscaux(Integer chevauxFiscaux) {
        this.chevauxFiscaux = chevauxFiscaux;
    }
}
