package labs_examples.static_nonstatic.labs.ex1;

public class ClassB {

    public static void message(){
        System.out.println("another class");
    }

    public void message2(){
        System.out.println("This is a message");
        message();//7) A non-static method calling a static method in the same class
    }

    public void message3(){
        System.out.println("Another message");
        message2();//5) A non-static method calling a non-static method in the same class
        ClassA call2 = new ClassA();
        call2.subtract(6,5);//6) A non-static method calling a non-static method in another class
    }
}
