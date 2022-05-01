package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class RegisterPage extends Utility {
   By welcomeText=By.xpath("//h1[contains(text(),'Register')]");
   By firstName1=By.xpath("//input[@id='FirstName']");
   By lastName1=By.xpath("//input[@id='LastName']");
   By email1=By.xpath("//input[@id='Email']");
   By password1=By.xpath("//input[@id='Password']");
   By confirmPassword1=By.xpath("//input[@id='ConfirmPassword']");
   By registerButton=By.xpath("//button[@id='register-button']");
   By registrationText=By.xpath("//div[contains(text(),'Your registration completed')]");
   By continueButton=By.xpath("//a[contains(text(),'Continue')]");

   public String getTextFromRegisterPage(){
       return getTextFromElement(welcomeText);
   }
    public void enterFirstName(String firstName){
        sendTextToElement(firstName1,firstName);
    }
    public void enterLastName(String lastName){
        sendTextToElement(lastName1,lastName);
    }
    public void enterEmail(String email){
        sendTextToElement(email1,email);
    }
    public void enterPassword(String password){
        sendTextToElement(password1,password);
    }
    public void enterConfirmPassword(String confirmPassword){
        sendTextToElement(confirmPassword1,confirmPassword);
    }
    public void clickOnRegisterButton(){
        clickOnElement(registerButton);
    }
    public String getConfirmRegistrationText(){
        return getTextFromElement(registrationText);
    }
    public void clickOnContinueButton(){
        clickOnElement(continueButton);
    }



}
