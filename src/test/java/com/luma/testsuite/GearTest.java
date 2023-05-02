package com.luma.testsuite;

import com.luma.pages.GearTestPage;
import com.luma.testbase.BaseTest;
import org.testng.annotations.Test;

public class GearTest extends BaseTest {

    GearTestPage gearPage = new GearTestPage();

    @Test
    public void userShouldAddProductSuccessFullyToShoppingCart(){
        gearPage.mouseHoverOnGearMenu();
        gearPage.clickOnBags();
        gearPage.clickOnOvernightDuffle();
        gearPage.verifyTheTextOvernightDuffle();
        gearPage.changeQty3();
        gearPage.clickOnAddToCartButton();
        gearPage.verifyTheTextLong();
        gearPage.clickOnShoppingCartLink();
        gearPage.verifyTheProductNameOD();
        gearPage.verifyTheQty3();
        gearPage.verifyTheProductPrice135();
        gearPage.changeQty5();
        gearPage.clickOnUpdateShoppingCartButton();
        gearPage.verifyTheProductPrice225();

    }


}
