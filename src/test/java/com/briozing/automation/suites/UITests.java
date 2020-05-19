package com.briozing.automation.suites;

import com.briozing.automation.base.BaseTest;
import com.briozing.automation.factory.Log4JFactory;
import com.briozing.automation.helpers.ValidationHelper;
import com.briozing.automation.listeners.MethodListener;
import com.briozing.automation.pageobjects.BlogPage;
import com.briozing.automation.pageobjects.HomePage;
import com.briozing.automation.utilities.AppAssert;
import com.briozing.automation.utilities.CommonMethods;
import com.briozing.automation.utilities.TestConstants;
import org.apache.log4j.Logger;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({MethodListener.class})
public class UITests extends BaseTest {

    CommonMethods commonMethods = new CommonMethods();
    Logger logger = Log4JFactory.getLogger(this.getClass().getSimpleName());
    ValidationHelper validationHelper = new ValidationHelper();

    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "Briozing"}, description = "Verify HOme Page")
    public void verify_home_page() {
        try {
            HomePage homePageObj = new HomePage();
            validationHelper.validateHomePageDetails(homePageObj.launch());
        } catch (Exception ex) {
            logger.error(ex.getMessage());
            AppAssert.assertTrue(false, ex.getMessage());
        }
    }

    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "VerifyConnectionWithUs","homePage"}, description = "Verify connection with us")
    public void verify_connection_with_us(){
        try{
            HomePage homePageObj = new HomePage();
            validationHelper.validateConnectWithUs(homePageObj.launch());

        }catch (Exception ex){
            logger.error(ex.getMessage());
            AppAssert.assertTrue(false,ex.getMessage());
        }
    }

    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "VerifyName","homePage"}, description = "Verify Name")
    public void verify_connection_with_us_name(){
        try{
            HomePage homePageObj = new HomePage();
            validationHelper.validateConnectWithUsName(homePageObj.launch());

        }catch (Exception ex){
            logger.error(ex.getMessage());
            AppAssert.assertTrue(false,ex.getMessage());
        }
    }

    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "VerifyFirstNameBox","homePage"}, description = "Verify First Name")
    public void verify_connection_with_us_name_first(){
        try{
            HomePage homePageObj = new HomePage();
            validationHelper.validateConnectWithUsNameFirst(homePageObj.launch());

        }catch (Exception ex){
            logger.error(ex.getMessage());
            AppAssert.assertTrue(false,ex.getMessage());
        }
    }

    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "VerifyLastNameBox","homePage"}, description = "Verify Last Name")
    public void verify_connection_with_us_name_last(){
        try{
            HomePage homePageObj = new HomePage();
            validationHelper.validateConnectWithUsNameLast(homePageObj.launch());

        }catch (Exception ex){
            logger.error(ex.getMessage());
            AppAssert.assertTrue(false,ex.getMessage());
        }
    }

    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "VerifyEmailBox","homePage"}, description = "Verify Email")
    public void verify_connection_with_us_email(){
        try{
            HomePage homePageObj = new HomePage();
            validationHelper.validateConnectWithUsEmail(homePageObj.launch());

        }catch (Exception ex){
            logger.error(ex.getMessage());
            AppAssert.assertTrue(false,ex.getMessage());
        }
    }
    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "VerifyPhoneNumberBox","homePage"}, description = "Verify Phone number")
    public void verify_connection_with_us_PhoneNumber(){
        try{
            HomePage homePageObj = new HomePage();
            validationHelper.validateConnectWithUsPhoneNumber(homePageObj.launch());

        }catch (Exception ex){
            logger.error(ex.getMessage());
            AppAssert.assertTrue(false,ex.getMessage());
        }
    }
    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "VerifyMessageBox","homePage"}, description = "Verify Message")
    public void verify_connection_with_us_Message(){
        try{
            HomePage homePageObj = new HomePage();
            validationHelper.validateConnectWithUsSubmit(homePageObj.launch());

        }catch (Exception ex){
            logger.error(ex.getMessage());
            AppAssert.assertTrue(false,ex.getMessage());
        }
    }
    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "VerifySubmitButton","homePage"}, description = "Verify Submit button")
    public void verify_connection_with_us_Submit(){
        try{
            HomePage homePageObj = new HomePage();
            validationHelper.validateConnectWithUsSubmit(homePageObj.launch());

        }catch (Exception ex){
            logger.error(ex.getMessage());
            AppAssert.assertTrue(false,ex.getMessage());
        }
    }
    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "VerifyClientQuickHeal","homePage"}, description = "Verify Quickheal client")
    public void verify_clients_quickheal(){
        try{
            HomePage homePageObj = new HomePage();
            validationHelper.validateClientsQuickHeal(homePageObj.launch());

        }catch (Exception ex){
            logger.error(ex.getMessage());
            AppAssert.assertTrue(false,ex.getMessage());
        }
    }
    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "VerifyClientSapience","homePage"}, description = "Verify Sapience client")
    public void verify_clients_sapience(){
        try{
            HomePage homePageObj = new HomePage();
            validationHelper.validateClientsSapience(homePageObj.launch());

        }catch (Exception ex){
            logger.error(ex.getMessage());
            AppAssert.assertTrue(false,ex.getMessage());
        }
    }
    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "VerifyClientDL","homePage"}, description = "Verify DL client")
    public void verify_clients_DL(){
        try{
            HomePage homePageObj = new HomePage();
            validationHelper.validateClientsDL(homePageObj.launch());

        }catch (Exception ex){
            logger.error(ex.getMessage());
            AppAssert.assertTrue(false,ex.getMessage());
        }
    }
    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "VerifyClientCybrella","homePage"}, description = "Verify Cybrella client")
    public void verify_clients_cybrella(){
        try{
            HomePage homePageObj = new HomePage();
            validationHelper.validateClientsCybrella(homePageObj.launch());

        }catch (Exception ex){
            logger.error(ex.getMessage());
            AppAssert.assertTrue(false,ex.getMessage());
        }
    }
    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "VerifyClientVuclips","homePage"}, description = "Verify VUclips client")
    public void verify_clients_vuclips(){
        try{
            HomePage homePageObj = new HomePage();
            validationHelper.validateClientsVuclips(homePageObj.launch());

        }catch (Exception ex){
            logger.error(ex.getMessage());
            AppAssert.assertTrue(false,ex.getMessage());
        }
    }
    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "VerifyClientA4technologies","homePage"}, description = "Verify A4 Technologies client")
    public void verify_clients_a4technologies(){
        try{
            HomePage homePageObj = new HomePage();
            validationHelper.validateClientsA4Technologies(homePageObj.launch());

        }catch (Exception ex){
            logger.error(ex.getMessage());
            AppAssert.assertTrue(false,ex.getMessage());
        }
    }
    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "VerifyProductArchitechtureLogo","homePage"}, description = "Verify Product architechture logo")
    public void verify_product_architecture_logo(){
        try{
            HomePage homePageObj = new HomePage();
            validationHelper.validateProductArchitectureLogo(homePageObj.launch());

        }catch (Exception ex){
            logger.error(ex.getMessage());
            AppAssert.assertTrue(false,ex.getMessage());
        }
    }
    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "VerifyAutomatedTestingLogo","homePage"}, description = "Verify Automated testing logo")
    public void verify_automated_testing_logo(){
        try{
            HomePage homePageObj = new HomePage();
            validationHelper.validateAutomatedTestingLogo(homePageObj.launch());

        }catch (Exception ex){
            logger.error(ex.getMessage());
            AppAssert.assertTrue(false,ex.getMessage());
        }
    }
    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "VerifyDevopsLogo","homePage"}, description = "Verify Devops logo")
    public void verify_devops_logo(){
        try{
            HomePage homePageObj = new HomePage();
            validationHelper.validateDevopsLogo(homePageObj.launch());

        }catch (Exception ex){
            logger.error(ex.getMessage());
            AppAssert.assertTrue(false,ex.getMessage());
        }
    }
    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "VerifyArrowDownLogo","homePage"}, description = "Verify Arrow down logo")
    public void verify_homepage_arrowdown_logo(){
        try{
            HomePage homePageObj = new HomePage();
            validationHelper.validateHomePageArrowDownLogo(homePageObj.launch());

        }catch (Exception ex){
            logger.error(ex.getMessage());
            AppAssert.assertTrue(false,ex.getMessage());
        }
    }
    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "VerifyArrowDownMotion","homePage"}, description = "Verify arrow down motion")
    public void verify_homepage_arrowdown_motion(){
        try{
            HomePage homePageObj = new HomePage();
            validationHelper.validateHomePageArrowDownMotion(homePageObj.launch());

        }catch (Exception ex){
            logger.error(ex.getMessage());
            AppAssert.assertTrue(false,ex.getMessage());
        }
    }
    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "VerifyGetStartedButton","homePage"}, description = "Verify get started button")
    public void verify_get_started_button(){
        try{
            HomePage homePageObj = new HomePage();
            validationHelper.validateGetStartedButton(homePageObj.launch());

        }catch (Exception ex){
            logger.error(ex.getMessage());
            AppAssert.assertTrue(false,ex.getMessage());
        }
    }
    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "VerifyLogoReload","homePage"}, description = "Verify Logo to reload")
    public void verify_briozing_logo_reload(){
        try{
            HomePage homePageObj = new HomePage();
            validationHelper.validateBriozingLogoReload(homePageObj.launch());

        }catch (Exception ex){
            logger.error(ex.getMessage());
            AppAssert.assertTrue(false,ex.getMessage());
        }
    }
    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "VerifyPageScrollingTop","homePage"}, description = "Verify Page is scrolling to top")
    public void verify_pagescrolling_top(){
        try{
            HomePage homePageObj = new HomePage();
            validationHelper.validatePageScrollingTop(homePageObj.launch());

        }catch (Exception ex){
            logger.error(ex.getMessage());
            AppAssert.assertTrue(false,ex.getMessage());
        }
    }
    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "VerifyPageScrollingClients","homePage"}, description = "Verify Page is scrolling to clients")
    public void verify_pagescrolling_clients(){
        try{
            HomePage homePageObj = new HomePage();
            validationHelper.validatePageScrollingClients(homePageObj.launch());

        }catch (Exception ex){
            logger.error(ex.getMessage());
            AppAssert.assertTrue(false,ex.getMessage());
        }
    }
    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "VerifyPageScrollingCore","homePage"}, description = "Verify Page scrolling to core")
    public void verify_pagescrolling_core(){
        try{
            HomePage homePageObj = new HomePage();
            validationHelper.validatePageScrollingCore(homePageObj.launch());

        }catch (Exception ex){
            logger.error(ex.getMessage());
            AppAssert.assertTrue(false,ex.getMessage());
        }
    }
    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "VerifyPageScrollingAbout","homePage"}, description = "Verify Page scrolling to about")
    public void verify_pagescrolling_about(){
        try{
            HomePage homePageObj = new HomePage();
            validationHelper.validatePageScrollingAbout(homePageObj.launch());

        }catch (Exception ex){
            logger.error(ex.getMessage());
            AppAssert.assertTrue(false,ex.getMessage());
        }
    }
    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "VerifyPageScrollingFeatures","homePage"}, description = "Verify Page scrolling to features")
    public void verify_pagescrolling_features(){
        try{
            HomePage homePageObj = new HomePage();
            validationHelper.validatePageScrollingFeatures(homePageObj.launch());

        }catch (Exception ex){
            logger.error(ex.getMessage());
            AppAssert.assertTrue(false,ex.getMessage());
        }
    }
    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "VerifyPageScrollingCta","homePage"}, description = "Verify Page scrolling to cta")
    public void verify_pagescrolling_Cta(){
        try{
            HomePage homePageObj = new HomePage();
            validationHelper.validatePageScrollingCta(homePageObj.launch());

        }catch (Exception ex){
            logger.error(ex.getMessage());
            AppAssert.assertTrue(false,ex.getMessage());
        }
    }
    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "VerifyPageScrollingTeam","homePage"}, description = "Verify Page scrolling to team")
    public void verify_pagescrolling_Team(){
        try{
            HomePage homePageObj = new HomePage();
            validationHelper.validatePageScrollingTeam(homePageObj.launch());

        }catch (Exception ex){
            logger.error(ex.getMessage());
            AppAssert.assertTrue(false,ex.getMessage());
        }
    }
    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "VerifyPageScrollingBlog","homePage"}, description = "Verify page scrolling to blog")
    public void verify_pagescrolling_Blog(){
        try{
            HomePage homePageObj = new HomePage();
            validationHelper.validatePageScrollingBlogs(homePageObj.launch());

        }catch (Exception ex){
            logger.error(ex.getMessage());
            AppAssert.assertTrue(false,ex.getMessage());
        }
    }
/////////////////////////////////////////////////////Blog UI tests//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "Briozing30"}, description = "Verify Blog Page")
//    public void verify_devops_post_title(){
//        try{
//            BlogPage blogPageObj = new BlogPage();
//            validationHelper.validatePageBlogPostTitle(blogPageObj.launch());
//
//        }catch (Exception ex){
//            logger.error(ex.getMessage());
//            AppAssert.assertTrue(false,ex.getMessage());
//        }
//    }

    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "VerifyDevopsLogo","blogPage"}, description = "Verify Devops logo")
    public void verify_blogDevops_logo(){
        try{
            HomePage homePage = new HomePage();
            validationHelper.validatePageBlogDevopslogo(homePage.launch().navigateToBlog());

        }catch (Exception ex){
            logger.error(ex.getMessage());
            AppAssert.assertTrue(false,ex.getMessage());
        }
    }
    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "VerifyAutomationLogo","blogPage"}, description = "Verify Automation logo")
    public void verify_blogAutomation_logo(){
        try{
            HomePage homePage = new HomePage();
            validationHelper.validatePageBlogAutomationLogo(homePage.launch().navigateToBlog());

        }catch (Exception ex){
            logger.error(ex.getMessage());
            AppAssert.assertTrue(false,ex.getMessage());
        }
    }
    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "VerifyHelmLogo","blogPage"}, description = "Verify Helm logo")
    public void verify_blogHelm_logo(){
        try{
            HomePage homePage = new HomePage();
            validationHelper.validatePageBlogHelmLogo(homePage.launch().navigateToBlog());

        }catch (Exception ex){
            logger.error(ex.getMessage());
            AppAssert.assertTrue(false,ex.getMessage());
        }
    }
    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "VerifyTerraformLogo","blogPage"}, description = "Verify Terraform logo")
    public void verify_blogTerraform_logo(){
        try{
            HomePage homePage = new HomePage();
            validationHelper.validatePageBlogTerraformLogo(homePage.launch().navigateToBlog());

        }catch (Exception ex){
            logger.error(ex.getMessage());
            AppAssert.assertTrue(false,ex.getMessage());
        }
    }
    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "VerifyCycleLogo","blogPage"}, description = "Verify Cycle logo")
    public void verify_blogCycle_logo(){
        try{
            HomePage homePage = new HomePage();
            validationHelper.validatePageBlogCycleLogo(homePage.launch().navigateToBlog());

        }catch (Exception ex){
            logger.error(ex.getMessage());
            AppAssert.assertTrue(false,ex.getMessage());
        }
    }
    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "VerifySearchBox","blogPage"}, description = "Verify Search box")
    public void verify_searchBox(){
        try{
            HomePage homePage = new HomePage();
            validationHelper.validatePageBlogSearchBox(homePage.launch().navigateToBlog());

        }catch (Exception ex){
            logger.error(ex.getMessage());
            AppAssert.assertTrue(false,ex.getMessage());
        }
    }
    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "VerifyBriozingLogo","blogPage"}, description = "Verify Briozing logo")
    public void verify_briozingLogo(){
        try{
            HomePage homePage = new HomePage();
            validationHelper.validatePageBlogBriozingLogo(homePage.launch().navigateToBlog());

        }catch (Exception ex){
            logger.error(ex.getMessage());
            AppAssert.assertTrue(false,ex.getMessage());
        }
    }
    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "VerifyEmail","blogPage"}, description = "Verify Email")
    public void verify_Email(){
        try{
            HomePage homePage = new HomePage();
            validationHelper.validatePageBlogEmail(homePage.launch().navigateToBlog());

        }catch (Exception ex){
            logger.error(ex.getMessage());
            AppAssert.assertTrue(false,ex.getMessage());
        }
    }
    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "PostDevops","blogPage"}, description = "Verify Devops post")
    public void verify_post_title_devops(){
        try{
            HomePage homePage = new HomePage();
            validationHelper.validatePageBlogPostDevops(homePage.launch().navigateToBlog());

        }catch (Exception ex){
            logger.error(ex.getMessage());
            AppAssert.assertTrue(false,ex.getMessage());
        }
    }
    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "PostAutomation","blogPage"}, description = "Verify Automation post")
    public void verify_post_title_automation(){
        try{
            HomePage homePage = new HomePage();
            validationHelper.validatePageBlogPostAutomation(homePage.launch().navigateToBlog());

        }catch (Exception ex){
            logger.error(ex.getMessage());
            AppAssert.assertTrue(false,ex.getMessage());
        }
    }
    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "PostHelm","blogPage"}, description = "Verify Helm post")
    public void verify_post_title_helm(){
        try{
            HomePage homePage = new HomePage();
            validationHelper.validatePageBlogPostHelm(homePage.launch().navigateToBlog());

        }catch (Exception ex){
            logger.error(ex.getMessage());
            AppAssert.assertTrue(false,ex.getMessage());
        }
    }
    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "PostGoogleCloud","blogPage"}, description = "Verify Google Cloud post")
    public void verify_post_title_googleCloud(){
        try{
            HomePage homePage = new HomePage();
            validationHelper.validatePageBlogPostGoogleCloud(homePage.launch().navigateToBlog());

        }catch (Exception ex){
            logger.error(ex.getMessage());
            AppAssert.assertTrue(false,ex.getMessage());
        }
    }
    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "PostTerraform","blogPage"}, description = "Verify Terraform post")
    public void verify_post_title_terraform(){
        try{
            HomePage homePage = new HomePage();
            validationHelper.validatePageBlogPostTerraform(homePage.launch().navigateToBlog());

        }catch (Exception ex){
            logger.error(ex.getMessage());
            AppAssert.assertTrue(false,ex.getMessage());
        }
    }
    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "PostCycle","blogPage"}, description = "Verify Cycle post")
    public void verify_post_title_Cycle(){
        try{
            HomePage homePage = new HomePage();
            validationHelper.validatePageBlogPostCycle(homePage.launch().navigateToBlog());

        }catch (Exception ex){
            logger.error(ex.getMessage());
            AppAssert.assertTrue(false,ex.getMessage());
        }
    }
    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "PostMicroService","blogPage"}, description = "Verify Micro service post")
    public void verify_post_title_microService(){
        try{
            HomePage homePage = new HomePage();
            validationHelper.validatePageBlogPostMicroService(homePage.launch().navigateToBlog());

        }catch (Exception ex){
            logger.error(ex.getMessage());
            AppAssert.assertTrue(false,ex.getMessage());
        }
    }
    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "PostDevelopersRole","blogPage"}, description = "Verify Developers role post")
    public void verify_post_title_developers_role(){
        try{
            HomePage homePage = new HomePage();
            validationHelper.validatePageBlogPostDevelopersRole(homePage.launch().navigateToBlog());

        }catch (Exception ex){
            logger.error(ex.getMessage());
            AppAssert.assertTrue(false,ex.getMessage());
        }
    }
    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "RecentPost","blogPage"}, description = "Verify Recent post")
    public void verify_recent_post(){
        try{
            HomePage homePage = new HomePage();
            validationHelper.validateRecentPost(homePage.launch().navigateToBlog());

        }catch (Exception ex){
            logger.error(ex.getMessage());
            AppAssert.assertTrue(false,ex.getMessage());
        }
    }
    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "ContactUs","blogPage"}, description = "Verify Contact Us")
    public void verify_contact_us(){
        try{
            HomePage homePage = new HomePage();
            validationHelper.validateContactUs(homePage.launch().navigateToBlog());

        }catch (Exception ex){
            logger.error(ex.getMessage());
            AppAssert.assertTrue(false,ex.getMessage());
        }
    }
    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "BlogTitle","blogPage"}, description = "Verify Blog title")
    public void verify_blog_title(){
        try{
            HomePage homePage = new HomePage();
            validationHelper.validateBlogTitle(homePage.launch().navigateToBlog());

        }catch (Exception ex){
            logger.error(ex.getMessage());
            AppAssert.assertTrue(false,ex.getMessage());
        }
    }


}

