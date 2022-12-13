package com.ultimateqacourses.pages;

import com.ultimateqacourses.utility.UtilityClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class LoginPage extends UtilityClass {
    @CacheLookup
    @FindBy(xpath = "//h2[@class='page__heading']")
    WebElement welcomeText;
    @CacheLookup
    @FindBy(id = "user[email]")
    WebElement emailField;
    @CacheLookup
    @FindBy(id = "user[password]")
    WebElement passwordField;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Sign in')]")
    WebElement signInButton;
    @CacheLookup
    @FindBy(xpath = "//li[@class='form-error__list-item']")
    WebElement errorMessage;

    public String getWelcomeText() {
        Reporter.log(" get welcome text");
        return getTextFromElement(welcomeText);

    }

    public void enterEmailId(String email) {
        Reporter.log("Enter emailId" + emailField);
        sendTextToElement(emailField, email);
    }

    public void enterPassword(String password) {
        Reporter.log("Enter password" +passwordField);
        sendTextToElement(passwordField, password);
    }

    public void clickOnSignInButton() {
        Reporter.log("Clicking on sign Button" + signInButton);
        clickOnElement(signInButton);


    }

    public String verifyErrorMessage() {
        Reporter.log("verify error message");
        return getTextFromElement(errorMessage);
    }


}