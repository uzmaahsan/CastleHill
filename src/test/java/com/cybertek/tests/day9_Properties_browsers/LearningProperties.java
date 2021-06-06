package com.cybertek.tests.day9_Properties_browsers;

import org.testng.annotations.Test;

public class LearningProperties {

    @Test
    public void java_Properties_reading_test(){
        System.out.println("System.getProperty(\"os.name\") = " + System.getProperty("os.name"));
        System.out.println("System.getProperty(\"user.name\") = " + System.getProperty("user.name"));
    }
}
