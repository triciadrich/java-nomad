package labs_examples.multi_threading.labs;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Multithreading Exercise 4:
 *
 *      Demonstrate the use of a synchronized block and a synchronized method - ensure that the synchronization is
 *      working as expected
 */

public class Exercise_04 {
    public static void main(String[] args) {
        Running run1 = new Running("One");
        Running run2 = new Running("Two");
    }

    public static synchronized void WriteData() {//synchronized method


        try (FileWriter fw = new FileWriter("C:\\Users\\Owner\\Documents\\CodingNomads\\labs\\online-java-fundamentals\\src\\labs_examples\\multi_threading\\labs\\ex4.txt")) {
            fw.write("Written to file");
        } catch (IOException IExc) {
            System.out.println(IExc.getMessage());
        }


    }

    public static class count {

        public static void counter(){


            for (int i = 0; i < 10; i++) {
                System.out.println(i);
            }
        }
    }
    public static class Running implements Runnable {
        Thread thread;

        public Running(String name) {
            thread = new Thread(this, name);
            thread.start();
        }

        @Override
        public void run() {
            count cnt = new count();
            try {
                for (int c = 0; c < 3; c++) {
                    Thread.sleep(200);
                    WriteData();
                    System.out.println("written");
                }
                synchronized (cnt){//syn block
                    count.counter();
                }

            } catch (InterruptedException exc) {
                System.out.println(exc.getMessage());
            }
        }
    }
}