package labs_examples.objects_classes_methods.labs.methods;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class MethodTraining {
    public static void main(String[] args) {
        System.out.println(largest(20,10,15,2));
        System.out.println(largest(13,4,5,30,32));
        Person tricia = new Person("Tricia", 41);
        Person brian = new Person("Brian", 43);
        tricia.addAge(tricia);
        System.out.println(tricia.toString());
        System.out.println(countc("worde"));
        System.out.println(isPrime(12));
        System.out.println(isPrime(11));
        System.out.println(Arrays.toString(highestLowest(new int[]{11, 2, 3, 10})));
        System.out.println(zeroMaxNum(100,5,4).size());
        System.out.println(Arrays.toString(reverse(new int[]{5, 4, 3, 2, 1})));



    }



    // 3) Create a method that will return the largest of 4 numbers (all of which are passed in as arguments)
    public static int largest(int a, int b, int c, int d){
        int large = 0;
        int[] nums = {a,b,c,d};
        for (int i = 0; i < nums.length; i ++){
            if (nums[i] > large){
                large = nums[i];
            }

        }
        return large;
    }
    // 1) Demonstrate method overloading in this class
    public static int largest(int a, int b, int c, int d, int e){
        //overloads first largest method with an extra parameter
        int large = 0;
        int[] nums = {a,b,c,d,e};
        for (int i = 0; i < nums.length; i ++){
            if (nums[i] > large){
                large = nums[i];
                i++;
            }

        }
        return large;
    }
    //4) Write a method to count all consonants (the opposite of vowels) in a String
    public static int countc(String word){
        int count = 0;
        for (int i = 0; i <word.length(); i++){
            if (word.charAt(i) != 'a' && word.charAt(i) != 'e' && word.charAt(i) != 'i' && word.charAt(i) != 'o' && word.charAt(i) != 'u') {
                count++;
            }

        }

        return  count;
    }

    // 5) Write a method that will determine whether or not a number is prime

    public static boolean isPrime(int num){

           for (int i = 2; i<num/2; i++){
               if (num%i ==0){
                   return false;
               }
           }


        return true;
    }

    //6) Write a method that will return a small array containing the highest and lowest numbers in a given numeric array,
    //            which is passed in as an argument

    public static int[] highestLowest(int [] array){
        int min= array[0];
        int max = array[0];


        for(int i = 1; i < array.length; i ++) {
            if (array[i] > max) {
                max = array[i];

            } else if (array[i] < min) {
                min = array[i];

            }


        }
        return new int[]{min,max};

    }

 //7) Write a method that takes 3 arguments (int maxNum, int divisor1, int divisor2) and returns an Integer Arraylist.
    //        In this method create an Integer ArrayList and populate it with each number between zero and maxNum that is
    //        divisible by both divisor1 and divisor2. Then return this ArrayList. After calling this method, print out the
    //        length of the returned list


    public static ArrayList<Integer> zeroMaxNum(int maxNum, int divisor1, int divisor2 ){
        ArrayList<Integer> zeroMax = new ArrayList<>();
         for (int i = 1; i < maxNum; i++){
             if (i % divisor1 == 0 && i % divisor2 == 0){
                 zeroMax.add(i);
             }
         }

        return  zeroMax;
    }

    // 8) Write a method that will reverse an array in place use only one extra temp variable. For this exercise you cannot
    //        instantiate a second array. You must reverse the array in place using only one extra temp variable. Hint: this
    //        variable is used to temporarily store individual values in the array

    public static int[] reverse(int[] rev){
        int temp= 0;
            for (int i= 0; i < rev.length/2; i++){
               temp = rev[i];
               rev[i]=rev[rev.length-1 -i];
               rev[rev.length-1-i]=temp;
            }

        return rev;

    }

    // 2) Demonstrate the difference between "pass by value" and "pass by reference"
    public static class Person{
        int age = 41;
        String name = "";

        public Person(String name, int age) {//pass by value
            this.age = age;
            this.name = name;

        }
        public void addAge(Person name){
            name.age += 1;

        }

        @Override
        public String toString() {
            return "Person{" +
                    "age=" + age +
                    ", name='" + name + '\'' +
                    '}';
        }




    }

}
