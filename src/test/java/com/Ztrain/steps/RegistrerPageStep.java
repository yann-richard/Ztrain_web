
package com.Ztrain.steps;

import io.cucumber.java8.En;
import com.Ztrain.pageObjects.RegistrerPage;
import org.testng.Assert;


public class RegistrerPageStep implements En {

    public RegistrerPageStep(RegistrerPage registrerPage){

        And("^write email for registration ([^\"]*)", (String emailRgter)-> {
            registrerPage.getEmailRegistrer(emailRgter);
        });

        And("^write adress for registration([^\"]*)", (String adressRgter)-> {
            registrerPage.getadressRegistrer(adressRgter);
        });
        And("^write password for registration([^\"]*)", (String passwordRgter)-> {
            registrerPage.getpasswordRegistrer(passwordRgter);
        });
        And("^write age for registration([^\"]*)", (String ageRegistrer)-> {
            registrerPage.getageRegistrer(ageRegistrer);
        });

        And("Click on \"inscription\"", ()-> {
            registrerPage.clickOninscription();
        });

        And("Click on \"Se_connecter\"", ()-> {
            registrerPage.clickOnse_connecter();
        });
        Then("I am on the registrer page", ()-> {
            registrerPage.saveScreenShotPNG();
            Assert.assertTrue(registrerPage.verifyRegistrerPage());
        });

    }
}


