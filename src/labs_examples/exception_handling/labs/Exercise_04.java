package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 4:
 *
 *      Demonstrate a nested try/catch.
 *
 */
public class Exercise_04 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};

        try {
            System.out.println(array[11]);
        } catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println(exc.toString());
            try {
                System.out.println(array[1]);
            } catch (ArrayIndexOutOfBoundsException exc2) {
                System.out.println(exc2.toString());
            }
        }
    }
}