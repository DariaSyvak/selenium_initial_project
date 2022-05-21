package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;

public class Test_Case_3 {
    public static void main(String[] args) {
        WebDriver driver = Driver.getDriver();
        driver.get("https://comfyelite.com/");

        WebElement contactUsButton = driver.findElement(By.xpath("(//a[@data-ux='NavLink'])[2]"));
        contactUsButton.click();

        System.out.println((driver.getCurrentUrl().equals("https://comfyelite.com/contact-us")) ? "PASSED" : "FAILED");

        WebElement contactUsHeading=driver.findElement(By.xpath("//h2[@data-aid='CONTACT_SECTION_TITLE_REND']"));
        System.out.println(contactUsHeading.isDisplayed()&&contactUsHeading.getText().equals("Contact Us")? "PASSED":"FAILED");

        WebElement sendUsMSGHeading=driver.findElement(By.xpath("//h4[@data-aid='CONTACT_FORM_TITLE_REND']"));
        System.out.println(sendUsMSGHeading.isDisplayed()&&sendUsMSGHeading.getText().equals("SEND US A MESSAGE")?"PASSED":"FAILED");




        Driver.quitDriver();















        Driver.quitDriver();
    }
}
