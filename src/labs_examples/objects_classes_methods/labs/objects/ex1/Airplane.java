package labs_examples.objects_classes_methods.labs.objects.ex1;

public class Airplane {


    double fuelCapacity;
    double currentFuelLevel;
    Engine engine;
    Seats seats;
    Wings wings;
    Type type;

    @Override
    public String toString() {
        return "Airplane{" +
                "fuelCapacity=" + fuelCapacity +
                ", currentFuelLevel=" + currentFuelLevel +
                ", engine=" + engine +
                ", seats=" + seats +
                ", wings=" + wings +
                ", type=" + type +
                '}';
    }

    public Airplane(double fuelCapacity, double currentFuelLevel, Engine engine, Seats seats, Wings wings, Type type) {
        this.fuelCapacity = fuelCapacity;
        this.currentFuelLevel = currentFuelLevel;
        this.engine = engine;
        this.seats = seats;
        this.wings = wings;
        this.type = type;


    }

    public static void main(String[] args) {
                Engine engine1 = new Engine("dual");
                Seats seats1 = new Seats("double", 100 );
                Wings wings1 = new Wings("Dual", 100);
                Type type1 = new Type("Commercial");
                Airplane air = new Airplane(30,30,engine1,seats1,wings1,type1);
        System.out.println(air.toString());
    }

}
