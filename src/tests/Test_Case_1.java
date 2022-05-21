package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;

public class Test_Case_1 {
    public static void main(String[] args) {
        WebDriver driver= Driver.getDriver();
        driver.get("https://comfyelite.com/");

        WebElement contactUsButton=driver.findElement(By.xpath("(//a[@data-ux='NavLink'])[2]"));
        contactUsButton.click();

        System.out.println((driver.getCurrentUrl().equals("https://comfyelite.com/contact-us"))?"PASSED":"FAILED");

        WebElement logo= driver.findElement(By.xpath("//img[@data-ux='ImageLogo']"));
        System.out.println(logo.isDisplayed()?logo.getText()+"PASSED":"FAILED");

        WebElement heading=driver.findElement(By.xpath("//h2[@data-aid='HEADER_TAGLINE_RENDERED']"));
        System.out.println(heading.isDisplayed()?"PASSED":"FAILED");


        Driver.quitDriver();
    }
}
