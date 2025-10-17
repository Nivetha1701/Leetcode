import java.util.concurrent.CountDownLatch;

class Foo {

    private CountDownLatch latch1;
    private CountDownLatch latch2;

    public Foo() {
        latch1 = new CountDownLatch(1); // ensures second() waits for first()
        latch2 = new CountDownLatch(1); // ensures third() waits for second()
    }

    public void first(Runnable printFirst) throws InterruptedException {
        printFirst.run();
        latch1.countDown(); // signal that first() is done
    }

    public void second(Runnable printSecond) throws InterruptedException {
        latch1.await(); // wait until first() completes
        printSecond.run();
        latch2.countDown(); // signal that second() is done
    }

    public void third(Runnable printThird) throws InterruptedException {
        latch2.await(); // wait until second() completes
        printThird.run();
    }
}
