package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity12 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://v1.training-support.net/selenium/dynamic-controls");
        String title = driver.getTitle();
        System.out.println("Title Name :" + title);

        System.out.println(driver.findElement(By.id("input-text")).isEnabled());
        driver.findElement(By.id("toggleInput")).click();
        System.out.println(driver.findElement(By.id("input-text")).isEnabled());




    }
}

//public class Activity12 {
//    public static void main(String[] args) {
//        // Set up Firefox driver
//        WebDriverManager.firefoxdriver().setup();
//        // Create a new instance of the Firefox driver
//        WebDriver driver = new FirefoxDriver();
//        // Create the Wait object
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//
//        // Open the page
//        driver.get("https://v1.training-support.net/selenium/dynamic-controls");
//        // Print the title of the page
//        System.out.println("Home page title: " + driver.getTitle());
//
//        // Find the text field
//        WebElement textbox = driver.findElement(By.id("input-text"));
//        // Check if it is enabled
//        System.out.println("Input field is enabled: " + textbox.isEnabled());
//        // Click the toggle button to enable it
//        driver.findElement(By.id("toggleInput")).click();
//        // Check if the text field is enabled
//        System.out.println("Input field is enabled: " + textbox.isEnabled());
//
//        // Close the browser
//        driver.close();
//    }
//}
