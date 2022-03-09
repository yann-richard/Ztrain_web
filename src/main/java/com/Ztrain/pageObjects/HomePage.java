package com.Ztrain.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;


public class HomePage extends Page{
//Variables

    private final static String URL = BASE_URL + "/home";

    //Foncions
    public void openHomePage(){
        driver.navigate().to(URL);
    }
    public boolean verifyifHomePage (){
        if(driver.getCurrentUrl().equalsIgnoreCase(URL));
        return true;
    }





}
