package oslomet.motorvogn1;

public class Motorvogn {
    private String ssn;
    private String name;
    private String address;
    private String lPlate;
    private String brand;
    private String type;

    public Motorvogn(String ssn, String name, String address, String lPlate, String brand, String type){
        this.ssn = ssn;
        this.name = name;
        this.address = address;
        this.lPlate = lPlate;
        this.brand = brand;
        this.type = type;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLPlate() {
        return lPlate;
    }

    public void setLPlate(String lPlate) {
        this.lPlate = lPlate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
