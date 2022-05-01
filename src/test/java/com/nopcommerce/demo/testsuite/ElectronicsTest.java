package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.TestBase;
import org.junit.Assert;
import org.testng.annotations.Test;

public class ElectronicsTest extends TestBase {
    HomePage homePage = new HomePage();
    CellPhonesPage cellPhonesPage = new CellPhonesPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    CheckOutPage checkOutPage = new CheckOutPage();
    RegisterPage registerPage = new RegisterPage();

    @Test
    public void textVerified() {
        //1.1 Mouse Hover on “Electronics”Tab
        homePage.setMouseHoverTOElectronics();
        //1.2 Mouse Hover on “Cell phones” and click
        homePage.setMouseHoverToCellPhonesAndClick();
        //1.3 Verify the text “Cell phones”
        String expectedText = "Cell phones";
        String actualText = cellPhonesPage.getWelcomeTextCellPhones();
        Assert.assertEquals("Text not matched", expectedText, actualText);
    }

    @Test
    public void verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully() throws InterruptedException {
        /*
        2.1 Mouse Hover on “Electronics”Tab
        2.2 Mouse Hover on “Cell phones” and click
        2.3 Verify the text “Cell phones”*/
        textVerified(); //called the method

        //2.4 Click on List View Tab
        cellPhonesPage.clickOnListView();

        //2.5 Click on product name “Nokia Lumia 1020” link
        Thread.sleep(3000);
        cellPhonesPage.clickOnNokiaLumia1020();

        //2.6 Verify the text “Nokia Lumia 1020”
        Thread.sleep(3000);
        String expectedText = "Nokia Lumia 1020";
        String actualText = cellPhonesPage.setGetTextNokiaLumia1020();
        Assert.assertEquals("Text Nokia Lumia 1020 does not match.", expectedText, actualText);

        //2.7 Verify the price “$349.00”
        String expectedPrice = "$349.00";
        String actualPrice = cellPhonesPage.getTextVerifyThePrice$349();
        Assert.assertEquals("Price not Matched", expectedPrice, actualPrice);

        //2.8 Change quantity to 2
        cellPhonesPage.clearQuantity();
        cellPhonesPage.addQuantity("2");

        //2.9 Click on “ADD TO CART” tab
        cellPhonesPage.clickAddToCart();

        //2.10 Verify the Message "The product has been added to your shopping cart" on Top green Bar
        Thread.sleep(3000);
        String expectedMsgBar = "The product has been added to your shopping cart";
        String actualMsgBar = cellPhonesPage.verifyTheProductHasBeenAddedToYourShoppingCart();
        Assert.assertEquals("Message not verified", expectedMsgBar, actualMsgBar);

        //After that close the bar clicking on the cross button.
        cellPhonesPage.closeTheBarByClickingOnTheCrossButton();

        //2.11 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
        Thread.sleep(3000);
        cellPhonesPage.mouseHoverOnShoppingCart();
        cellPhonesPage.mouseHoverAndClickOnGoToCartButton();

        //2.12 Verify the message "Shopping cart"
        String expectedMsg1 = "Shopping cart";
        String actualMsg1 = shoppingCartPage.getTextFromShoppingCart();
        Assert.assertEquals("Message do not Match", expectedMsg1, actualMsg1);

        //2.13 Verify the quantity is 2
        String expectedQty = "(2)";
        String actualQty = shoppingCartPage.getTextFromQuantity();
        Assert.assertEquals("Incorrect Qty", expectedQty, actualQty);

        //2.14 Verify the Total $698.00
        Thread.sleep(10000);
        String expectedTotal = "$698.00";
        String actualTotal = shoppingCartPage.getTextFromVerifyTotal();
        Assert.assertEquals("Total display is not correct", expectedTotal, actualTotal);

        //2.15 click on checkbox “I agree with the terms of service”
        shoppingCartPage.setClickOnCheckBoxTermsAndConditions();

        //2.16 Click on checkout
        shoppingCartPage.clickOnCheckOutButton();

        //2.17 Verify the Text “Welcome, Please Sign In!”
        Thread.sleep(3000);
        String expectedMsg2 = "Welcome, Please Sign In!";
        String actualMsg2 = checkOutPage.getTextFromCheckOutPage();
        Assert.assertEquals("Chekout error", expectedMsg2, actualMsg2);

        //2.18 Click on “REGISTER” tab
        checkOutPage.clickOnRegisterButton();

        //2.19 Verify the text “Register”
        String expectedText2 = "Register";
        String actualText2 = registerPage.getTextFromRegisterPage();
        Assert.assertEquals("Register Link is Broken", expectedText2, actualText2);

        //2.20 Fill the mandatory fields
        registerPage.enterFirstName("Hiral1");
        registerPage.enterLastName("Patel");
        registerPage.enterEmail("hiral12@gmail.com");  //always give new email before running program
        registerPage.enterPassword("H12545");
        registerPage.enterConfirmPassword("H12545");

        //2.21 Click on “REGISTER” Button
        registerPage.clickOnRegisterButton();

        //2.22 Verify the message “Your registration completed”
        String expectedText3 = "Your registration completed";
        String actualText3 = registerPage.getConfirmRegistrationText();
        Assert.assertEquals("Your registration is not completed", expectedText3, actualText3);

        //2.23 Click on “CONTINUE” tab
        registerPage.clickOnContinueButton();

        //2.24 Verify the text “Shopping cart”
        String expectedText4 = "Shopping cart";
        String actualText4 = shoppingCartPage.getTextFromShoppingCart();
        Assert.assertEquals("Text is not diplayed", expectedText4, actualText4);

        //2.25 click on checkbox “I agree with the terms of service”
        shoppingCartPage.setClickOnCheckBoxTermsAndConditions();
        //2.26 Click on “CHECKOUT”
        shoppingCartPage.clickOnCheckOutButton();
        //2.27 Fill the Mandatory fields
        Thread.sleep(3000);
        checkOutPage.selectCountry("India");
        checkOutPage.enterCity("Surat");
        checkOutPage.enterAddress("10,Shiv Krupa");
        checkOutPage.enterPosCode("395002");
        checkOutPage.enterPhoneNumber("09875823258");

        //2.28 Click on “CONTINUE”
        checkOutPage.clickOnContinueButton();

        //2.29 Click on Radio Button “2nd Day Air ($0.00)”
        checkOutPage.clickOnRadioButton2ndDayAir();

        //2.30 Click on “CONTINUE”
        checkOutPage.clickOnContinue();

        //2.31 Select Radio Button “Credit Card” & Continue
        checkOutPage.selectRadioButtonCreditCard();
        checkOutPage.clickContinue();

        //2.32 Select “Visa” From Select credit card dropdown
        checkOutPage.selectCreditCardType("visa");

        //2.33 Fill all the details
        Thread.sleep(3000);
        checkOutPage.enterCardHolderName("Hiral Patel");
        checkOutPage.enterCardNumber("4485821584127596");
        checkOutPage.selectExpiryMonth("3");
        checkOutPage.selectExpiryYear("2027");
        checkOutPage.enterCardCode("631");

        //2.34 Click on “CONTINUE”CHECKOUT”
        Thread.sleep(3000);
        checkOutPage.clickContinue4();

        //2.35 Verify “Payment Method” is “Credit Card”
        Thread.sleep(3000);
        String expectedPaymentMethod = "Payment Method: Credit Card";
        String actualPaymentMethod =checkOutPage.getTextFromPaymentMethod();
        Assert.assertEquals("Payment method is not correct", expectedPaymentMethod, actualPaymentMethod);

        //2.36 Verify “Shipping Method” is “2nd Day Air”
        Thread.sleep(3000);
        String expectedMethod1 = "Shipping Method: 2nd Day Air";
        String actualMethod1 = checkOutPage.getTextFromShippingMethod();
        Assert.assertEquals("Shipping Method is not correct", expectedMethod1, actualMethod1);

        //2.37 Verify Total is “$698.00”
        Thread.sleep(3000);
        String expectedTotal1 = "$698.00";
        String actualTotal1 = checkOutPage.getTextFromTotal();
        Assert.assertEquals("Total is not correct", expectedTotal1, actualTotal1);

        //2.38 Click on “CONFIRM”
        checkOutPage.clickOnConfirm();

        //2.39 Verify the Text “Thank You”
        String expectedText1 = "Thank you";
        String actualText1 = checkOutPage.getTextFromThankYou();
        Assert.assertEquals("Payment Error", expectedText1, actualText1);

        //2.40 Verify the message “Your order has been successfully processed!”
        String expectedText5 = "Your order has been successfully processed!";
        String actualText5 = checkOutPage.getTextCartProcessedSuccessfully();
        Assert.assertEquals("Thank You does not display", expectedText5, actualText5);

        //2.41 Click on “CONTINUE”
        checkOutPage.clickContinue5();

        //2.42 Verify the text “Welcome to our store”
        Thread.sleep(3000);
        String expectedWelcome = "Welcome to our store";
        String actualWelcome = checkOutPage.getWelcomeStoreText();
        Assert.assertEquals("Welcome to our store not displayed", expectedWelcome, actualWelcome);

        //2.43 Click on “Logout” link
        checkOutPage.clickOnLogoutLink();

        //2.44 Verify the URL is “https://demo.nopcommerce.com/”
        String expectedUrl = "https://demo.nopcommerce.com/";
        String actualUrl = checkOutPage.getUrl();
        Assert.assertEquals("Incorrect URL", expectedUrl, actualUrl);


    }
}
