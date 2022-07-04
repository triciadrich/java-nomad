package labs_examples.objects_classes_methods.labs.objects.ex1;

public class Seats {
    private String type;
    private int seatingCapacity;

    public Seats(String type, int seatingCapacity) {
        this.type = type;
        this.seatingCapacity = seatingCapacity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    public void setSeatingCapacity(int seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }

    @Override
    public String toString() {
        return "Seats{" +
                "type='" + type + '\'' +
                ", seatingCapacity=" + seatingCapacity +
                '}';
    }
}
