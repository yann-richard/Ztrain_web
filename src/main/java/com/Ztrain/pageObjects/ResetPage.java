package com.Ztrain.pageObjects;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class ResetPage extends Page{
    //    variables
    @FindBy(id ="email_reset_pass")
    private WebElement emailFieldReset;
    @FindBy(id ="reset_password")
    private WebElement passwordFieldReset;
    @FindBy(id ="btn_reset_password")
    private WebElement ResetBtn;
    @FindBy(css ="")
    private WebElement popmessage;
    @FindBy(css = "")
    private WebElement passwordSHOWReset;


    private final static String URL = BASE_URL + "/auth/resetPassword";


    // Fontions

    public void clickOnResetBtn(){

        clickOn(ResetBtn);
    }
    public void clickOnpasswordSHOWReset(){

        clickOn(passwordSHOWReset);
    }
    public void getEmail(String emailreset){

        emailFieldReset.sendKeys(emailreset);
    }
    public void getpassword(String passwordreset){

        passwordFieldReset.sendKeys(passwordreset);
    }
    public boolean verifyifpopmessage (){
        shortUntil(visibilityOf(popmessage));
        return popmessage.isDisplayed();
    }
    public boolean verifyResetPage (){

        if(driver.getCurrentUrl().equalsIgnoreCase(URL));
        return true;

    }

}





