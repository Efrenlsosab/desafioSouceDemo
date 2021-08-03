package com.co.sofka.web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SauceDemoYourCartPage {

    @FindBy(how = How.XPATH, using = "//*[@id=\"header_container\"]/div[2]/span")
    private WebElement titleYourCart;

    public SauceDemoYourCartPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public WebElement getTitleYourCart() {
        return titleYourCart;
    }
}
