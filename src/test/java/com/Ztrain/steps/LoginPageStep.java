package com.Ztrain.steps;

        import com.Ztrain.pageObjects.LoginPage;
        import io.cucumber.java8.En;
        import org.testng.Assert;

public class LoginPageStep implements En {

    public LoginPageStep(LoginPage loginPage){

        Given("as a user I am on the loginpage", ()-> {
            loginPage.openloginPage();
        });
        And("^Enter valid email([^\"]*)", (String email)-> {
            loginPage.getEmail(email);
        });
        And("^Enter valid password([^\"]*)", (String password)-> {
            loginPage.getpassword(password);
        });

        And("Click on \"connexion\"", ()-> {
            loginPage.clickOnconnexion();
        });
        And("Click on \"Mot de passe oublié?\"", ()-> {
            loginPage.clickOnresetPassword();
        });
        And("Click on \"S'inscrire\"", ()-> {
            loginPage.clickOnS_inscrire();
        });
        And("Go to loginPage", ()-> {
            loginPage.openloginPage();
        });
        Then("you are on the login page", ()-> {
            loginPage.saveScreenShotPNG();
            Assert.assertTrue(loginPage.verifyLoginPage());
        });











    }
}
