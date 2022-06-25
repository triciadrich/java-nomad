package labs_examples.arrays.labs;

/**
 * Arrays calculator
 *
 *      Take in 10 numbers from the user. Place the numbers in an array. Using the loop of your choice,
 *      calculate the sum of all of the numbers in the array as well as the average.
 *
 *      Print the results to the console.
 *
 */

public class Exercise_01 {

    public static void main(String[] args) {
    calcSumAvg(1,2,3,4,5,6,7,8,9,10);

    }
    public static void calcSumAvg(int num1, int num2, int num3, int num4, int num5, int num6, int num7, int num8, int num9, int num10){
        int[] array = {num1,num2,num3,num4,num5,num6,num7,num8,num9,num10};
        int sum = 0;
        double avg =0;

        for(int i = 0; i < array.length; i++){
            sum += i;
        }
        avg = sum / array.length;
        System.out.println("Sum = " + sum + " Average = " + avg);
    }


}