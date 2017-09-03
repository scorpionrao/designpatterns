package creational.singleton.concurrency;

public class B implements Runnable {

    int counter = 101;
    @Override
    public void run() {
        nonSynchronizedMethod(100);
    }
    synchronized void nonSynchronizedMethod(int externalInput) {
        Thread t = Thread.currentThread();
        for(int n = 1; n <= 15; n++) {
            System.out.println(counter++ + " " + t.getName() + "_" + n);
            // System.out.println(t.getName() + n + " " + counter++);
            // System.out.println(t.getName() + (externalInput + n));
        }
    }}