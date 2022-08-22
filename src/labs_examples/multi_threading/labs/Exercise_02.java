package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 2:
 *
 *      Create an application that creates a Thread using the Thread class
 */

public class Exercise_02 {
    public static void main(String[] args) {
        MyExtension t1 = new MyExtension("One");
        MyExtension t2 = new MyExtension("two");
    }

    public static class MyExtension extends Thread{

        public MyExtension(String name){
            super(name);
            start();
        }

        @Override
        public void run(){
            try{
                for(int c = 0; c<10; c+=2){
                    Thread.sleep(20);
                    System.out.println(getName()+ " " + c);
                }

            }catch (InterruptedException exc){
                System.out.println(exc.getMessage());
            }
        }
    }
}