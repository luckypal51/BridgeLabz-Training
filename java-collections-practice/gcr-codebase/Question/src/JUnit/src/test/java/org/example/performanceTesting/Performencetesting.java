package org.example.performanceTesting;

import org.example.performancetesting.LongeRunningTask;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;


public class Performencetesting {
    LongeRunningTask longrun;
    
    @BeforeEach
    public void setup(){
        this.longrun = new LongeRunningTask();
    }

    @Test
    @Timeout(1)
    public void test() throws InterruptedException {
        this.longrun.startThread();
    }
}
