package labs_examples.enumerations.labs;

/**
 * Enumerations Exercise 1:
 *
 *      1) Create an enumeration. Use a controller class to demonstrate the use of the enum from a seperate class.
 *      2) Create a parameterized enumeration that passes one or more values to it's constructor. Demonstrate the use
 *      of this enum from a seperate class.
 */
enum Planner{
    DAILY(60),WEEKLY(50),MONTHLY(40),ALLINONE(70);

    Planner(int price){
        this.price = price;
    }
    private final int price;
    public int getPrice(){
        return price;
    }
}
public class Exercise_01 {
    public static void main(String[] args) {
        for(Planner plan: Planner.values()){
            System.out.println(plan + " "  +"$" + plan.getPrice());
        }
    }



}
