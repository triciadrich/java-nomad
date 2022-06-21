package labs_examples.datatypes_operators.labs;

/**
 * Please demonstrate the use of all relational operators below. These include:
 *
 * less than, less than or equal to, greater than, greater than or equal to, and equal to
 *
 */
class RelationalOperators {

    public static void main(String[] args) {

        // example of "less than"
        int a = 1;
        int b = 2;
        if (a < b){
            System.out.println("a is less than b");
        }
        // less than or equal to
        if (a < b || a == b){
            System.out.println("true");
        }

        //greater than
        if (a > b){
            System.out.println("a greater than b");
        }else {
            System.out.println("a is less than b");
        }

        //greater than or equal to
        if (a > b || a == b){
            System.out.println(true);
        }else{
            System.out.println("false");
        }

        //equal to
        if (a == b){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

    }

}

