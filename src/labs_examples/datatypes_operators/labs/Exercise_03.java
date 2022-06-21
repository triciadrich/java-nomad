package labs_examples.datatypes_operators.labs;

/**
 * Please demonstrate the use of all arithmetic operators below. These include:
 *
 * addition, subtraction, multiplication, division and modulus
 *
 */
class ArithmeticOperators {

    public static void main(String[] args) {

        int val = 5;
        int val2 = 6;

        int add = val += val2;
        int sub = val -= val2;
        int mult = val *= val2;
        double divide = val /= val2;
        int modulous = val %= val2;

        System.out.println("add: " + add);
        System.out.println("subtract " + sub);
        System.out.println("multiply " + mult);
        System.out.println("divide " + divide);
        System.out.println("modulus " + modulous);



    }

}
