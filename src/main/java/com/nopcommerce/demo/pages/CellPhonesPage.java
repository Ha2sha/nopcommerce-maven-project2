package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class CellPhonesPage extends Utility {

    By welComeText=By.xpath("//h1[contains(text(),'Cell phones')]");
    By listView=By.xpath("//a[contains(text(),'List')]");
    By nokiaLumia1020=By.xpath("//a[contains(text(),'Nokia Lumia 1020')]");
    By getTextNokiaLumia1020=By.xpath("//h1[contains(text(),'Nokia Lumia 1020')]");
    By verifyThePrice$349=By.xpath("//span[contains(text(),'$349.00')]");
    By quantity1=By.xpath("//input[@value='1']");
    By addToCart=By.xpath("//button[@id='add-to-cart-button-20']");
    By verifyMsg=By.xpath("//body/div[@id='bar-notification']/div[1]");
    By closeTheMsg=By.xpath("//body/div[@id='bar-notification']/div[1]/span[1]");
    By mouseHoverOnShoppingCart1=By.xpath("//span[contains(text(),'Shopping cart')]");
    By clickOnGoToCartButton1=By.xpath("//button[contains(text(),'Go to cart')]");


    public String getWelcomeTextCellPhones(){
        return getTextFromElement(welComeText);
    }
    public void clickOnListView(){
        clickOnElement(listView);
    }
    public void clickOnNokiaLumia1020(){
        clickOnElement(nokiaLumia1020);
    }

    public String setGetTextNokiaLumia1020(){
        return getTextFromElement(getTextNokiaLumia1020);
    }
    public String getTextVerifyThePrice$349(){
        return getTextFromElement(verifyThePrice$349);
    }
    public void clearQuantity(){
        driver.findElement(By.xpath("//input[@value='1']")).clear();
    }
    public void addQuantity(String quantity){
    sendTextToElement(quantity1,quantity);
    }
    public void clickAddToCart(){
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
