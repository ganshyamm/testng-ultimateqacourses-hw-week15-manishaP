package com.ultimateqacourses.testsuite;


import com.ultimateqacourses.pages.HomePage;
import com.ultimateqacourses.pages.LoginPage;
import com.ultimateqacourses.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    HomePage homepage;
    @BeforeMethod(alwaysRun = true)
            public void inIt1(){
        homepage= new HomePage();

    }
    LoginPage loginPage;
    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        loginPage = new LoginPage();
    }
        @Test (groups = {"sanity", "regression"})
    public void verifyUserShouldNavigateToLoginPageSuccessfully() {
        homepage.clickOnSignLink();
        String expectedText = "Welcome Back!";
        String actualText = loginPage.getWelcomeText();
        Assert.assertEquals(actualText, expectedText, "Welcome Back!");

    }


    @Test(groups = {"smoke", "regression"})
    public void verifyTheErrorMessage() {

        homepage.clickOnSignLink();
        loginPage.enterEmailId("prime@gmail.com");
        loginPage.enterPassword("test123");
        loginPage.clickOnSignInButton();

        String expectedText = "Invalid email or password.";
        String actualText = loginPage.verifyErrorMessage();
        Assert.assertEquals(actualText, expectedText, "Invalid email or password.");


    }

}