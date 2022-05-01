package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DeskTopPage extends Utility {

    By priceLowToHigh=By.xpath("//select[@id='products-orderby']");
    By nameAToZ=By.id("products-orderby");
    By buildYourOwnComputer=By.xpath("//button[@class='button-2 product-box-add-to-cart-button']");
    By className=By.className("prices");

    public void selectPriceLowToHigh(){
        selectByValueFromDropDown(priceLowToHigh,"10");
    }
    public void selectNameAtoZ(){
        selectByValueFromDropDown(nameAToZ,"5");
    }
    public void buildYourOwnComputerAddToCart(){
        clickOnElement(buildYourOwnComputer);
    }

    public List<Double> sortingPriceLowToHigh() throws InterruptedException {
        //1.4.1store actual list b4 sorting
        List<WebElement> actualList=driver.findElements(className);
        List<String> actualListPriceString=new ArrayList<>();
        for(WebElement p:actualList){
            actualListPriceString.add(String.valueOf(p.getText().replace("$","")));
        }
        //1.4.2 remove , sign add the double type List
        List<Double> actualListPriceDouble = new ArrayList();
        for (String element : actualListPriceString) {
            actualListPriceDouble.add(Double.valueOf(element.replace(",", "")));
        }
        return actualListPriceDouble;
    }
    public void reverseSortCollection(List<Double>a){
        Collections.reverse(a);
    }
    public void sortCollection(List<Double>a){
        Collections.sort(a);
    }

}
