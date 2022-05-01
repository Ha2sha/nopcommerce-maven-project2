package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class BuildYourOwnComputerPage extends Utility {

    By welcomeText=By.xpath("//a[contains(text(),'Build your own computer')]");
    By processor=By.xpath("//select[@id='product_attribute_1']");
    By ram=By.xpath("//select[@id='product_attribute_2']");
    By hdd=By.xpath("//input[@id='product_attribute_3_7']");
    By oS=By.xpath("//input[@id='product_attribute_4_9']");
    By msOffice=By.xpath("//input[@id='product_attribute_5_10']");
    By totalCommander=By.xpath("//input[@id='product_attribute_5_12']");
    By price=By.xpath("//span[@id='price-value-1']");
    By addToCart=By.xpath("//button[@id='add-to-cart-button-1']");
    By verifyMsg=By.xpath("//div[@class='bar-notification success']");
    By closeTheMsg=By.xpath("//span[@class='close']");
    By mouseHoverOnShoppingCart1=By.xpath("//span[contains(text(),'Shopping cart')]");
    By clickOnGoToCartButton1=By.xpath("//button[contains(text(),'Go to cart')]");



    public String getTextBuildYourOwnComputer(){
        return getTextFromElement(welcomeText);
    }
    public void selectProcessor2_2GHzIntelPentiumDualCoreE2200(){
        selectByValueFromDropDown(processor,"1");
    }
    public void selectRAM8GB(){
        selectByValueFromDropDown(ram,"5");
    }
    public void selectHDDRadio400GB(){
        mouseHoverToElementAndClick(hdd);
    }
    public void selectOSRadioVistaPremium(){
        mouseHoverToElementAndClick(oS);
    }
    public void selectCheckBoxMicrosoftOffice(){
        mouseHoverToElement(msOffice);
    }

    public void selectCheckBoxTotalCommander(){
        mouseHoverToElementAndClick(totalCommander);
    }

    public String getTextFromPrice(){
        return getTextFromElement(price);
    }
    public void clickOnAddToCartButton(){
        clickOnElement(addToCart);
    }
    public String verifyTheProductHasBeenAddedToYourShoppingCart(){
        return getTextFromElement(verifyMsg);
    }
    public void closeTheBarByClickingOnTheCrossButton(){
        clickOnElement(closeTheMsg);
    }
    public void mouseHoverOnShoppingCart(){
        mouseHoverToElement(mouseHoverOnShoppingCart1);
    }
    public void mouseHoverAndClickOnGoToCartButton(){
        mouseHoverToElementAndClick(clickOnGoToCartButton1);
    }
}
