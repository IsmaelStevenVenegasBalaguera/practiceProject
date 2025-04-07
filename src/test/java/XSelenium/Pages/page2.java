package XSelenium.Pages;

import XSelenium.commonMethods.commonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class page2 extends commonMethods {
    @FindBy(xpath ="//*[@id='username']" )
    public WebElement enterEmail;
    @FindBy(xpath = "//*[@id='password']")
    public WebElement enterPassword;
    @FindBy(xpath = "//*[@class='relative overflow-hidden items-center font-bold ease-in-out duration-100 focus:outline-2 focus:outline-info-light dark:focus:outline-info-dark hover:shadow-light-2 disabled:text-gray-50 disabled:hover:shadow-none disabled:opacity-50 disabled:bg-gray-10 disabled:cursor-not-allowed flex w-full max-w-fit bg-yv-red dark:bg-yv-red-dark text-white rounded-3 text-xs px-3 h-6 dark:disabled:bg-gray-30 dark:disabled:text-gray-10']")
    public WebElement signIn2;
    @FindBy(xpath ="//button[text()='OK']")
    public WebElement bannerButton;

    public page2(){
        PageFactory.initElements(driver,this);
    }
}
