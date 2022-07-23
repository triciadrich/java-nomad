package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 7:
 *
 *      1) Create a custom exception.
 *      2) Demonstrate a method throwing your custom exception.
 */
public class Exercise_07 extends ArrayIndexOutOfBoundsException {
    @Override
    public  String toString() {
        return "Custom message";
    }
}
    class ex {
        public static void main(String[] args) {

            Exercise_07 exer = new Exercise_07();
            try {
                array();
            } catch (ArrayIndexOutOfBoundsException exc) {
                System.out.println(exer.toString());
            }
        }


        public static void array() throws ArrayIndexOutOfBoundsException {
            int[] array = {1, 2, 3, 4};
            System.out.println(array[10]);


        }
    }
