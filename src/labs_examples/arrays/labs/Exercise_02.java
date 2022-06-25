package labs_examples.arrays.labs;

/**
 *  More labs_examples.arrays
 *
 *      Using the array below, take in a number from 1-10 from the user and print out the index of that
 *      element.
 *
 */

public class Exercise_02 {

    public static void main(String[] args) {

    index(2);




    }
    public static void index(int num){
    int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        for(int i = 0; i < array.length; i ++ ){
            if (array[i] == num){
                System.out.println(i);
            }
        }

    }
}