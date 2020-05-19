package com.briozing.automation.helpers;

import com.briozing.automation.base.WebDriverFactory;
import com.briozing.automation.factory.Log4JFactory;
import com.briozing.automation.pageobjects.*;
import com.briozing.automation.utilities.AppAssert;
import com.briozing.automation.utilities.CommonMethods;
import com.briozing.automation.config.Configuration;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class ValidationHelper {

    Logger logger = Log4JFactory.getLogger(this.getClass().getSimpleName());
    CommonMethods commonMethods = new CommonMethods();

    public void validatePageTitle(String expectedTitle) throws Exception {
        String currentTitle = WebDriverFactory.getDriver().getTitle();
        logger.info("Page Title: " + currentTitle);
        AppAssert.assertTrue(currentTitle.contains(expectedTitle));
    }

    public void validateHomePageDetails(HomePage homePage) throws Exception {
        commonMethods.pause(2000);
        AppAssert.assertTrue(homePage.logoBriozing.isDisplayed(), "Briozing Logo not displayed");
        logger.info("Current Url: " + WebDriverFactory.getDriver().getCurrentUrl());
    }

    public void validateConnectWithUs(HomePage homePage) throws Exception{
        commonMethods.pause(2000);
        AppAssert.assertTrue(homePage.Connection.isDisplayed(),"Connect with us displayed");
        logger.info("Current Url:"+ WebDriverFactory.getDriver().getCurrentUrl());
    }

    public void validateConnectWithUsName(HomePage homePage) throws Exception{
        commonMethods.pause(2000);
        AppAssert.assertTrue(homePage.ConnectionName.isDisplayed(),"Name displayed");
        logger.info("Current Url:"+ WebDriverFactory.getDriver().getCurrentUrl());
    }

    public void validateConnectWithUsNameFirst(HomePage homePage) throws Exception{
        commonMethods.pause(2000);
        AppAssert.assertTrue(homePage.ConnectionNameFirst.isDisplayed()," First Name displayed");
        logger.info("Current Url:"+ WebDriverFactory.getDriver().getCurrentUrl());
    }

    public void validateConnectWithUsNameLast(HomePage homePage) throws Exception{
        commonMethods.pause(2000);
        AppAssert.assertTrue(homePage.ConnectionNameLast.isDisplayed()," Last Name displayed");
        logger.info("Current Url:"+ WebDriverFactory.getDriver().getCurrentUrl());
    }

    public void validateConnectWithUsEmail(HomePage homePage) throws Exception{
        commonMethods.pause(2000);
        AppAssert.assertTrue(homePage.ConnectionEmail.isDisplayed()," Email displayed");
        logger.info("Current Url:"+ WebDriverFactory.getDriver().getCurrentUrl());
    }

    public void validateConnectWithUsPhoneNumber(HomePage homePage) throws Exception{
        commonMethods.pause(2000);
        AppAssert.assertTrue(homePage.ConnectionPhoneNumber.isDisplayed(),"Phone number displayed");
        logger.info("Current Url:"+ WebDriverFactory.getDriver().getCurrentUrl());
    }

    public void validateConnectWithUsSubmit(HomePage homePage) throws Exception{
        commonMethods.pause(2000);
        AppAssert.assertTrue(homePage.ConnectionSubmitButton.isDisplayed()," Submit button displayed");
        logger.info("Current Url:"+ WebDriverFactory.getDriver().getCurrentUrl());
    }

    public void validateClientsQuickHeal(HomePage homePage) throws Exception{
        commonMethods.pause(2000);
        AppAssert.assertTrue(homePage.ClientsQuickHeal.isDisplayed()," Client Quickheal logo displayed");
        logger.info("Current Url:"+ WebDriverFactory.getDriver().getCurrentUrl());
    }

    public void validateClientsSapience(HomePage homePage) throws Exception{
        commonMethods.pause(2000);
        AppAssert.assertTrue(homePage.ClientsSapience.isDisplayed()," Client Sapience displayed");
        logger.info("Current Url:"+ WebDriverFactory.getDriver().getCurrentUrl());
    }

    public void validateClientsDL(HomePage homePage) throws Exception{
        commonMethods.pause(2000);
        AppAssert.assertTrue(homePage.ClientsDL.isDisplayed()," Client DL displayed");
        logger.info("Current Url:"+ WebDriverFactory.getDriver().getCurrentUrl());
    }

    public void validateClientsCybrella(HomePage homePage) throws Exception{
        commonMethods.pause(2000);
        AppAssert.assertTrue(homePage.ClientsDCybrella.isDisplayed()," Client Cybrella displayed");
        logger.info("Current Url:"+ WebDriverFactory.getDriver().getCurrentUrl());
    }

    public void validateClientsVuclips(HomePage homePage) throws Exception{
        commonMethods.pause(2000);
        AppAssert.assertTrue(homePage.ClientsVuclips.isDisplayed()," Client Cybrella displayed");
        logger.info("Current Url:"+ WebDriverFactory.getDriver().getCurrentUrl());
    }

    public void validateClientsA4Technologies(HomePage homePage) throws Exception{
        commonMethods.pause(2000);
        AppAssert.assertTrue(homePage.ClientsA4Technologies.isDisplayed()," Client Cybrella displayed");
        logger.info("Current Url:"+ WebDriverFactory.getDriver().getCurrentUrl());
    }

    public void validateProductArchitectureLogo(HomePage homePage) throws Exception{
        commonMethods.pause(2000);
        AppAssert.assertTrue(homePage.ProductArchitectureLogo.isDisplayed()," Product Architecture logo is displayed");
        logger.info("Current Url:"+ WebDriverFactory.getDriver().getCurrentUrl());
    }

    public void validateAutomatedTestingLogo(HomePage homePage) throws Exception{
        commonMethods.pause(2000);
        AppAssert.assertTrue(homePage.AutomatedTestingLogo.isDisplayed()," Automated Testing logo is displayed");
        logger.info("Current Url:"+ WebDriverFactory.getDriver().getCurrentUrl());
    }

    public void validateDevopsLogo(HomePage homePage) throws Exception{
        commonMethods.pause(2000);
        AppAssert.assertTrue(homePage.DevopsLogo.isDisplayed()," Devops logo is displayed");
        logger.info("Current Url:"+ WebDriverFactory.getDriver().getCurrentUrl());
    }

    public void validateHomePageArrowDownLogo(HomePage homePage) throws Exception{
        commonMethods.pause(2000);
        AppAssert.assertTrue(homePage.HomePageArrowDownLogo.isDisplayed()," Home page arrow down logo is displayed");
        logger.info("Current Url:"+ WebDriverFactory.getDriver().getCurrentUrl());
    }

    public void validateHomePageArrowDownMotion(HomePage homePage) throws Exception{
        commonMethods.pause(2000);
        AppAssert.assertTrue(homePage.HomePageArrowDownMotion.isDisplayed()," Home page arrow down logo is in motion");
        logger.info("Current Url:"+ WebDriverFactory.getDriver().getCurrentUrl());
    }

    public void validateGetStartedButton(HomePage homePage) throws Exception{
        commonMethods.pause(2000);
        AppAssert.assertTrue(homePage.GetStartedButton.isDisplayed()," Get Started button is displayed");
        logger.info("Current Url:"+ WebDriverFactory.getDriver().getCurrentUrl());
    }

    public void validateBriozingLogoReload(HomePage homePage) throws Exception{
        commonMethods.pause(2000);
        AppAssert.assertTrue(homePage.BriozingLogoReload.isDisplayed()," Briozing logo reloading");
        logger.info("Current Url:"+ WebDriverFactory.getDriver().getCurrentUrl());
    }

    public void validatePageScrollingTop(HomePage homePage) throws Exception{
        commonMethods.pause(2000);
        AppAssert.assertTrue(homePage.getPageScrollingTop().size()>0," click on page scrolling top it goes to top");
        commonMethods.pause(5000);
        logger.info("Current Url:"+ WebDriverFactory.getDriver().getCurrentUrl());
    }

    public void validatePageScrollingClients(HomePage homePage) throws Exception{
        commonMethods.pause(2000);
        AppAssert.assertTrue(homePage.getPageScrollingClients().size()>0," click on page scrolling clients shows clients");
        logger.info("Current Url:"+ WebDriverFactory.getDriver().getCurrentUrl());
    }

    public void validatePageScrollingCore(HomePage homePage) throws Exception{
        commonMethods.pause(2000);
        AppAssert.assertTrue(homePage.getPageScrollingCore().size()>0," click on page scrolling Core shows Core");
        logger.info("Current Url:"+ WebDriverFactory.getDriver().getCurrentUrl());
    }

    public void validatePageScrollingAbout(HomePage homePage) throws Exception{
        commonMethods.pause(2000);
        AppAssert.assertTrue(homePage.getPageScrollingAbout().size()>0," click on page scrolling About shows About");
        logger.info("Current Url:"+ WebDriverFactory.getDriver().getCurrentUrl());
    }

    public void validatePageScrollingFeatures(HomePage homePage) throws Exception{
        commonMethods.pause(2000);
        AppAssert.assertTrue(homePage.getPageScrollingFeature().size()>0," click on page scrolling Features shows Features");
        logger.info("Current Url:"+ WebDriverFactory.getDriver().getCurrentUrl());
    }

    public void validatePageScrollingCta(HomePage homePage) throws Exception{
        commonMethods.pause(2000);
        AppAssert.assertTrue(homePage.getPageScrollingCta().size()>0," click on page scrolling Cta shows Cta");
        logger.info("Current Url:"+ WebDriverFactory.getDriver().getCurrentUrl());
    }

    public void validatePageScrollingTeam(HomePage homePage) throws Exception{
        commonMethods.pause(2000);
        AppAssert.assertTrue(homePage.getPageScrollingTeam().size()>0," click on page scrolling Team shows Team");
        logger.info("Current Url:"+ WebDriverFactory.getDriver().getCurrentUrl());
    }

    public void validatePageScrollingBlogs(HomePage homePage) throws Exception{
        commonMethods.pause(2000);
        AppAssert.assertTrue(homePage.getPageScrollingBlog().size()>0," click on page scrolling Blog shows Blog");
        logger.info("Current Url:"+ WebDriverFactory.getDriver().getCurrentUrl());
    }
    ///////////////////////////////////////////////////Blog validations//////////////////////////////////////////////////////////////////////////////

    public void validatePageBlogDevopslogo(BlogPage blogPage) throws Exception{
        commonMethods.pause(2000);
        AppAssert.assertTrue(blogPage.getPageDevopsLogo().size()>0," Devops logo is displayed");
        logger.info("Current Url:"+ WebDriverFactory.getDriver().getCurrentUrl());
    }
    public void validatePageBlogAutomationLogo(BlogPage blogPage) throws Exception{
        commonMethods.pause(2000);
        AppAssert.assertTrue(blogPage.getPageAutomationLogo().size()>0," Automation logo is displayed");
        logger.info("Current Url:"+ WebDriverFactory.getDriver().getCurrentUrl());
    }
    public void validatePageBlogHelmLogo(BlogPage blogPage) throws Exception{
        commonMethods.pause(2000);
        AppAssert.assertTrue(blogPage.getPageHelmLogo().size()>0," Helm logo is displayed");
        logger.info("Current Url:"+ WebDriverFactory.getDriver().getCurrentUrl());
    }
    public void validatePageBlogTerraformLogo(BlogPage blogPage) throws Exception{
        commonMethods.pause(2000);
        AppAssert.assertTrue(blogPage.getPageTerraformLogo().size()>0," Terraform logo is displayed");
        logger.info("Current Url:"+ WebDriverFactory.getDriver().getCurrentUrl());
    }
    public void validatePageBlogCycleLogo(BlogPage blogPage) throws Exception{
        commonMethods.pause(2000);
        AppAssert.assertTrue(blogPage.getPageCycleLogo().size()>0," Cycle logo is displayed");
        logger.info("Current Url:"+ WebDriverFactory.getDriver().getCurrentUrl());
    }
    public void validatePageBlogSearchBox(BlogPage blogPage) throws Exception{
        commonMethods.pause(2000);
        AppAssert.assertTrue(blogPage.getSearchBox().size()>0," Search box is displayed");
        logger.info("Current Url:"+ WebDriverFactory.getDriver().getCurrentUrl());
    }
    public void validatePageBlogBriozingLogo(BlogPage blogPage) throws Exception{
        commonMethods.pause(2000);
        AppAssert.assertTrue(blogPage.getBriozingLogo().size()>0," Briozing logo is displayed");
        logger.info("Current Url:"+ WebDriverFactory.getDriver().getCurrentUrl());
    }
    public void validatePageBlogEmail(BlogPage blogPage) throws Exception{
        commonMethods.pause(2000);
        AppAssert.assertTrue(blogPage.getEmail().size()>0," Email is displayed");
        logger.info("Current Url:"+ WebDriverFactory.getDriver().getCurrentUrl());
    }
    public void validatePageBlogPostDevops(BlogPage blogPage) throws Exception{
        commonMethods.pause(2000);
        AppAssert.assertTrue(blogPage.getPostTitleDevops().size()>0," Devops post title is displayed");
        logger.info("Current Url:"+ WebDriverFactory.getDriver().getCurrentUrl());
    }
    public void validatePageBlogPostAutomation(BlogPage blogPage) throws Exception{
        commonMethods.pause(2000);
        AppAssert.assertTrue(blogPage.getPostTitleAutomation().size()>0," Automation post title is displayed");
        logger.info("Current Url:"+ WebDriverFactory.getDriver().getCurrentUrl());
    }
    public void validatePageBlogPostHelm(BlogPage blogPage) throws Exception{
        commonMethods.pause(2000);
        AppAssert.assertTrue(blogPage.getPostTitleHelm().size()>0," Helm post title is displayed");
        logger.info("Current Url:"+ WebDriverFactory.getDriver().getCurrentUrl());
    }
    public void validatePageBlogPostGoogleCloud(BlogPage blogPage) throws Exception{
        commonMethods.pause(2000);
        AppAssert.assertTrue(blogPage.getPostTitleGoogleCloud().size()>0," Google cloud post title is displayed");
        logger.info("Current Url:"+ WebDriverFactory.getDriver().getCurrentUrl());
    }
    public void validatePageBlogPostTerraform(BlogPage blogPage) throws Exception{
        commonMethods.pause(2000);
        AppAssert.assertTrue(blogPage.getPostTitleTerraform().size()>0," Terraform post title is displayed");
        logger.info("Current Url:"+ WebDriverFactory.getDriver().getCurrentUrl());
    }
    public void validatePageBlogPostCycle(BlogPage blogPage) throws Exception{
        commonMethods.pause(2000);
        AppAssert.assertTrue(blogPage.getPostTitleCycle().size()>0," Cycle post title is displayed");
        logger.info("Current Url:"+ WebDriverFactory.getDriver().getCurrentUrl());
    }
    public void validatePageBlogPostMicroService(BlogPage blogPage) throws Exception{
        commonMethods.pause(2000);
        AppAssert.assertTrue(blogPage.getPostTitleMicroServices().size()>0," Micro service post title is displayed");
        logger.info("Current Url:"+ WebDriverFactory.getDriver().getCurrentUrl());
    }
    public void validatePageBlogPostDevelopersRole(BlogPage blogPage) throws Exception{
        commonMethods.pause(2000);
        AppAssert.assertTrue(blogPage.getPostTitleDevelopersRole().size()>0," Developers role post title is displayed");
        logger.info("Current Url:"+ WebDriverFactory.getDriver().getCurrentUrl());
    }
    public void validateRecentPost(BlogPage blogPage) throws Exception{
        commonMethods.pause(2000);
        AppAssert.assertTrue(blogPage.getRecentPost().size()>0," Recent post is displayed");
        logger.info("Current Url:"+ WebDriverFactory.getDriver().getCurrentUrl());
    }
    public void validateContactUs(BlogPage blogPage) throws Exception{
        commonMethods.pause(2000);
        AppAssert.assertTrue(blogPage.getContactUs().size()>0," Contact us post is displayed");
        logger.info("Current Url:"+ WebDriverFactory.getDriver().getCurrentUrl());
    }
    public void validateBlogTitle(BlogPage blogPage) throws Exception{
        commonMethods.pause(2000);
        AppAssert.assertTrue(blogPage.getBlogTitle().size()>0," Blog title is displayed");
        logger.info("Current Url:"+ WebDriverFactory.getDriver().getCurrentUrl());
    }




}
