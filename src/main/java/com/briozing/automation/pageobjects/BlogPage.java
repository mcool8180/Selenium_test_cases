package com.briozing.automation.pageobjects;

import com.briozing.automation.base.WebDriverFactory;
import com.briozing.automation.config.Configuration;
import com.briozing.automation.utilities.CommonMethods;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class BlogPage  {

    CommonMethods commonMethods = new CommonMethods();

    @FindBy(xpath = "(//a[contains(@href,'briozing.com')])[1]")
    private WebElement logoBriozing;

    @FindBy(xpath = "(//a[contains(text(),'Blog')])[1]")
    private WebElement linkBlog;

    @FindBy(xpath = "(//a[contains(text(),'Home')])[1]")
    private WebElement linkHome;

//    @FindBy(xpath = "//a[@href='https://briozing.com/blog/']"
//    public WebElement DevopsPostTitle;

//    @FindBy(xpath = "//img[@src='https://i1.wp.com/briozing.com/wp-content/uploads/2019/12/train-tracks.jpg?fit=800%2C533&ssl=1']")
//    public WebElement DevopsLogo;

    @FindBy(xpath = "//img[@src='https://i1.wp.com/briozing.com/wp-content/uploads/2019/12/train-tracks.jpg?fit=800%2C533&ssl=1']")
    public List<WebElement> DevopsLogo;

    @FindBy(xpath = "//img[@src='https://i2.wp.com/briozing.com/wp-content/uploads/2019/12/are-translation-tests-a-good-idea-1-cover.jpg?fit=1024%2C427&ssl=1']")
    public List<WebElement> AutomationLogo;

    @FindBy(xpath = "//img[@src='https://i1.wp.com/briozing.com/wp-content/uploads/2019/09/helm-1.png?fit=1024%2C538&ssl=1']")
    public List<WebElement> HelmLogo;

    @FindBy(xpath = "//img[@src='https://i0.wp.com/briozing.com/wp-content/uploads/2019/06/og-image-large-e60c82fe.png?fit=1024%2C538&ssl=1']")
    public List<WebElement> TerraformLogo;

    @FindBy(xpath = "//img[@src='https://i0.wp.com/briozing.com/wp-content/uploads/2019/06/one_click.jpeg?fit=1024%2C546&ssl=1']")
    public List<WebElement> CycleLogo;

    @FindBy(xpath = "//input[@type='search']")
    public List<WebElement> SearchBox;

    @FindBy(xpath = "//img[@src='https://i1.wp.com/briozing.com/wp-content/uploads/2019/12/cropped-only-text.png?fit=1744%2C653&ssl=1']")
    public List<WebElement> BriozingLogo;

    @FindBy(xpath = "//a[@href='mailto:tech.support@briozing.com']")
    public List<WebElement> Email;

    @FindBy(xpath = "//div[@class='post-list row']/div[1]//h2")
    public List<WebElement> PostTitleDevops;

    @FindBy(xpath = "//div[@class='post-list row']/div[2]//h2")
    public List<WebElement> PostTitleAutomation;

    @FindBy(xpath = "//div[@class='post-list row']/div[3]//h2")
    public List<WebElement> PostTitleHelm;

    @FindBy(xpath = "//div[@class='post-list row']/div[4]//h2")
    public List<WebElement> PostTitleGoogleCloud;

    @FindBy(xpath = "//div[@class='post-list row']/div[5]//h2")
    public List<WebElement> PostTitleTerraform;

    @FindBy(xpath = "//div[@class='post-list row']/div[6]//h2")
    public List<WebElement> PostTitleCycle;

    @FindBy(xpath = "//div[@class='post-list row']/div[7]//h2")
    public List<WebElement> PostTitleMicroServices;

    @FindBy(xpath = "//div[@class='post-list row']/div[9]//h2")
    public List<WebElement> PostTitleDevelopersRole;

    @FindBy(xpath = "//div[@id='recent-posts-2']/h5[1]")
    public List<WebElement> RecentPost;

    @FindBy(xpath = "//div[@id='wpcw_contact-7']/h5[1]")
    public List<WebElement> ContactUs;

    @FindBy(xpath = "//h1[@class='hero-title']")
    public List<WebElement> BlogTitle;




    public BlogPage() throws Exception {
        PageFactory.initElements(WebDriverFactory.getDriver(), this);
    }

    public BlogPage launch() throws Exception {
        return PageFactory.initElements(WebDriverFactory.getDriver(), BlogPage.class);
    }
    public List<WebElement>getPageDevopsLogo() throws Exception{
        return DevopsLogo;
    }
    public List<WebElement>getPageAutomationLogo() throws Exception{
        return AutomationLogo;
    }
    public List<WebElement>getPageHelmLogo() throws Exception{
        return HelmLogo;
    }
    public List<WebElement>getPageTerraformLogo() throws Exception{
        return TerraformLogo;
    }
    public List<WebElement>getPageCycleLogo() throws Exception{
        return CycleLogo;
    }
    public List<WebElement>getSearchBox() throws Exception{
        return SearchBox;
    }
    public List<WebElement>getBriozingLogo() throws Exception{
        return BriozingLogo;
    }
    public List<WebElement>getEmail() throws Exception{
        return Email;
    }
    public List<WebElement>getPostTitleDevops() throws Exception{
        return PostTitleDevops;
    }
    public List<WebElement>getPostTitleAutomation() throws Exception{
        return PostTitleAutomation;
    }
    public List<WebElement>getPostTitleHelm() throws Exception{
        return PostTitleHelm;
    }
    public List<WebElement>getPostTitleGoogleCloud() throws Exception{
        return PostTitleGoogleCloud;
    }
    public List<WebElement>getPostTitleTerraform() throws Exception{
        return PostTitleTerraform;
    }
    public List<WebElement>getPostTitleCycle() throws Exception{
        return PostTitleCycle;
    }
    public List<WebElement>getPostTitleMicroServices() throws Exception{
        return PostTitleMicroServices;
    }
    public List<WebElement>getPostTitleDevelopersRole() throws Exception{
        return PostTitleDevelopersRole;
    }
    public List<WebElement>getRecentPost() throws Exception{
        return RecentPost;
    }
    public List<WebElement>getContactUs() throws Exception{
        return ContactUs;
    }
    public List<WebElement>getBlogTitle() throws Exception{
        return BlogTitle;
    }



}
