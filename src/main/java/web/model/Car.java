package web.model;

public class Car {
    private String carModel;
    private String carOwner;
    private int serialNumber;

    public Car() {
    }

    public Car(String carModel, String carOwner, int serialNumber) {
        this.carModel = carModel;
        this.carOwner = carOwner;
        this.serialNumber = serialNumber;
    }


    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCarOwner() {
        return carOwner;
    }

    public void setCarOwner(String carOwner) {
        this.carOwner = carOwner;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString(){
        return carModel + serialNumber + " owned by " + carOwner;
    }
}
