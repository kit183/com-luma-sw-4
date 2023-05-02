package com.luma.testsuite;

import com.luma.pages.MenTestPage;
import com.luma.testbase.BaseTest;
import org.testng.annotations.Test;

public class MenTest extends BaseTest {
    MenTestPage menPage = new MenTestPage();

    @Test
    public void userShouldAddProductSuccessFullyToShoppingCart() throws InterruptedException {
        Thread.sleep(2000);
        menPage.mouseHoverOnMenMenu();
        menPage.mouseHoveOnBottoms();
        menPage.clickOnPants();
        menPage.mouseHoverOnProductNameCronus();
        menPage.clickOnSize32();
        menPage.clickOnColourBlack();
        menPage.mouseHoverOnProductName();
        menPage.clickOnAddToCart();
        menPage.verifyTheTextYouAddedCronusYogaPant();
        menPage.clickOnShoppingCartLink();
        menPage.verifyTheTextShoppingCart();
        menPage.verifyTheTextCronusYogaPant();
        menPage.verifyTheProductSize32();
        menPage.verifyTheProductColour();


    }


}
