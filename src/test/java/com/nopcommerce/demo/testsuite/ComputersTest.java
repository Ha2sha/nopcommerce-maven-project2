package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.TestBase;
import org.junit.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class ComputersTest extends TestBase {

    HomePage homePage=new HomePage();
    DeskTopPage deskTopPage=new DeskTopPage();
    BuildYourOwnComputerPage buildYourOwnComputerPage=new BuildYourOwnComputerPage();
    ShoppingCartPage shoppingCartPage=new ShoppingCartPage();
    CheckOutPage checkOutPage=new CheckOutPage();

    @Test
    public void VerifyPriceLowToHigh() throws InterruptedException {
        //1.1 Click on Computer Menu.
        homePage.mouseHoverTOComputers();
        //	1.2 Click on Desktop
        homePage.mouseHoverToDesktopAndClick();

        List <Double> actualListPriceDouble=deskTopPage.sortingPriceLowToHigh();

        Thread.sleep(2000);

        //1.4.3 sort values by ascending order
        deskTopPage.sortCollection(actualListPriceDouble);
        System.out.println(actualListPriceDouble);
        Thread.sleep(2000);

        //	1.3 Select Sort By position "Price: Low to High"
        deskTopPage.selectPriceLowToHigh();
        Thread.sleep(2000);

        List <Double> sortedListPriceDouble=deskTopPage.sortingPriceLowToHigh();
        System.out.println(sortedListPriceDouble);
        Assert.assertEquals("Not sorted by Price Low to High",actualListPriceDouble,sortedListPriceDouble);

    }

    @Test
    public void verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {
        //2.1 mouse hover to Computer Tab
        homePage.mouseHoverTOComputers();
        //2.2 click on desktop
        homePage.mouseHoverToDesktopAndClick();
        //2.3 Select Sort By position "Name: A to Z"
        deskTopPage.selectNameAtoZ();
        //2.4 Click on "Add To Cart""Build your own computer"
        Thread.sleep(3000);
        deskTopPage.buildYourOwnComputerAddToCart();

        //2.5 Verify the Text "Build your own computer"
        String expectedText="Build your own computer";
        String actualText=buildYourOwnComputerPage.getTextBuildYourOwnComputer();
        Assert.assertEquals("Not found",expectedText,actualText);

        //2.6 Select "2.2 GHz Intel Pentium Dual-Core E2200" using Select class
        Thread.sleep(2000);
        buildYourOwnComputerPage.selectProcessor2_2GHzIntelPentiumDualCoreE2200();
        //2.7.Select "8GB [+$60.00]" using Select class.
        buildYourOwnComputerPage.selectRAM8GB();
        //2.8 Select HDD radio "400 GB [+$100.00]"
        buildYourOwnComputerPage.selectHDDRadio400GB();
        //2.9 Select OS radio "Vista Premium [+$60.00]"
        buildYourOwnComputerPage.selectOSRadioVistaPremium();

        //2.10 Check Two Check boxes "Microsoft Office [+$50.00]" and "Total Commander [+$5.00]"
        Thread.sleep(3000);
        buildYourOwnComputerPage.selectCheckBoxMicrosoftOffice();
        buildYourOwnComputerPage.selectCheckBoxTotalCommander();
        //2.11 Verify the price "$1,475.00"
        Thread.sleep(3000);
        String expectedPrice="$1,475.00";
        String actualPrice=buildYourOwnComputerPage.getTextFromPrice();
        Assert.assertEquals("Price do not Match",expectedPrice,actualPrice);

        //Click on "ADD TO CARD" Button.
        Thread.sleep(3000);
        buildYourOwnComputerPage.clickOnAddToCartButton();

        //2.13 Verify the Message "The product has been added to your shopping cart" on Top green Bar
        String expectedMsg="The product has been added to your shopping cart";
        String actualMsg=buildYourOwnComputerPage.verifyTheProductHasBeenAddedToYourShoppingCart();
        Assert.assertEquals("Not added to the cart",expectedMsg,actualMsg);
        //After that close the bar clicking on the cross button.
        buildYourOwnComputerPage.closeTheBarByClickingOnTheCrossButton();
        //2.14 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
        Thread.sleep(3000);
        buildYourOwnComputerPage.mouseHoverOnShoppingCart();
        buildYourOwnComputerPage.mouseHoverAndClickOnGoToCartButton();

        //2.15 Verify the message "Shopping cart"
        String expectedMsg1="Shopping cart";
        String actualMsg1=shoppingCartPage.getTextFromShoppingCart();
        Assert.assertEquals("Message do not Match",expectedMsg1,actualMsg1);

        //2.16 Change the Qty to "2" and Click on "Update shopping cart"
        shoppingCartPage.clearQuantity();
        shoppingCartPage.addQuantity2();
        shoppingCartPage.clickOnUpdateShoppingCart();

        //2.17 Verify the Total"$2,950.00"
        String expectedTotal="$2,950.00";
        String actualTotal=shoppingCartPage.getTextFromSubTotal();
        Assert.assertEquals("Total not matched",expectedTotal,actualTotal);

        //2.18 click on checkbox “I agree with the terms of service”
        shoppingCartPage.setClickOnCheckBoxTermsAndConditions();
        //2.19 Click on “CHECKOUT”
        shoppingCartPage.clickOnCheckOutButton();

        //2.20 Verify the Text “Welcome, Please Sign In!”
        Thread.sleep(3000);
        String expectedMsg2="Welcome, Please Sign In!";
        String actualMsg2=checkOutPage.getTextFromCheckOutPage();
        Assert.assertEquals("Chekout error",expectedMsg2,actualMsg2);

        //2.21 Click on “CHECKOUT AS GUEST”Tab
        checkOutPage.clickOnCheckoutAsGuest();

        //2.22 Fill the all mandatory field
        Thread.sleep(3000);
        checkOutPage.enterFirstName("Kimaya");
        checkOutPage.enterLastName("Devani");
        checkOutPage.enterEmail("kimaya@gmail.com");
        checkOutPage.selectCountry("India");
        checkOutPage.enterCity("Surat");
        checkOutPage.enterAddress("10,Shiv Krupa");
        checkOutPage.enterPosCode("395002");
        checkOutPage.enterPhoneNumber("09875823258");

        //2.23 Click on “CONTINUE”
        checkOutPage.clickOnContinueButton();

        //2.24 Click on Radio Button “Next Day Air($0.00)”
        checkOutPage.clickOnRadioNextDayAir();

        //2.25 Click on “CONTINUE”
        checkOutPage.clickOnContinue();

        //2.26 Select Radio Button “Credit Card” & click on continue
        checkOutPage.selectRadioButtonCreditCard();
        checkOutPage.clickContinue();

        //2.27 Select “Master card” From Select credit card dropdown
        Thread.sleep(3000);
        checkOutPage.selectCreditCardType("MasterCard");
        //2.28 Fill all the details
        Thread.sleep(3000);
        checkOutPage.enterCardHolderName("Miss Kimaya");
        checkOutPage.enterCardNumber("5555555555554444");
        checkOutPage.selectExpiryMonth("7");
        checkOutPage.selectExpiryYear("2025");
        checkOutPage.enterCardCode("802");

        //2.29 Click on “CONTINUE”
        Thread.sleep(3000);
        checkOutPage.clickContinue4();

        //2.30 Verify “Payment Method” is “Credit Card”
        Thread.sleep(3000);
        String expectedPaymentMethod = "Payment Method: Credit Card";
        String actualPaymentMethod = checkOutPage.getTextFromPaymentMethod();;
        Assert.assertEquals("Payment method is not correct", expectedPaymentMethod,actualPaymentMethod);

        //2.32 Verify “Shipping Method” is “Next Day Air”
        String expectedShippingMethod = "Shipping Method: Next Day Air";
        String actualShippingMethod = checkOutPage.getTextFromNextDayAir();
        Assert.assertEquals("Shipping Method is not correct", expectedShippingMethod,actualShippingMethod);

        //2.33 Verify Total is “$2,950.00”
        String expectedFinalTotal = "$2,950.00";
        String actualFinalTotal = checkOutPage.getTotalOf$2950();
        Assert.assertEquals("Final Total is not correct", expectedFinalTotal,actualFinalTotal);

        //2.34 Click on “CONFIRM”
        checkOutPage.clickOnConfirm();

        //2.35 Verify the Text “Thank You”
        String expectedText1="Thank you";
        String actualText1=checkOutPage.getTextFromThankYou();
        Assert.assertEquals("Payment Error",expectedText1,actualText1);

        //2.36 Verify the message “Your order has been successfully processed!”
        String expectedText2 = "Your order has been successfully processed!";
        String actualText2 = checkOutPage.getTextCartProcessedSuccessfully();
        Assert.assertEquals("Thank You does not display", expectedText2,actualText2);

        //2.37 Click on “CONTINUE”
       checkOutPage.clickContinue5();

        //2.38 Verify the text “Welcome to our store”
        Thread.sleep(3000);
        String expectedWelcome = "Welcome to our store";
        String actualWelcome = checkOutPage.getWelcomeStoreText();
        Assert.assertEquals("Welcome to our store not displayed", expectedWelcome,actualWelcome);


    }

}
