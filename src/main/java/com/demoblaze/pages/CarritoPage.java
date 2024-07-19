package com.demoblaze.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

/**
 * @autor Alexander Alvarez
 */
public class CarritoPage extends PageObject {

    By linkByOnclick = By.xpath("//a[contains(text(), 'Phones')]");

    By imgBySrc = By.xpath("//img[@src='imgs/galaxy_s6.jpg'][1]");
    By addToCartButton = By.xpath("//a[@onclick=\"addToCart(1)\"]");
    By cartButton = By.id("cartur");

    public By getLinkByOnclick() {return linkByOnclick;}
    public By getImgBySrc() {return imgBySrc;}
    public By getAddToCartButton() {return addToCartButton;}
    public By getCartButton() {return cartButton;}


}
