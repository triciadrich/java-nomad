package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 3:
 *
 *      In one of the previous exercises, demonstrate changing the priority of a thread
 */
public class Exercise_03 {
    public static void main(String[] args) {
        Exercise_01.MyRunnable t1 = new Exercise_01.MyRunnable("One");
        t1.thread.setPriority(Thread.MIN_PRIORITY);
        Exercise_01.MyRunnable t2 = new Exercise_01.MyRunnable("Two");
        t2.thread.setPriority(Thread.MAX_PRIORITY);
    }
}