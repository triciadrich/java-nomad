package labs_examples.conditions_loops.labs;

/**
 * Conditions and Loops Exercise 11: Nested for loop
 *
 *      Use a nested for loop to generate a multiplication table for numbers 1-10.
 *      The output should look something like this: (you don't need to worry about perfect alignment)
 *
 *      Hint: use "System.out.print()" rather than "System.out.println()" to print multiple numbers to the same line.
 *
 *      1 |2 |3 |4 |5 |6 |7 |8 |9 |10 |
 *      2 |4 |6 |8 |10|12|14|16|18|20 |
 *      3 |6 |9 |12|15|18|21|24|27|30 |
 *      4 |8 |12|16|20|24|28|32|36|40 |
 *      5 |10|15|20|25|30|35|40|45|50 |
 *      6 |12|18|24|30|36|42|48|54|60 |
 *      7 |14|21|28|35|42|49|56|63|70 |
 *      8 |16|24|32|40|48|56|64|72|80 |
 *      9 |18|27|36|45|54|63|72|81|90 |
 *      10|20|30|40|50|60|70|80|90|100|
 *
 */

public class Exercise_11 {
    public static void main(String[] args) {

        for (int r = 1; r <= 10; r ++){

            for (int c = 1; c<= 10; c++){
                System.out.print(r *  c + "|");
            }
            System.out.println();
        }








//        for (int i = 1; i <= 10; i++) {
//            System.out.print(i + "|");
//        }
//        System.out.println("");
//        for (int j = 2; j <= 20; j += 2) {
//            System.out.print(j + "|");
//        }
//        System.out.println("");
//        for (int k = 3; k <= 30; k+=3) {
//            System.out.print(k + "|");
//        }
//        System.out.println("");
//        for (int l = 4; l <= 40; l+=4) {
//            System.out.print(l + "|");
//        }
//        System.out.println("");
//        for (int m = 5; m <= 50; m+=5) {
//            System.out.print(m + "|");
//        }
//        System.out.println("");
//        for (int n = 6; n <= 60; n+=6) {
//            System.out.print(n + "|");
//        }
//        System.out.println("");
//        for (int o = 7; o <= 70; o+=7) {
//            System.out.print(o + "|");
//        }
//        System.out.println("");
//        for (int p = 8; p <= 80; p+=8) {
//            System.out.print(p + "|");
//        }
//        System.out.println("");
//        for (int q = 9; q <= 90; q+=9) {
//            System.out.print(q + "|");
//        }
//        System.out.println("");
//        for (int r = 10; r <= 100; r+=10) {
//            System.out.print(r + "|");
//        }
//    }
    }
}
