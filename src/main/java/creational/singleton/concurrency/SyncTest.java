package creational.singleton.concurrency;
public class SyncTest {
    public static void main(String[] args) {
        // could be DB object too
        B sameMemoryObjectGivenToMultipleThreads = new B();
        Thread t1 = new Thread(sameMemoryObjectGivenToMultipleThreads);
        t1.setName("T1");
        Thread t2 = new Thread(sameMemoryObjectGivenToMultipleThreads);
        t2.setName("T2");
        Thread t3 = new Thread(sameMemoryObjectGivenToMultipleThreads);
        t3.setName("T3");
        t1.start();
        t2.start();
        t3.start();
    }
}
