package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class google {
    public static void main(String[] args) {
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        String url = "https://www.google.com/";
//        driver.findElement(By.id("YacQv")).sendKeys("cheese");
//        driver.findElement(By.id("YacQv")).sendKeys(Keys.ENTER);
        driver.get(url);
        //System.out.println(driver.getTitle());

        //String  res = driver.findElement(By.id("result-stats")).getText();
        //System.out.println(res);
//        String[] ar = new String[10];
//        ar = res.split(" ");
//        System.out.println(ar[1]);

    }
}
