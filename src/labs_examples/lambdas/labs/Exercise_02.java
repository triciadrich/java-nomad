package labs_examples.lambdas.labs;
import java.util.function.*;
/**
 * Lambdas Exercise 2:
 *
 *      1) Demonstrate the use of 10 pre-built Functional Interfaces from the java.util.functions package. That's right,
 *      10 of them! You can do it! You'll know so much about them when you're done!
 *
 */

public class Exercise_02 {
    public static void main(String[] args) {
        Consumer<String> printSomething = System.out::println;
        printSomething.accept("printing something");

        Supplier<String> getSomething = () -> {
            return("getting something");
        };
        getSomething.get();

        BiFunction<Double, Double, Double> divideSomething = (a,  b) -> (a / b);
        System.out.println(divideSomething.apply(2.3,4.2));
    }
}