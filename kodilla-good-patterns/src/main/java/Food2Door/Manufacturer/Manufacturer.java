package Food2Door.Manufacturer;

public class Manufacturer {

    private String manufacturerName;

    public Manufacturer(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    @Override
    public String toString() {
        return "Manufacturer{" + "manufacturerName='" + manufacturerName + '\'' + '}';
    }
}
