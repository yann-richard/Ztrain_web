
package com.Ztrain.steps;

import com.Ztrain.pageObjects.ResetPage;
import io.cucumber.java8.En;
import org.testng.Assert;

public class ResetPageStep implements En {

    public ResetPageStep(ResetPage resetPage){

        And("Click on \"Réenitialiser\"", ()-> {
            resetPage.clickOnResetBtn();
        });

        Then("we observe the pop pup which indicates \"votre mot de passe a été réinitialisé \"", ()-> {
            resetPage.saveScreenShotPNG();
            Assert.assertTrue(resetPage.verifyifpopmessage());
        });
        Then("I am on the resetPassword page", ()-> {
            resetPage.saveScreenShotPNG();
            Assert.assertTrue(resetPage.verifyResetPage());
        });
        And("^Fill email([^\"]*)", (String emailrst)-> {
            resetPage.getEmail(emailrst);
        });
        And("^Fill new Password([^\"]*)", (String newPasswordrst)-> {
            resetPage.getpassword(newPasswordrst);
        });


    }
}

