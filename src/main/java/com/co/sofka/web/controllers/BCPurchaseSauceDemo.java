package com.co.sofka.web.controllers;

import com.co.sofka.web.data.DataInformation;
import com.co.sofka.web.pages.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class BCPurchaseSauceDemo {
    private WebDriver dirver;

    public static boolean isVisibleButtons(SauceDemoHomePage page) {
        int countButton = 0;
        page.addToListButtons();
        for (int i = 0; i < page.getListButton().size(); i++) {
            if (page.getListButton().get(i).isDisplayed()) {
                Assert.assertTrue(page.getListButton().get(i).isDisplayed());
                countButton++;
            }
            System.out.println(page.getListButton().get(i).getText());
        }
        if (countButton == 6) {
            return true;
        } else {
            return false;
        }
    }


    public static void clickButtonAddToCart(SauceDemoHomePage page, Integer producto) {
        page.addToListButtons();
        page.getListButton().get(producto).click();
    }

    public static void clickCartpage(SauceDemoHomePage page) {
        page.getCartpage().click();
    }

    public static void clickCheckout(SauceDemoYourCartPage yourCartPage) {
        yourCartPage.getCheckoutbutton().click();
    }

    public static void clickContinue(SauceDemoCheckOut checkOut) {
        checkOut.getButtonContinue().click();
    }

    public static String lookingCart(SauceDemoHomePage page) {
        return page.getCart().getText();
    }


    public static String getTittleCheckout(WebDriver driver) {
        SauceDemoCheckOut checkOut = new SauceDemoCheckOut(driver);
        return checkOut.getTitleCheckout().getText();
    }

    public static String getTittleCheckoutOverview(SauceDemoCheckOverview checkOverview) {
        return checkOverview.getTitleCheckoutOverview().getText();
    }

    public static void getInformation(SauceDemoCheckOut checkOut) {
        DataInformation dataInformation = new DataInformation();
        dataInformation.dataGenerator();
        checkOut.getFirstName().sendKeys(dataInformation.getFirstName());
        checkOut.getLastName().sendKeys(dataInformation.getLast_name());
        checkOut.getZipCode().sendKeys(dataInformation.getZip());
    }
}
