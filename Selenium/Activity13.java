package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class Activity13 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/tables");
        String title = driver.getTitle();
        System.out.println("Title of the page is : "+ title);

        List<WebElement> list = driver.findElements(By.xpath("(//table)[1]/tbody/tr"));
        System.out.println("Number of Rows " + list.size());
        System.out.println(driver.findElement(By.xpath("(//table)[1]/tbody/tr[3]/td[2]")).getText());;
        //driver.findElements(By.xpath("//table/thead/tbody"));

//        List<WebElement> thirdRow = driver.findElements(By.xpath("//table[contains(@class, 'striped')]/tbody/tr[3]/td"));
//        System.out.println("Third row cell values: ");
//        for(WebElement cell : thirdRow) {
//            System.out.println(cell.getText());
//        }
//
//        // Print the cell value of the second row and second column
//        WebElement cellValue = driver.findElement(By.xpath("//table[contains(@class, 'striped')]/tbody/tr[2]/td[2]"));
//        System.out.println("Second row, second cell value: " + cellValue.getText());

    }
}
