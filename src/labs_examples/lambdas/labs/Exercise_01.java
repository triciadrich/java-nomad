package labs_examples.lambdas.labs;
import java.util.function.BiFunction;
import java.util.function.Predicate;
/**
 * Lambdas Exercise 1:
 *
 *      1) Demonstrate creating a functional interface with an abstract method that takes no parameters and returns void
 *      2) Implement the previous functional interface with a lambda expression and use it. Also demonstrate creating
 *          an anonymous inner class from this interface.
 *
 *      3) Demonstrate creating a functional interface with an abstract method that takes 1 parameter and returns a
 *          value of the same type as the parameter
 *      4) Implement the previous functional interface with a lambda expression and use it. Also demonstrate creating
 *          an anonymous inner class from this interface.
 *
 *      5) Demonstrate creating a functional interface with an abstract method that takes 2 parameters and returns a
 *          value
 *      6) Implement the previous functional interface with a lambda expression and use it. Also demonstrate creating
 *          an anonymous inner class from this interface.
 *
 *      7) Demonstrate the use of at least two built-in functional interfaces from the java.util.function package.
 *
 *
 *
 *
 */

@FunctionalInterface
public interface Exercise_01 {
    public void printout();
}

@FunctionalInterface
interface oneParam{
     int param(int a);
}

@FunctionalInterface
interface twoParam{
    int paramTwo(int a, int b);
}
class ex1{
    public static void main(String[] args) {
        Exercise_01 lambda = () -> System.out.println("Hello lambda");
        Exercise_01 annoninner = new Exercise_01() {
            @Override
            public void printout() {
                System.out.println("Hello annon inner class");
            }
        };
        lambda.printout();
        annoninner.printout();


        oneParam lambda2 = (int a) ->{
            return a * 2;
        };
        System.out.println("I'm a lambda " + lambda2.param(2));
        oneParam annoninner2 = new oneParam() {
            @Override
            public int param(int a) {
                return a * 2;
            }
        };
        System.out.println("Im an annon inner class " + annoninner2.param(2));




        twoParam lambda3 = (int a, int b) ->{
          return a + b;
        };
        System.out.println("Lambda 3 with 2 params " + lambda3.paramTwo(1,2));

        twoParam anoninner3 = new twoParam() {
            @Override
            public int paramTwo(int a, int b) {
                return a + b;
            }
        };
        System.out.println("Annon Inner 3 with 2 params " + anoninner3.paramTwo(1,2));

        Predicate<Integer> moreThan = (i) -> (i > 10);
        BiFunction<Integer,Integer, Integer> add = (t,u) ->{
          return t * u;
        };
        System.out.println(moreThan.test(2));
        System.out.println(add.apply(1,2));
    }
}
