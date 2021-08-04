package com.co.sofka.web.controllers;

import com.co.sofka.web.data.DataInformation;
import com.co.sofka.web.pages.SauceDemoHomePage;
import com.co.sofka.web.pages.SauceDemoLoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.SQLException;

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
public static void loginUserWithDB(WebDriver driver, DataInformation dataInformation) throws SQLException {
        DataBaseController dataBaseController = new DataBaseController();
        String requery;
        String columnUsername = "USERNAME";
        String columnPassword = "PSSWRD";

        requery = "SELECT * FROM USUARIO WHERE ID = 1";

        dataBaseController.startConnection();
        dataBaseController.dorequery(requery, columnUsername, columnPassword, dataInformation);
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
