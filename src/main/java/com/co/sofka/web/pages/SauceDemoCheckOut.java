package com.co.sofka.web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SauceDemoCheckOut {


    @FindBy(how = How.XPATH, using = "//*[@id=\"header_container\"]/div[2]/span")
    private WebElement titleCheckout;

    @FindBy(how = How.XPATH, using = "//*[@id=\"first-name\"]")
    private WebElement firstName;

    @FindBy(how = How.XPATH, using = "//*[@id=\"last-name\"]")
    private WebElement lastName;

    @FindBy(how = How.XPATH, using = "//*[@id=\"postal-code\"]")
    private WebElement zipCode;

    @FindBy (how = How.XPATH, using = "//*[@id=\"continue\"]")
    private WebElement buttonContinue;

    public SauceDemoCheckOut(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    public WebElement getTitleCheckout() {
        return titleCheckout;
    }

    public WebElement getFirstName() {
        return firstName;
    }

    public WebElement getLastName() {
        return lastName;
    }

    public WebElement getZipCode() {
        return zipCode;
    }

    public WebElement getButtonContinue() {
        return buttonContinue;
    }
}
