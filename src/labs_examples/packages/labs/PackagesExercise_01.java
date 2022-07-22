package labs_examples.packages.labs;


import labs_examples.packages.labs.package2.Class1;
import labs_examples.packages.labs.package3.Class2;

public class PackagesExercise_01 {
    public static void main(String[] args) {
        Class1 class1 = new Class1();
        class1.class1Msg2();
        Class2 class2 = new Class2();
        class2.class2Msg2();

    }
}
/**
 * Packages Exercise 1: Protected modifier
 *
 *      1) Within this package, create two new labs_examples.packages.
 *      2) Create a new Java class in each package.
 *      3) Create at least two methods in each class, with at least one with the protected access modifier
 *      4) Demonstrate how the the protected access modifier restricts access from package to package
 *
 */
