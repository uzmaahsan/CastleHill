package com.cybertek.utilities;

public class BrowserUtils {
    /*
    Method that will accept int
    wait for given second duration

    */
    public static void sleep(int second)  {
        second*=1000;
        //1second = 1000 milli seconds

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("something happened in the sleep method");
        }

    }
}
