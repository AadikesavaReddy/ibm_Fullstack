package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class Activity22 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        Actions actions = new Actions(driver);
        driver.get(" https://v1.training-support.net/selenium/popups");
        System.out.println(driver.getTitle());
        driver.findElement(By.className("ui huge inverted orange button"));

        actions.moveToElement().build().perform();


    }
}
