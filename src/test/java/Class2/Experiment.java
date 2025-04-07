package Class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Experiment {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com");
        WebElement firstDropDown =driver.findElement(By.xpath("//span[@class='hm-icon-label']"));
        firstDropDown.click();
        Thread.sleep(3000);
        WebElement login =driver.findElement(By.xpath("//*[@id='hmenu-customer-profile']"));
        login.click();
        WebElement enterEmail= driver.findElement(By.cssSelector("input#ap_email"));
        enterEmail.sendKeys("istevenvb@gmail.com");
        WebElement continueEmail = driver.findElement(By.cssSelector("input.a-button-input"));
        continueEmail.click();
        WebElement enterPassword = driver.findElement(By.cssSelector("input#ap_password"));
        enterPassword.sendKeys("Emorevelad");
        WebElement login2 =driver.findElement(By.cssSelector("input[aria-labelledby^=auth]"));
        login2.click();








    }
}
