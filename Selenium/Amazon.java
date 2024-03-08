package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Amazon {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        String url = "https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=155259815513&hvpone=&hvptwo=&hvadid=678802104188&hvpos=&hvnetw=g&hvrand=2018409068115596550&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9062037&hvtargid=kwd-10573980&hydadcr=14453_2371562&gad_source=1";
        driver.get(url);
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 15");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
        String price = driver.findElement(By.xpath("(//span[@class='a-offscreen'])[8]")).getText();
        System.out.println(price);
//        driver.close();


    }
}
