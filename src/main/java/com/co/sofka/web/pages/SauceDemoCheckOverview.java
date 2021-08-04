package com.co.sofka.web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SauceDemoCheckOverview {

    @FindBy(how = How.XPATH, using = "//*[@id=\"header_container\"]/div[2]/span")
    private WebElement titleCheckoutOverview;

    public SauceDemoCheckOverview(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public WebElement getTitleCheckoutOverview() {
        return titleCheckoutOverview;
    }
}
