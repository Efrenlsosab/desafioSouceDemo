package com.co.sofka.web.controllers;

import com.co.sofka.web.pages.SauceDemoHomePage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class BCPurchaseSauceDemo {
private WebDriver dirver;
    public static boolean isVisibleButtons(WebDriver driver, SauceDemoHomePage page){
        int countButton = 0;
        page.addToList();
        for (int i = 0; i < page.getListButton().size(); i++) {
            if (page.getListButton().get(i).isDisplayed()){
                Assert.assertTrue(page.getListButton().get(i).isDisplayed());
                countButton ++;
            }
            System.out.println(page.getListButton().get(i).getText());
        }
        if (countButton == 6){
            return true;
        } else {
            return false;
        }
    }
}
