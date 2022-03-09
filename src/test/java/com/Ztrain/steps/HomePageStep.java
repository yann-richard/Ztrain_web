package com.Ztrain.steps;

import com.Ztrain.pageObjects.HomePage;
import io.cucumber.java8.En;
import org.testng.Assert;

public class HomePageStep implements En {

    public HomePageStep(HomePage homePage){

        Given(" I am on home page", ()-> {
            homePage.openHomePage();
        });
        Then("I am connected", ()-> {
        homePage.saveScreenShotPNG();
        Assert.assertTrue(homePage.verifyifHomePage());
    });

    }
}
