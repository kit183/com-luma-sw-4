package com.luma.pages;

import com.luma.utilities.Utility;
import org.openqa.selenium.By;

public class MenTestPage extends Utility {
    // Mouse Hover on Men Menu
    By menMenu = By.xpath("//span[normalize-space()='Men']");
    public void mouseHoverOnMenMenu() {
        mouseHover(menMenu);
    }

    //Mouse Hover on Bottoms
    By bottoms = By.xpath("//a[@id='ui-id-18']");
    public void mouseHoveOnBottoms() {
        mouseHover(bottoms);
    }

    //* Click on Pants
    By pants = By.xpath("//a[@id='ui-id-23']//span[contains(text(),'Pants')]");
    public void clickOnPants() {
        clickOnElement(pants);
    }

    // Mouse Hover on product name Cronus Yoga Pant and click on size 32.
    By productNameCronus = By.xpath("//a[normalize-space()='Cronus Yoga Pant']");
    public void mouseHoverOnProductNameCronus() {
        mouseHoverToElement(productNameCronus);

    }

    By productSize = By.xpath("(//div[@class='swatch-option text'])[1]");
    public void clickOnSize32() {
        mouseHoverToElementAndClick(productSize);
    }

    // Mouse Hover on product name ‘Cronus Yoga Pant’ and click on colour Black.
    By productColour = By.id("option-label-color-93-item-49");
    public void clickOnColourBlack() {
        mouseHoverToElementAndClick(productColour);
    }

    // Mouse Hover on product name‘Cronus Yoga Pant’ and click on‘Add To Cart’ Button.
    By productName = By.xpath("//a[normalize-space()='Cronus Yoga Pant']");
    public void mouseHoverOnProductName() {
        mouseHoverToElement(productName);
    }
    By addProduct = By.xpath("(//span[contains(text(),'Add to Cart')])[1]");
    public void clickOnAddToCart() {
        mouseHoverToElementAndClick(addProduct);
    }

    // Verify the text ‘You added Cronus Yoga Pant to your shopping cart.’
    By verifyText = By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");
    public void verifyTheTextYouAddedCronusYogaPant() {
        verifyExpectedAndActual(verifyText, "You added Cronus Yoga Pant to your");
    }

    // Click on ‘shopping cart’ Link into message
    By shoppingCart = By.xpath("//a[normalize-space()='shopping cart']");
    public void clickOnShoppingCartLink() {
        clickOnElement(shoppingCart);
    }

    // Verify the text ‘Shopping Cart.’
    By verifyText1 = By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");
    public void verifyTheTextShoppingCart() {
        verifyExpectedAndActual(verifyText1, "You added Cronus Yoga Pant to your");
    }

    // Verify the product name ‘Cronus Yoga Pant’
    By verifyText2 = By.xpath("//tbody/tr[1]/td[1]/div[1]/strong[1]/a[1]");
    public void verifyTheTextCronusYogaPant() {
        verifyExpectedAndActual(verifyText2, "Cronus Yoga Pant ");
    }

    // Verify the product size ‘32’
    By verifyText3 = By.xpath("//dd[contains(text(),'32')]");
    public void verifyTheProductSize32() {
        verifyExpectedAndActual(verifyText3, "32");
    }

    // Verify the product colour ‘Black’
    By verifyText4 = By.xpath("//dd[contains(text(),'Black')]");
    public void verifyTheProductColour() {
        verifyExpectedAndActual(verifyText4, "Black");
    }


}