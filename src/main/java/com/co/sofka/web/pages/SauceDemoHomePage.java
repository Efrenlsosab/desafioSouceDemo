package com.co.sofka.web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;

public class SauceDemoHomePage {
    @FindBy(how = How.XPATH, using = "//*[@class='title']")
    private WebElement titleHome;


    @FindBy(xpath = "//*[@id=\"add-to-cart-sauce-labs-backpack\"]")
    private WebElement buttonAddToCart1;

    @FindBy(xpath = "//*[@id=\"add-to-cart-sauce-labs-bike-light\"]")
    private WebElement buttonAddToCart2;

    @FindBy(xpath = "//*[@id=\"add-to-cart-sauce-labs-bolt-t-shirt\"]")
    private WebElement buttonAddToCart3;

    @FindBy(xpath = "//*[@id=\"add-to-cart-sauce-labs-fleece-jacket\"]")
    private WebElement buttonAddToCart4;

    @FindBy(xpath = "//*[@id=\"add-to-cart-sauce-labs-onesie\"]")
    private WebElement buttonAddToCart5;

    @FindBy(xpath = "//*[@id=\"add-to-cart-test.allthethings()-t-shirt-(red)\"]")
    private WebElement buttonAddToCart6;


    public SauceDemoHomePage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public WebElement getTitleHome() {
        return titleHome;
    }

    public ArrayList<WebElement> listButton = new ArrayList<>();
    public void addToList(){
        listButton.add(buttonAddToCart1);
        listButton.add(buttonAddToCart2);
        listButton.add(buttonAddToCart3);
        listButton.add(buttonAddToCart4);
        listButton.add(buttonAddToCart5);
        listButton.add(buttonAddToCart6);
    }
    public ArrayList<WebElement> getListButton() {
        return listButton;
    }
}
