package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class Activity14 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/tables");
        System.out.println("Title of the page: " + driver.getTitle());

        List<WebElement> list = driver.findElements(By.xpath("(//table)[2]/thead/tr/th"));
        System.out.println("Number of columns : " + list.size());
        List<WebElement> list2 = driver.findElements(By.xpath("(//table)[2]/tbody/tr"));
        System.out.println("Number of Rows : " + list2.size());

        System.out.println(driver.findElement(By.xpath("(//table)[2]/tbody/tr[2]/td[2]")).getText());;
        driver.findElement(By.xpath("(//table)[2]/thead/tr/th[1]")).click();
        System.out.println(driver.findElement(By.xpath("(//table)[2]/tbody/tr[2]/td[2]")).getText());;

//        System.out.println(driver.findElement(By.xpath("(//table)[2]/tfoot/tr/th[1]")).getText());;
//        System.out.println(driver.findElement(By.xpath("(//table)[2]/tfoot/tr/th[2]")).getText());;

        List<WebElement> footer = driver.findElements(By.xpath("//table[@id='sortableTable']/tfoot/tr/th"));
        System.out.println("Cell values of the footer: ");
        for(WebElement cell : footer) {
            System.out.println(cell.getText());
        }







    }
}
