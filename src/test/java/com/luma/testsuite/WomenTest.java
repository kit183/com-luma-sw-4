package com.luma.testsuite;

import com.luma.pages.WomenTestPage;
import com.luma.testbase.BaseTest;
import org.testng.annotations.Test;

public class WomenTest extends BaseTest {
    WomenTestPage womenPage = new WomenTestPage();

    @Test
    public void verifyTheSortByProductNameFilter () throws InterruptedException {
        Thread.sleep(2000);
        womenPage.mouseHoverOnWomenMenu();
        womenPage.mouseHoveOnTops();
        womenPage.clickOnJackets();
        womenPage.sortByFilterProductName();
        womenPage.sortProductAToZ();
    }

    @Test
    public void verifyTheSortByPriceFilter () throws InterruptedException {
        Thread.sleep(2000);
        womenPage.mouseHoverOnWomenMenu();
        womenPage.mouseHoveOnTops();
        womenPage.clickOnJackets();
        womenPage.sortByFilterPrice();
        womenPage.sortProductLowToHighPrice();

    }
}
