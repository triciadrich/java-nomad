package labs_examples.generics.labs;

/**
 * Generics Exercise 2:
 *
 *      Create a class with a generic method that takes in an ArrayList of any Numeric type and returns the sum of all
 *      Numbers in the ArrayList. Demonstrate how to call this method from the main() method.
 */

class Demo{
    public static void main(String[] args) {
        Integer[] intArray = {1,2,3,4};
        System.out.println(sumArray(intArray));
        Double[] doblArray = {1.2,2.3,3.4,4.5};
        System.out.println(sumArray(doblArray));
    }

    public static <T extends Number> int  sumArray(T[] array){
        int sum = 0;
        for (T t : array) {
            sum += t.intValue();
        }
        return sum;


    }
}