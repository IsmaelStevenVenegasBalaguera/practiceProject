package XSelenium.Screenshot;

import XSelenium.commonMethods.commonMethods;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class ScreenShot extends commonMethods {
    public static void main(String[] args) throws IOException {
        openBrowser("http://www.bible.com");
        TakesScreenshot ts=(TakesScreenshot) driver;
        File ss=ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(ss,new File("C:\\Users\\35269\\Desktop\\GIT\\Javadocs\\PersonalSelenium\\screenshots\\bible22.jpg"));

        click(page1.login1);
        TakeScreenshot("login");
    }
}
