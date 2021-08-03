package com.co.sofka.web.controllers;

import com.co.sofka.web.pages.SauceDemoHomePage;
import org.junit.Assert;

public class BCLoadProductsSauceDemo {

    public static void isVisibleProducts(SauceDemoHomePage page) {
        page.addToListButtons();
        for (int i = 0; i < page.getListNameProducts().size(); i++) {
            Assert.assertTrue(page.getListNameProducts().get(i).isDisplayed());

            System.out.println(page.getListButton().get(i).getText());
        }

    }
}
