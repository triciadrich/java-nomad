package labs_examples.objects_classes_methods.labs.objects.Ex3;

public class Computer {

    private String type;
    private int year;
    private String brand;

    public Computer(String type, int year, String brand) {
        this.type = type;
        this.year = year;
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "type='" + type + '\'' +
                ", year=" + year +
                ", brand='" + brand + '\'' +
                '}';
    }
}
