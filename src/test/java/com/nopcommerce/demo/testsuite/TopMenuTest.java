package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.TopMenuPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.junit.Assert;
import org.testng.annotations.Test;

public class TopMenuTest extends TestBase {

    TopMenuPage topMenuPage = new TopMenuPage();
    HomePage homePage = new HomePage();

    public void selectMenu(String Menu) {
        String expectedTabText = homePage.clickOnMenu(Menu);
        String actualTabText = topMenuPage.getWelcomeText();
        Assert.assertEquals("Link not Working", expectedTabText, actualTabText);
    }

    @Test
    public void verifyPageNavigation() {

        selectMenu("Computers");
        selectMenu("Electronics");
        selectMenu("Apparel");
        selectMenu("Digital downloads");
        selectMenu("Books");
        selectMenu("Jewelry");
        selectMenu("Gift Cards");
    }
}
