package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 2:
 *
 *      Demonstrate a try/catch with multiple catch statements.
 *
 */

public class Exercise_02 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4};
        int a = 6;
        int b = 9;
        int div = 0/1;


        try{
            System.out.println(array[2]);
            System.out.println(div);


        }catch(ArrayIndexOutOfBoundsException | ArithmeticException exc){
            System.out.println(exc.toString());
        }
    }
}

