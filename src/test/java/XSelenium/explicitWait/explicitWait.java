package XSelenium.explicitWait;

import XSelenium.commonMethods.commonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class explicitWait extends commonMethods {
    public static void main(String[] args) {
        explicitWaitToBeClickable("");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("")));
        wait.until(ExpectedConditions.alertIsPresent());




    }
}
