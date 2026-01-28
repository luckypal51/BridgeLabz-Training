package org.example.performancetesting;

public class LongeRunningTask {

    public void startThread() throws InterruptedException {
        Thread sum = new Sum();
        sum.start();
        Thread.sleep(3000);
    }
}
