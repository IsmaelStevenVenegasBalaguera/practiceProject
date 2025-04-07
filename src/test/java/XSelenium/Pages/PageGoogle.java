package XSelenium.Pages;

import XSelenium.commonMethods.commonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static XSelenium.commonMethods.commonMethods.driver;

public class PageGoogle extends commonMethods {
    @FindBy(xpath ="//a[@href='https://accounts.google.com/TOS?loc=LU&hl=es-419&privacy=true']" )
    public WebElement privacy;

    @FindBy(xpath ="//a[@href='https://support.google.com/accounts?hl=es-419&p=account_iph']")
    public WebElement help;



    public PageGoogle(){PageFactory.initElements(driver,this);}
}
