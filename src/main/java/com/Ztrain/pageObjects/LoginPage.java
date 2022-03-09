package com.Ztrain.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Page{

//    variables
    @FindBy(id ="email_login")
    private WebElement emailField;
    @FindBy(id ="password_login")
    private WebElement passwordField;
    @FindBy(id ="btn_login")
    private WebElement connexion;
    @FindBy(className ="style_forgotpass__PRHm_")
    private WebElement resetPassword;
    @FindBy(css = "")
    private WebElement passwordSHOW;
    @FindBy(className = "style_link__unbWN")
    private WebElement S_inscrire;


    private final static String URL = BASE_URL + "/auth/login";



    // fonctions
    public void openloginPage(){
        get(URL);
    }

    public void clickOnS_inscrire(){

        clickOn(S_inscrire);
    }

    public void clickOnconnexion(){

        clickOn(connexion);
    }
    public void clickOnresetPassword(){

        clickOn(resetPassword);
    }
    public void getEmail(String email) throws InterruptedException {
        Thread.sleep(5000);
        emailField.sendKeys(email);
    }
    public void getpassword(String password){

        passwordField.sendKeys(password);
    }

    public boolean verifyLoginPage (){

        if(driver.getCurrentUrl().equalsIgnoreCase(URL));
        return true;

    }


}
