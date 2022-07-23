package labs_examples.exception_handling.labs;

import java.util.Arrays;

/**
 * Exception Handling Exercise 5:
 *
 *      Demonstrate how to throw an exception.
 *
 */

class Example {

    public static void main(String[] args) {
        try{
            array();
        }catch(ArrayIndexOutOfBoundsException exc){
            System.out.println(exc.toString());
        }
    }

    public static void array() throws ArrayIndexOutOfBoundsException{
        int [] array = {1,2,4,5};
        System.out.println(array[10]);
    }

}