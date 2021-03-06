package com.co.sofka.web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;

public class SauceDemoHomePage {
    @FindBy(how = How.XPATH, using = "//*[@class='title']")
    private WebElement titleHome;

//botones add to cart
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
    @FindBy(className = "shopping_cart_badge")
    private WebElement cart;
//nombre de productos
    @FindBy(xpath = "//*[@id=\"item_4_title_link\"]/div")
    private WebElement product1;
    @FindBy(xpath = "//*[@id=\"item_0_title_link\"]/div")
    private WebElement product2;
    @FindBy(xpath = "//*[@id=\"item_1_title_link\"]/div")
    private WebElement product3;
    @FindBy(xpath = "//*[@id=\"item_2_title_link\"]/div")
    private WebElement product4;
    @FindBy(xpath = "//*[@id=\"item_3_title_link\"]/div")
    private WebElement product5;
    @FindBy(xpath = "//*[@id=\"item_5_title_link\"]/div")
    private WebElement product6;

    @FindBy(xpath = "//*[@id=\"shopping_cart_container\"]/a")
    private WebElement cartpage;


    public SauceDemoHomePage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public WebElement getTitleHome() {
        return titleHome;
    }

    public ArrayList<WebElement> listButton = new ArrayList<>();
    public void addToListButtons(){
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

    public WebElement getCart() {
        return cart;
    }

    public ArrayList<WebElement> productsList = new ArrayList<>();
    public void addToProductsList(){
        productsList.add(product1);
        productsList.add(product2);
        productsList.add(product3);
        productsList.add(product4);
        productsList.add(product5);
        productsList.add(product6);

    }
    public ArrayList<WebElement> getListNameProducts() {
        return productsList;
    }

    public WebElement getCartpage(){return cartpage;}


}
