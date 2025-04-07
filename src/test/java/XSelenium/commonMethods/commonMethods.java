package XSelenium.commonMethods;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

public class commonMethods extends pInitializer{
    public static WebDriver driver=new ChromeDriver();
    public static void openBrowser(String url){
        driver.manage().window().maximize();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        pageInitializerObject();

    }
    public static void click(WebElement element){
        element.click();
    }

    public static void sendText(WebElement element, String text){
        element.clear();
        element.sendKeys(text);
    }

    public static void switchHandle(String handelName){
        Set<String> allHandles= driver.getWindowHandles();
        for (String handle:allHandles){
            driver.switchTo().window(handle);
            String title= driver.getTitle();
            if (title.equalsIgnoreCase(handelName)){
                break;
            }
        }

    }
    public static void explicitWaitToBeClickable(String element){
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(element)));
    }
    public static void closeBrowser(){
        driver.quit();
    }
    public static void rightClick(WebElement element){
        Actions action=new Actions(driver);
        action.contextClick(element).perform();
    }
    public static void TakeScreenshot(String name) throws IOException {
        TakesScreenshot ts=(TakesScreenshot) driver;
        File ss=ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(ss,new File("C:\\Users\\35269\\Desktop\\GIT\\Javadocs\\PersonalSelenium\\screenshots\\"+name+".jpg"));

    }



}
