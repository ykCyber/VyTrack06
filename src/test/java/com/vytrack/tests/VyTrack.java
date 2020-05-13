package com.vytrack.tests;

import com.vytrack.utilities.Base;
import com.vytrack.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;


public class VyTrack{

@Test
public void test(){
    WebDriver driver = WebDriverFactory.getDriver("chrome");
    driver.get(Base.URL);
    driver.findElement(By.linkText("Forgot your password?")).click();
    driver.findElement(By.id("prependedInput")).sendKeys("alfa");
    driver.findElement(By.xpath("//div//button")).click();
    System.out.println("driver.findElement(By.className(\"alert\")).getText() = " + driver.findElement(By.className("alert")).getText());
    System.out.println("driver.switchTo().alert().getText() = " + driver.switchTo().alert().getText());


}
}
