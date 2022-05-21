package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;

public class Test_Case_5 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = Driver.getDriver();
        driver.get("https://comfyelite.com/");

        WebElement contactUsButton = driver.findElement(By.xpath("(//a[@data-ux='NavLink'])[2]"));
        contactUsButton.click();

        System.out.println((driver.getCurrentUrl().equals("https://comfyelite.com/contact-us")) ? "PASSED" : "FAILED");

        WebElement inputButton=driver.findElement(By.xpath("(//div[@data-ux='Element'])[2]"));
        WebElement input= driver.findElement(By.xpath("//input[@data-aid='CONTACT_FORM_EMAIL_OPT_IN']"));

        inputButton.click();
        System.out.println(input.isSelected()&&inputButton.isDisplayed()?"PASSED":"FAILED");
        Thread.sleep(3000);

        inputButton.click();
        System.out.println(!input.isSelected()&&inputButton.isDisplayed()?"PASSED":"FAILED");
        Thread.sleep(2000);


        Driver.quitDriver();

    }
}