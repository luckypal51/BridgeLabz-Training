package org.example.performancetesting;

public class Sum extends Thread{
    @Override
    public void run() {
        int sum = 0;
        for (int i = 0; i <10000 ; i++) {
            sum +=i;
        }
        System.out.println(sum);
    }
}
