package labs_examples.static_nonstatic.labs.ex1;

public class ClassA {
    public static void main(String[] args) {
        add(3,3);
        divide(3,3);
        ClassA nonStaticMethodCall = new ClassA();
        nonStaticMethodCall.subtract(6,3);
        ClassB.message();

    }

    public static int add(int a, int b){
        ClassA call = new ClassA();
        call.subtract(3,3);//2) A static method calling a non-static method in the same class
       ClassB.message(); //3) A static method calling a static method in another class
        return a + b;
    }

    public static double divide(int a, int b){
        ClassB thisClass = new ClassB();
        thisClass.message2();//4) A static method calling a non-static method in another class
        add(3,2); //1) A static method calling another static method in the same class
        return a / b;
    }

    public int subtract(int a,int b){
        ClassB.message();//8) A non-static method calling a static method in another class
        return a - b;
    }
}
