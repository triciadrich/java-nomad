package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 1:
 *
 *      1: Create an application that starts a Thread by implementing the Runnable interface
 *      2: Demonstrate at least two distinct ways of initiating a Thread using the Runnable you just created
 *
 */

public class Exercise_01 {
    public static void main(String[] args) {
        MyRunnable t1 = new MyRunnable("One");
        MyRunnable t2 = new MyRunnable();
        t2.thread.setName("Two");
        t2.thread.start();
    }

    public static class MyRunnable implements Runnable {
        Thread thread;


        public MyRunnable(String name) {
            thread = new Thread(this, name);
            thread.start();
        }
        public MyRunnable(){
            thread = new Thread(this);
        }

        @Override
        public void run(){
            try{
                for(int c= 0; c<20; c++){
                    Thread.sleep(100);
                    System.out.println(thread.getName() + " thread has printed " + c +" times");
                }

            }catch (InterruptedException exc){
                exc.printStackTrace();
            }
        }
    }
}
