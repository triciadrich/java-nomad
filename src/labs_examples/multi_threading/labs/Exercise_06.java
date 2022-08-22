package labs_examples.multi_threading.labs;

import com.sun.scenario.effect.impl.sw.java.JSWBlend_SRC_OUTPeer;

/**
 * Multithreading Exercise 6:
 * <p>
 * Write a program that will print 1-100 sequentially from at least two distinct threads. For instance, thread1 will
 * print "1", then thread2 will print "2", then thread1 will print "3", then thread2 will print "4" and so on.
 */


public class Exercise_06 {
    public static void main(String[] args) {
        count100 t1 = new count100("odd", true);
        count100 t2 = new count100("even", false);
    }

    public static class count100 implements Runnable {
        Thread thread;
        boolean odd;
        static int currentCount = 1;


        public count100(String name, boolean odd) {
            thread = new Thread(this, name);
            this.odd = odd;
            System.out.println(thread.getName());
            thread.start();


        }


        public synchronized void count() {

            while (currentCount < 100) {
                if (currentCount % 2 == 0 && thread.getName().equals("even")) {
                    System.out.println(thread.getName() + " " + currentCount);
                    currentCount++;

                } else if (currentCount % 2 == 1 && thread.getName().equals("odd")) {
                    System.out.println(thread.getName() + " " + currentCount);
                    currentCount++;

                }


            }
        }

        @Override
        public void run() {
            count();

        }
    }
}

