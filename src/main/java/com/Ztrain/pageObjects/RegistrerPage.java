package com.Ztrain.pageObjects;

import com.Ztrain.config.Properties;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class RegistrerPage extends Page{

    @FindBy(id = "email_register")
    private WebElement emailRegistrer;
    @FindBy(id = "input_address")
    private WebElement adressRegistrer;
    @FindBy(id = "input_birthday")
    private WebElement ageRegistrer;
    @FindBy(id = "password_register")
    private WebElement passwordRegistrer;
    @FindBy(id = "btn_register")
    private  WebElement inscription;
    @FindBy(className = "style_link__unbWN")
    private  WebElement se_connecter;

    private final static String URL = BASE_URL + "/auth/register";







    public void openHomePage(){
        get(Properties.Config.getEnvironment());
    }

    public void getEmailRegistrer(String emailRgter){
        emailRegistrer.sendKeys(emailRgter);
    }
    public void getpasswordRegistrer(String passwordRgter){
        passwordRegistrer.sendKeys(passwordRgter);
    }
    public void getageRegistrer(String ageRgstrer){
        ageRegistrer.sendKeys(ageRgstrer);
    }
    public void getadressRegistrer(String adressRgter){
        adressRegistrer.sendKeys(adressRgter);
    }



    public void clickOnse_connecter(){

        clickOn(se_connecter);
    }
    public void clickOninscription(){

        clickOn(inscription);
    }

    public boolean verifyRegistrerPage (){

        if(driver.getCurrentUrl().equalsIgnoreCase(URL));
        return true;

    }





}
