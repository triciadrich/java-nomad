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
        Counter cnt = new Counter();

        CntThread oddCount = new CntThread(" Odd Count", cnt, true);
        CntThread evenCount = new CntThread("Even Count", cnt, false);

        try {
            oddCount.thread.join();
            evenCount.thread.join();
        } catch (InterruptedException e){
            System.out.println("Main thread interrupted");
        }
    }
}

class CntThread implements Runnable{

    Thread thread;
    boolean odd;
    Counter counter;

    public CntThread(String name, Counter cnt, boolean odd){
        thread = new Thread(this, name);
        this.odd = odd;
        this.counter = cnt;
        thread.start();
    }

    @Override
    public void run() {
        while (counter.currentCount < 100){
//            System.out.print(thread.getName() + ": ");
            counter.count(this.odd, thread.getName());
        }
    }
}

class Counter{

    // This is the variable we will be using to count
    int currentCount = 1;

    public synchronized void count(boolean odd, String name){

        // Is the current count odd or even?
//        boolean countIsOdd = (currentCount%2==1);


        // Keep doing this while currentCount < 100
//        while (currentCount < 100) {
        // Is the current count odd or even?
        boolean countIsOdd = (currentCount%2==1);
        try {
            // If these don't match, then we need to wait
            if (odd != countIsOdd) {
                System.out.print(name + " waiting...");
                wait();
            }
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }

        System.out.println(name + ": Counting to " + currentCount++);
        notifyAll();
//        }
    }
}

