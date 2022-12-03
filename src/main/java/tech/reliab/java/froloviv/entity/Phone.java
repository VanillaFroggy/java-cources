package tech.reliab.java.froloviv.entity;

public class Phone {
    private PhoneType phoneType;
    private double screenDiagonal;
    private int batteryCapacity;
    private String housingMaterial;
    private String memorySize;

    public Phone(PhoneType phoneType, double screenDiagonal, int batteryCapacity, String housingMaterial, String memorySize) {
        this.phoneType = phoneType;
        this.screenDiagonal = screenDiagonal;
        this.batteryCapacity = batteryCapacity;
        this.housingMaterial = housingMaterial;
        this.memorySize = memorySize;
    }

    public PhoneType getPhoneType() {
        return phoneType;
    }

    public void setPhoneType(PhoneType phoneType) {
        this.phoneType = phoneType;
    }

    public double getScreenDiagonal() {
        return screenDiagonal;
    }

    public void setScreenDiagonal(double screenDiagonal) {
        this.screenDiagonal = screenDiagonal;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public String getHousingMaterial() {
        return housingMaterial;
    }

    public void setHousingMaterial(String housingMaterial) {
        this.housingMaterial = housingMaterial;
    }

    public String getMemorySize() {
        return memorySize;
    }

    public void setMemorySize(String memorySize) {
        this.memorySize = memorySize;
    }

    @Override
    public String toString() {
        return "Телефон {" +
                "Марка телефона = " + phoneType +
                ", Диагональ экрана = " + screenDiagonal +
                ", Объём аккумулятора = " + batteryCapacity +
                ", Материал изготовления = '" + housingMaterial + '\'' +
                ", Объём памяти = " + memorySize +
                '}';
    }
}
