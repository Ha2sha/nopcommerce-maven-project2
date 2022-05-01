package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class ShoppingCartPage extends Utility {
    By shoppingCartMsg=By.xpath("//h1[normalize-space()='Shopping cart']");
    By qty=By.xpath("//span[contains(text(),'(2)')]");
    By verifyTotal=By.xpath("//tbody/tr[1]/td[6]/span[1]");
    By clickOnCheckBoxTermsAndConditions=By.id("termsofservice");
    By checkOutButton=By.id("checkout");
    By quantity1=By.xpath("//input[@value='1']");
    By updateShoppingCart=By.xpath("//button[@id='updatecart']");
    By subTotal=By.xpath("//span[@class='product-subtotal']");





    public String getTextFromShoppingCart(){
        return getTextFromElement(shoppingCartMsg);
    }
    public String getTextFromQuantity(){
        return getTextFromElement(qty);
    }
    public String getTextFromVerifyTotal(){
        return getTextFromElement(verifyTotal);
    }
    public void setClickOnCheckBoxTermsAndConditions(){
        mouseHoverToElementAndClick(clickOnCheckBoxTermsAndConditions);
    }
    public void clickOnCheckOutButton(){
       mouseHoverToElementAndClick(checkOutButton);
    }
    public void clearQuantity(){
        driver.findElement(By.xpath("//input[@value='1']")).clear();
    }
    public void addQuantity2(){
        sendTextToElement(quantity1,"2");
    }
    public void clickOnUpdateShoppingCart(){
        clickOnElement(updateShoppingCart);
    }
    public String getTextFromSubTotal(){
        return getTextFromElement(subTotal);
    }





}
