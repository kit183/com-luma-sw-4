package com.luma.pages;

import com.luma.utilities.Utility;
import org.openqa.selenium.By;

public class GearTestPage extends Utility {
    // Mouse Hover on Gear Menu
    By gearMenu = By.xpath("//span[normalize-space()='Gear']");

    public void mouseHoverOnGearMenu() {
        mouseHoverToElement(gearMenu);
    }

    // Click on Bags
    By bags = By.xpath("//span[normalize-space()='Bags']");

    public void clickOnBags() {
        mouseHoverToElementAndClick(bags);
    }

    // Click on Product Name ‘Overnight Duffle’
    By productName = By.xpath("//a[normalize-space()='Overnight Duffle']");

    public void clickOnOvernightDuffle() {
        clickOnElement(productName);
    }

    // Verify the text ‘Overnight Duffle’
    By verifyTextOD = By.xpath("//span[@class='base']");

    public void verifyTheTextOvernightDuffle() {
        verifyExpectedAndActual(verifyTextOD, "Overnight Duffle");
    }

    // Change Qty 3
    By qty = By.id("qty");


    public void changeQty3() {
     // sendTextToElement((qty), "3");
    driver.findElement(By.id("qty")).clear();
    driver.findElement(By.id("qty")).sendKeys("3");

    }

    // Click on ‘Add to Cart’ Button.
    By addToCart = By.xpath("//button[@id='product-addtocart-button']");

    public void clickOnAddToCartButton() {
        clickOnElement(addToCart);
    }

    // Verify the text ‘You added Overnight Duffle to your shopping cart.’
    By verifyText = By.xpath("//body/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[1]");

    public void verifyTheTextLong() {
        verifyExpectedAndActual(verifyText, "You added Overnight Duffle to your");
    }

    // Click on ‘shopping cart’ Link into message
    By link = By.linkText("shopping cart");

    public void clickOnShoppingCartLink() {
        clickOnElement(link);
    }

    // Verify the product name ‘Overnight Duffle’
    By verifyText1 = By.xpath("//td[@class='col item']//a[normalize-space()='Overnight Duffle']");

    public void verifyTheProductNameOD() {
        verifyExpectedAndActual(verifyText1, "You added Overnight Duffle to your");
    }

    // Verify the Qty is ‘3’
    By verifyText2 = By.xpath("//input[@value = '3']");

    public void verifyTheQty3() {
        verifyExpectedAndActual(verifyText2, "3");
    }

    // Verify the product price ‘$135.00’
    By verifyPrice = By.xpath("(//span[@class='cart-price']//span)[2]");

    public void verifyTheProductPrice135() {
        verifyExpectedAndActual(verifyPrice, "$135.00");
    }
    // Change Qty to ‘5’

    By changeQty = By.xpath("(//input[@class='input-text qty'])[1]");

    public void changeQty5() {
        sendTextToElement(changeQty, "5");
    }

    // Click on ‘Update Shopping Cart’ button
    By clickUpdate = By.xpath("//span[normalize-space()='Update Shopping Cart']");

    public void clickOnUpdateShoppingCartButton() {
        clickOnElement(clickUpdate);
    }

    // Verify the product price ‘$225.00
    By verifyPrice225 = By.xpath("(//span[@class='cart-price']//span)[2]");

    public void verifyTheProductPrice225() {
        verifyExpectedAndActual(verifyPrice225, "$225.00");
    }

}
