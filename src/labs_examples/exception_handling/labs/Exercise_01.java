package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 1:
 *
 *      1) Demonstrate a try/catch.
 *
 */
public class Exercise_01 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4};

        try{
            System.out.println(array[10]);

        }catch(ArrayIndexOutOfBoundsException exc){
            System.out.println(exc.toString());
        }


    }



}
