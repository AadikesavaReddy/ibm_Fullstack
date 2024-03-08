package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity15 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://v1.training-support.net/selenium/dynamic-attributes");
        System.out.println(driver.getTitle());

        driver.findElement(By.xpath("input[class^='username']")).sendKeys("admin");

        driver.findElement(By.xpath("input[class^='password']")).sendKeys("password");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.xpath("//button[@type='submit']")).sendKeys(Keys.ENTER);
    }
}
