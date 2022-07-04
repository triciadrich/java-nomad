package labs_examples.objects_classes_methods.labs.methods;

/**
 * Create a recursive method named factorial that will return the factorial of any number passed to it.
 *
 * For instance, after creating the factorial method, uncomment the two lines in the main() method. When you run
 * it, it should print 120. It should also work for any ther number you pass it.
 *
 */
public class Exercise_03 {

    public static void main(String[] args) {
        int x = factorial(50);
      System.out.println(x);
//        should print 120
    }
    public static int factorial(int x){
        int total;

        if (x == 1){
            return 1;
        }else{
            total = factorial(x - 1) * x;
        }

        return total;
    }



}

