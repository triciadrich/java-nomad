package labs_examples.generics.labs;

/**
 * Generics Exercise 1:
 *
 *      1.) Write a generic class with at least two instance variables, a constructor, and getter and setter methods.
 *      2.) Create a few objects of your generic class with different data types to demonstrate it's
 *          dynamic usage.
 */

public class Exercise_01 <T>{

    private T val;
    private T val2;


    public Exercise_01(T val, T val2) {
        this.val = val;
        this.val2 = val2;
    }

    public T getVal() {
        return val;
    }

    public void setVal(T val) {
        this.val = val;
    }

    public T getVal2() {
        return val2;
    }

    public void setVal2(T val2) {
        this.val2 = val2;
    }

    public static void main(String[] args) {
        Exercise_01<Number> ex1 = new Exercise_01<Number>(2,2.1);

    }
}

