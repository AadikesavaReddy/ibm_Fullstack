package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class Activity21 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
         WebDriver driver = new FirefoxDriver();
         Thread thread = new Thread();
         WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
         driver.get(" https://v1.training-support.net/selenium/tab-opener");
        System.out.println(driver.getTitle());
        System.out.println(driver.findElement(By.className("content")).getText());
        Set<String > li = driver.getWindowHandles();
        System.out.println("current tab Number : " + li.size());

        driver.findElement(By.id("launcher")).click();
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        for ( String windows : driver.getWindowHandles()) {
            driver.switchTo().window(windows);
        }
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(driver.getTitle());
        System.out.println("current tab Number : " + li.size());

        wait.until(ExpectedConditions.elementToBeClickable(By.id("actionButton"))).click();
        wait.until(ExpectedConditions.numberOfWindowsToBe(3));
        for ( String windows : driver.getWindowHandles()) {
            driver.switchTo().window(windows);
        }
        wait.until(ExpectedConditions.numberOfWindowsToBe(3));
        System.out.println(driver.getTitle());
        System.out.println(driver.getWindowHandles().size());;
        Set<String> li1 = driver.getWindowHandles();
        System.out.println("current tab Number : " + li1.size());
        System.out.println(driver.getWindowHandle());
        driver.switchTo().window("");
    }
}
