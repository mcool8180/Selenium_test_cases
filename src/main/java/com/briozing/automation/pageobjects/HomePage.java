package com.briozing.automation.pageobjects;

import com.briozing.automation.base.WebDriverFactory;
import com.briozing.automation.config.Configuration;
import com.briozing.automation.utilities.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage {

    CommonMethods commonMethods = new CommonMethods();

    @FindBy(xpath = "(//a[contains(@href,'briozing.com')])[1]")
    public WebElement logoBriozing;

    @FindBy(xpath = "(//a[contains(text(),'Blog')])[1]")
    public WebElement linkBlog;

    @FindBy(xpath = "(//a[contains(text(),'Home')])[1]")
    public WebElement linkHome;

    @FindBy(xpath = "//h5[text()='CONNECT WITH US']")
    public WebElement Connection;

    @FindBy(xpath = "//input[attribute::name]")
    public WebElement ConnectionName;

    @FindBy(xpath = "//label[@class='wpforms-field-sublabel after ']")
    public WebElement ConnectionNameFirst;

    @FindBy(xpath = "//label[@for='wpforms-432-field_0-last']")
    public WebElement ConnectionNameLast;

    @FindBy(xpath = "//input[@type='email']")
    public WebElement ConnectionEmail;

    @FindBy(xpath = "//input[@type='email']")
    public WebElement ConnectionPhoneNumber;

    @FindBy(xpath = "//textarea[@id='wpforms-432-field_2']")
    public WebElement ConnectionMessage;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement ConnectionSubmitButton;

    @FindBy(xpath = "//img[@src='https://i1.wp.com/briozing.com/wp-content/uploads/2019/12/quickheal.png?zoom=2&w=3840&ssl=1']")
    public WebElement ClientsQuickHeal;

    @FindBy(xpath = "//img[@src='https://i1.wp.com/briozing.com/wp-content/uploads/2019/12/cropped-Sapience-Logo-for-Website.png?zoom=2&w=3840&ssl=1']")
    public WebElement ClientsSapience;

    @FindBy(xpath = "//img[@src='https://i0.wp.com/briozing.com/wp-content/uploads/2019/12/cropped-DL-logo-2.png?zoom=2&w=3840&ssl=1']")
    public WebElement ClientsDL;

    @FindBy(xpath = "//img[@src='https://i2.wp.com/briozing.com/wp-content/uploads/2019/12/cropped-cybrilla-new-logo-resized.png?zoom=2&w=3840&ssl=1']")
    public WebElement ClientsDCybrella;

    @FindBy(xpath = "//img[@src='https://i0.wp.com/briozing.com/wp-content/uploads/2019/12/cropped-vuclip-logo2.png?zoom=2&w=3840&ssl=1']")
    public WebElement ClientsVuclips;

    @FindBy(xpath = "//img[@src='https://i1.wp.com/briozing.com/wp-content/uploads/2019/12/cropped-A4TechLogo_Truecolor.png?zoom=2&w=3840&ssl=1']")
    public WebElement ClientsA4Technologies;

    @FindBy(xpath = "//i[@class='fa icon fa-clone large shadow-large-black round aligncenter reverse color1']")
    public WebElement ProductArchitectureLogo;

    @FindBy(xpath = "//i[@class='fa icon fa-cogs large shadow-large-black round aligncenter reverse color2']")
    public WebElement AutomatedTestingLogo;

    @FindBy(xpath = "//i[@class='fa icon fa-magic large shadow-large-black round aligncenter reverse color4']")
    public WebElement DevopsLogo;

    @FindBy(xpath = "//span[@class='header-homepage-arrow move-down-bounce']")
    public WebElement HomePageArrowDownLogo;

    @FindBy(xpath = "//i[@class='fa arrow fa-angle-down']")
    public WebElement HomePageArrowDownMotion;

    @FindBy(xpath = "//a[@class='button color1']")
    public WebElement GetStartedButton;

    @FindBy(xpath = "//a[@href='https://briozing.com/']")
    public WebElement BriozingLogoReload;

//    @FindBy(xpath = "//a[@href='#page-top']")
//    public WebElement PageScrollingTop;

    @FindBy(xpath ="//a[@href='#page-top']")               //using size of elements
    public List<WebElement> PageScrollingTop;


//    @FindBy(xpath = "//a[@href='#clients-1']")
//    public WebElement PageScrollingClients;

    @FindBy(xpath ="//a[@href='#clients-1']")               //using size of elements
    public List<WebElement> PageScrollingClients;

//    @FindBy(xpath = "//a[@href='#core']")
//    public WebElement PageScrollingCore;

    @FindBy(xpath ="//a[@href='#core']")               //using size of elements
    public List<WebElement> PageScrollingCore;

//    @FindBy(xpath = "//a[@href='#about-1']")
//    public WebElement PageScrollingAbout;

    @FindBy(xpath ="//a[@href='#about-1']")               //using size of elements
    public List<WebElement> PageScrollingAbout;


//    @FindBy(xpath = "//a[@href='#features-1']")
//    public WebElement PageScrollingfeatures;

    @FindBy(xpath ="//a[@href='#features-1']")               //using size of elements
    public List<WebElement> PageScrollingFeature;


//    @FindBy(xpath = "//a[text()='Cta']")
//    public WebElement PageScrollingCta;

    @FindBy(xpath ="//a[text()='Cta']")               //using size of elements
    public List<WebElement> PageScrollingCta;

//    @FindBy(xpath = "//a[@href='#team-1']")
//    public WebElement PageScrollingTeam;

    @FindBy(xpath ="//a[@href='#team-1']")               //using size of elements
    public List<WebElement> PageScrollingTeam;

//    @FindBy(xpath = "//a[@href='#latest-bogs']")
//    public WebElement PageScrollingBlogs;

    @FindBy(xpath ="//a[@href='#latest-bogs']")               //using size of elements
    public List<WebElement> PageScrollingBlog;





    public HomePage() throws Exception {
        PageFactory.initElements(WebDriverFactory.getDriver(), this);
    }

    public BlogPage navigateToBlog() throws Exception {
        linkBlog.click();
        commonMethods.waitForPageToLoad();
        return PageFactory.initElements(WebDriverFactory.getDriver(), BlogPage.class);
    }


    public HomePage launch() throws Exception {
        WebDriverFactory.getDriver().get(Configuration.portalUrl);
        commonMethods.waitForPageToLoad();
        return this;
    }
    public List<WebElement>getPageScrollingTop() throws Exception{
        return PageScrollingTop;
    }
    public List<WebElement>getPageScrollingClients() throws Exception{
        return PageScrollingClients;
    }
    public List<WebElement>getPageScrollingCore() throws Exception{
        return PageScrollingCore;
    }
    public List<WebElement>getPageScrollingAbout() throws Exception{
        return PageScrollingAbout;
    }
    public List<WebElement>getPageScrollingFeature() throws Exception{
        return PageScrollingFeature;
    }
    public List<WebElement>getPageScrollingCta() throws Exception{
        return PageScrollingCta;
    }
    public List<WebElement>getPageScrollingTeam() throws Exception{
        return PageScrollingTeam;
    }
    public List<WebElement>getPageScrollingBlog() throws Exception{
        return PageScrollingBlog;
    }





}
