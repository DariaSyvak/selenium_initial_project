package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test_Case_4 {
    public static void main(String[] args) {
        WebDriver driver = Driver.getDriver();
        driver.get("https://comfyelite.com/");

        WebElement contactUsButton = driver.findElement(By.xpath("(//a[@data-ux='NavLink'])[2]"));
        contactUsButton.click();

        System.out.println((driver.getCurrentUrl().equals("https://comfyelite.com/contact-us")) ? "PASSED" : "FAILED");

        List<WebElement> inputLabels = driver.findElements(By.xpath("//label[@data-ux='InputFloatLabelLabel']"));
        List<WebElement> inputPersonalInfo = driver.findElements(By.xpath("//input[@data-ux='InputFloatLabel']"));
        String[] expectedLabels = {"First Name*", "Last Name*", "Email*"};
        String[] keysToSend = {"Akin", "Kaya", "akinkaya@gmail.com"};

        for (int i = 0; i < inputPersonalInfo.size(); i++) {
            inputPersonalInfo.get(i).sendKeys(keysToSend[i]);
            System.out.println("Validation of " + expectedLabels[i].substring(0, expectedLabels[i].length() - 1) +
                    (inputPersonalInfo.get(i).isDisplayed() && inputPersonalInfo.get(i).isEnabled()
                            && inputPersonalInfo.get(i).getAttribute("value").equals(keysToSend[i])
                            && inputLabels.get(i).getText().equals(expectedLabels[i])
                            ? " PASSED" : " FAILED"));
        }

        WebElement MSGInput = driver.findElement(By.xpath("//textarea[@data-ux='InputTextArea']"));
        MSGInput.sendKeys("My message here");
        System.out.println("Validation of Message is" +
                (MSGInput.isDisplayed() && MSGInput.isEnabled()
                        && MSGInput.getText().equals("My message here")
                        && MSGInput.getAttribute("placeholder").equals("Message*") ?
                        "PASSED" : "FAILED"));

        Driver.quitDriver();
    }

}