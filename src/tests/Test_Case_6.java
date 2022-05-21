package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;

public class Test_Case_6 {
    public static void main(String[] args) {

        WebDriver driver = Driver.getDriver();
        driver.get("https://comfyelite.com/");

        WebElement contactUsButton = driver.findElement(By.xpath("(//a[@data-ux='NavLink'])[2]"));
        contactUsButton.click();

        System.out.println((driver.getCurrentUrl().equals("https://comfyelite.com/contact-us")) ? "PASSED" : "FAILED");

        WebElement connectButton=driver.findElement(By.xpath("//button[@data-ux='ButtonPrimary']"));

        System.out.println(connectButton.isDisplayed()&&connectButton.getText().equals("SEND")&&connectButton.isEnabled()?"PASSED":"FAILED");


        Driver.quitDriver();
    }
}