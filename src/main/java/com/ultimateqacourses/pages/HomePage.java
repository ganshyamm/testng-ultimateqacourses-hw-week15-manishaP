package com.ultimateqacourses.pages;


import com.ultimateqacourses.utility.UtilityClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import org.testng.annotations.CustomAttribute;

public class HomePage extends UtilityClass {
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Sign In']")
    WebElement signInLink;

    public void clickOnSignLink() {
        Reporter.log("click on sign in button");
        clickOnElement(signInLink);

    }
}

