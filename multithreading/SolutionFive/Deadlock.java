package multithreading.SolutionFive;

/**
 * This is a demonstration of how NOT to write multi-threaded programs.
 * It is a program that purposely causes deadlock between two threads that
 * are both trying to acquire locks for the same two resources.
 * To avoid this sort of deadlock when locking multiple resources, all threads
 * should always acquire their locks in the same order.
 **/
public class Deadlock {
    public static void main(String[] args) {

        /*These are the two resource objects
        we'll try to get locks for*/

        final Object resource1 = "resource1";
        final Object resource2 = "resource2";

        /*Here's the first thread.
        It tries to lock resource1 then resource2*/
        Thread t1 = new Thread() {
            public void run() {
                synchronized (resource1) {
                    System.out.println("Thread 1: locked resource 1");
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                    }

                    synchronized (resource2) {
                        System.out.println("Thread 1: locked resource 2");
                    }
                }
            }
        };

        /*Here's the second thread.
        It tries to lock resource2 then resource1*/
        Thread t2 = new Thread() {
            public void run() {

                /*This thread locks resource 2 right away*/
                synchronized (resource2) {
                    System.out.println("Thread 2: locked resource 2");
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                    }

                    synchronized (resource1) {
                        System.out.println("Thread 2: locked resource 1");
                    }
                }
            }
        };

        /*Start the two threads.
        If all goes as planned, deadlock will occur,
        and the program will never exit.*/
        t1.start();
        t2.start();
    }
}