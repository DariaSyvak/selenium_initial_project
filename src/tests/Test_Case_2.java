package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;

public class Test_Case_2 {
    public static void main(String[] args) {
        WebDriver driver = Driver.getDriver();
        driver.get("https://comfyelite.com/");

        WebElement contactUsButton = driver.findElement(By.xpath("(//a[@data-ux='NavLink'])[2]"));
        contactUsButton.click();

        System.out.println((driver.getCurrentUrl().equals("https://comfyelite.com/contact-us")) ? "PASSED" : "FAILED");

        WebElement heading = driver.findElement(By.xpath("//h1[@data-ux='SectionHeading']"));
        System.out.println(heading.isDisplayed()
                && heading.getText().equals("Connect With Us") ? "PASSED" : "FAILED");

        WebElement facebookButton = driver.findElement(By.xpath("//a[@data-aid='SOCIAL_FACEBOOK_LINK']"));
        System.out.println(facebookButton.isDisplayed()
                && facebookButton.getAttribute("href").equals("https://www.facebook.com/103179127717601") ? "PASSED" : "FAILED");

        WebElement instagramButton = driver.findElement(By.cssSelector("a[data-aid='SOCIAL_INSTAGRAM_LINK']"));
        System.out.println(instagramButton.isDisplayed()
                && instagramButton.getAttribute("href").equals("https://www.instagram.com/comfyelite") ? "PASSED" : "FAILED");


        Driver.quitDriver();

    }
}
