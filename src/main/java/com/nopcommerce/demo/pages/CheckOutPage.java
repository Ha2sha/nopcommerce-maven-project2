package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class CheckOutPage extends Utility {
   By welcomeText=By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");
   By registerButton=By.xpath("//button[contains(text(),'Register')]");
    By country1=By.xpath("//select[@id='BillingNewAddress_CountryId']");
    By city1=By.xpath("//input[@id='BillingNewAddress_City']");
    By address1=By.xpath("//input[@id='BillingNewAddress_Address1']");
    By postcode1=By.xpath("//input[@id='BillingNewAddress_ZipPostalCode']");
    By phoneNumber1=By.xpath("//input[@id='BillingNewAddress_PhoneNumber']");
    By continueButton=By.name("save");
    By radio2ndDayAir=By.xpath("//label[contains(text(),'2nd Day Air ($0.00)')]");
    By continue2=By.xpath("//*[@id='shipping-method-buttons-container']/button");
    By radioCreditCard=By.xpath("//label[contains(text(),'Credit Card')]");
    By continue3=By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[4]/div[2]/div[1]/button[1]");
    By creditCardType=By.xpath("//select[@id='CreditCardType']");
    By carHolderName1=By.xpath("//input[@id='CardholderName']");
    By cardNumber1=By.xpath("//input[@id='CardNumber']");
    By expiryMonth1=By.xpath("//select[@id='ExpireMonth']");
    By expiryYear1=By.xpath("//select[@id='ExpireYear']");
    By cardCode1 =By.xpath("//input[@id='CardCode']");
    By continue4=By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[5]/div[2]/div[1]/button[1]");
    By paymentMethod=By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[6]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[1]");
    By shippingMethod=By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[6]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/ul[1]/li[1]");
    By total=By.xpath("//body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[6]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/div[1]/div[1]/table[1]/tbody[1]/tr[4]/td[2]/span[1]/strong[1]");
    By confirm=By.xpath("//button[contains(text(),'Confirm')]");
    By verifyThankYou= By.xpath("//h1[contains(text(),'Thank you')]");
    By cartProcessed=By.xpath("//strong[contains(text(),'Your order has been successfully processed!')]");
    By continue5=By.xpath("//button[contains(text(),'Continue')]");
    By welcomeStoreText=By.xpath("//h2[contains(text(),'Welcome to our store')]");
    By logoutLink=By.xpath("//a[contains(text(),'Log out')]");

    By guestTab=By.xpath("//button[contains(text(),'Checkout as Guest')]");
    By fName=By.xpath("//input[@id='BillingNewAddress_FirstName']");
    By lName=By.xpath("//input[@id='BillingNewAddress_LastName']");
    By email1=By.xpath("//input[@id='BillingNewAddress_Email']");
    By nextDayAir=By.xpath("//input[@id='shippingoption_1']");
    By total2=By.xpath("//body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[6]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/div[1]/div[1]/table[1]/tbody[1]/tr[4]/td[2]/span[1]/strong[1]");
    By nextDayAir2=By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[6]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/ul[1]/li[1]");
   public String getTextFromCheckOutPage(){
       return getTextFromElement(welcomeText);
   }
   public void clickOnRegisterButton(){
       clickOnElement(registerButton);
   }
    public void selectCountry(String country){
        selectByVisibleTextFromDropDown(country1,country);
    }
    public void enterCity(String city){
        sendTextToElement(city1,city);
    }
    public void enterAddress(String address){
        sendTextToElement(address1,address);
    }
    public void enterPosCode(String postcode){
        sendTextToElement(postcode1,postcode);
    }
    public void enterPhoneNumber(String phoneNumber){
        sendTextToElement(phoneNumber1,phoneNumber);
    }
    public void clickOnContinueButton(){
        clickOnElement(continueButton);
    }
    public void clickOnRadioButton2ndDayAir(){
       clickOnElement(radio2ndDayAir);

    }
    public void clickOnContinue(){
        clickOnElement(continue2);
    }
    public void selectRadioButtonCreditCard(){
       clickOnElement(radioCreditCard);
    }
    public void clickContinue(){
       clickOnElement(continue3);
    }
    public void selectCreditCardType(String text){
        selectByValueFromDropDown(creditCardType, text);
    }
    public void enterCardHolderName(String cardHolderName){
        sendTextToElement(carHolderName1,cardHolderName);
    }
    public void enterCardNumber(String cardNumber){
        sendTextToElement(cardNumber1,cardNumber);
    }
    public void selectExpiryMonth(String expiryMonth){
        selectByValueFromDropDown(expiryMonth1,expiryMonth);
    }
    public void selectExpiryYear(String expiryYear){
        selectByValueFromDropDown(expiryYear1,expiryYear);
    }
    public void enterCardCode(String cardCode){
        sendTextToElement(cardCode1,cardCode);
    }

    public void clickContinue4(){
       clickOnElement(continue4);
    }

    public String getTextFromPaymentMethod(){
       return getTextFromElement(paymentMethod);
    }
    public String getTextFromShippingMethod(){
        return getTextFromElement(shippingMethod);
    }
    public String getTextFromTotal(){
        return getTextFromElement(total);
    }

    public void clickOnConfirm(){
       clickOnElement(confirm);
    }
    public String getTextFromThankYou(){
        return getTextFromElement(verifyThankYou);
    }
    public String getTextCartProcessedSuccessfully(){
        return getTextFromElement(cartProcessed);
    }
    public void clickContinue5(){
        clickOnElement(continue5);
    }
    public String getWelcomeStoreText(){
        return getTextFromElement(welcomeStoreText);
    }
    public void clickOnLogoutLink(){
       clickOnElement(logoutLink);
    }
    public String getUrl(){
       return driver.getCurrentUrl();
    }

    public void clickOnCheckoutAsGuest(){
       clickOnElement(guestTab);
    }
    public void enterFirstName(String firstname){
        sendTextToElement(fName,firstname);
    }
    public void enterLastName(String lastname){
        sendTextToElement(lName,lastname);
    }
    public void enterEmail(String email){
        sendTextToElement(email1,email);
    }
    public void clickOnRadioNextDayAir(){
        clickOnElement(nextDayAir);
    }
    public String getTextFromNextDayAir(){
       return getTextFromElement(nextDayAir2);
    }
    public String getTotalOf$2950(){
       return getTextFromElement(total2);
    }
}