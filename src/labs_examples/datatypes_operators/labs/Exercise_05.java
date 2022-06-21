package labs_examples.datatypes_operators.labs;

/**
 * Please demonstrate the use of all logical operators below. These include:
 *
 * AND, short-circuit AND, OR, short-circuit OR, XOR, NOT
 *
 */
class LogicalOperators {

    public static void main(String[] args) {

        // example of "OR"
        boolean a = true;
        boolean b = false;
        if (a | b){
            System.out.println("a or b is true");
        }
        //short circuit AND
       if ( a && b){
           System.out.println("a & b are true");

       }else{
           System.out.println("one is false");
       }
        //short circuit or, NOT
       if (!a || !b){
           System.out.println("a or b is false");
       }
        //XOR
       if (a ^ b ){
           System.out.println("one can be true but not both");
       }
    }

}

