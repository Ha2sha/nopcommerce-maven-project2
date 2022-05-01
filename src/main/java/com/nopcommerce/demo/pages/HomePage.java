package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage extends Utility {

    By computer = By.linkText("Computers");
    By desktop=By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Desktops']");

    By mouseHoverTOElectronics = By.linkText("Electronics");
    By mouseHoverToCellPhonesAndClick = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Cell phones']");

    By homePageMenuTabs = By.xpath("//div[@class='header-menu']/ul[1]/li/a");

    public void mouseHoverTOComputers() {
        mouseHoverToElement(computer);
    }
    public void mouseHoverToDesktopAndClick(){
        mouseHoverToElementAndClick(desktop);
    }


    public void setMouseHoverTOElectronics() {
        mouseHoverToElement(mouseHoverTOElectronics);
    }
   public void setMouseHoverToCellPhonesAndClick(){
        mouseHoverToElementAndClick(mouseHoverToCellPhonesAndClick);
   }

    public String clickOnMenu(String menu) {
        List<WebElement> menuList = driver.findElements(homePageMenuTabs);
        String expectedText = null;
        for (WebElement element : menuList) {
            if (element.getText().equalsIgnoreCase(menu)) {
                expectedText = element.getText();
                element.click();
                break;
            }
        }
        return expectedText;
    }


}
