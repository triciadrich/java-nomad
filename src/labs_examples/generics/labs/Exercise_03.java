package labs_examples.generics.labs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * Generics Exercise 3:
 *
 *      1) Write a generic method that accepts two generic arguments. This generic method should only accept
 *      arguments which are sublasses of Number. The generic method must return the sum (as a double) of whatever two
 *      numbers were passed in regardless of their type.
 *
 *      2) Write a generic method to count the number of elements in a "Collection" of Strings that are palindromes

 *      3) Write a generic method to exchange the positions of two different elements in an array.
 *
 *      4) Write a generic method to find the largest element within the range (begin, end) of a list.
 *
 */

public class Exercise_03 {
    public static void main(String[] args) {
        Integer[] intArray = {1,2,3,4};
      System.out.println(sum(1,2));
        Collection<String> collection =
                new ArrayList<String>(Arrays.asList("wow", "deed", "leel"));
        count(collection);
        switchSpots(intArray,2,3);
        System.out.println("");
        findMax(intArray, 0,3);

    }

    public static <T extends Number, V extends T> double sum(T val1, V val2){//sum off 2 numbers returned as double
        return (Double)val2.doubleValue() + val1.doubleValue();
    }

    public static <T> void count(Collection<T> collection){
        int count = 0;

        for (T elem: collection){
            count++;
        }
        System.out.println(count);
    }

    public static <E> void switchSpots(E[] array, int elem1, int elem2){

        E temp = array[elem1];
        array[elem1] = array[elem2];
        array[elem2] = temp;
        for (E elem: array){
            System.out.print(elem);
        }

    }

    public static <T extends Number> void findMax(T[] array, int begin, int end){
        int max = 0;
        for (T elem: array
             ) {
            if(elem.intValue() > max){
                max = elem.intValue();
        }

        }
        System.out.println(max);
    }


}