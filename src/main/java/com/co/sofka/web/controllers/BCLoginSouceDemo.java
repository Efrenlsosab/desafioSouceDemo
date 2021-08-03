package com.co.sofka.web.controllers;

import com.co.sofka.web.pages.SauceDemoHomePage;
import com.co.sofka.web.pages.SauceDemoLoginPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BCLoginSouceDemo {

    public static void startApp(WebDriver driver, String url) {
        driver.get(url);
    }

    public static void loginUser(WebDriver driver, String username, String password) {
        SauceDemoLoginPage loginPage = new SauceDemoLoginPage(driver);
        loginPage.getInputUser().sendKeys(username);
        loginPage.getInputPassword().sendKeys(password);
        loginPage.getButtonLogin().click();
    }

    public static String getMessage(WebDriver driver) {
        SauceDemoLoginPage message = new SauceDemoLoginPage(driver);
        return message.getMessageError().getText();
    }

    public static String getTitleHome(WebDriver driver) {
        SauceDemoHomePage homePage = new SauceDemoHomePage(driver);
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOf(homePage.getTitleHome()));
        return homePage.getTitleHome().getText();
    }

}
