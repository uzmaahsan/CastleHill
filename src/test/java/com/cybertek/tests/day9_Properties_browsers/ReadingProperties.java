package com.cybertek.tests.day9_Properties_browsers;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadingProperties {
    @Test
    public void reading_from_properties_files() throws IOException {
        //1-Create object of properties class (coming from javalib)

        Properties propties = new Properties();
        //2- open the file using FileInputStream
        FileInputStream file = new FileInputStream("configuratin.properties");
        //Load the properties object with our file
        propties.load(file);
        // reading from configuration.properties
        System.out.println("propties.getProperty(\"browser\") = " + propties.getProperty("browser"));
        System.out.println("propties.getProperty() = " + propties.getProperty("env"));
    }
}
