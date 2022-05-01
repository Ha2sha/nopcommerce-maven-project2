package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class TopMenuPage extends Utility {
    By welcomeText=By.tagName("h1");

    public String getWelcomeText(){
        return getTextFromElement(welcomeText);
    }
}
