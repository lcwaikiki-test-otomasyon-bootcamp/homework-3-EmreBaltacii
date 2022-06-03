package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import util.DriverFactory;

public class LoginPageSteps {

    pages.LoginPage loginPage = new LoginPage(DriverFactory.getDriver());

    @When("click {string} radio button")
    public void clickRadioButton(String arg0) {
        if (arg0.equals("E-posta")) {
            loginPage.clickEmailRadioButton();
        }
        else if (arg0.equals("Telefon")) {
            loginPage.clickPhoneRadioButton();
        }
        else {
            System.out.println("There is no such radio button");
        }
    }

    @Then("should see {string} title")
    public void shouldSeeTitle(String arg0) {
        if (arg0.equals("GIRIS YAP")) {
            loginPage.checkLoginTitle();
        }
        else {
            System.out.println("There is no such title");
        }
    }

    @Then("should see {string} radio button")
    public void shouldSeeRadioButton(String arg0) {
        if (arg0.equals("E-Posta")) {
            loginPage.checkEmailRadioButton();
        }
        else if (arg0.equals("Telefon")) {
            loginPage.checkPhoneRadioButton();
        }
        else {
            System.out.println("There is no such visible radio button");
        }
    }

    @Then("should see {string} Email Empty message")
    public void shouldSeeEmailEmptyMessage(String arg0) {
            loginPage.checkEmptyEmailWarning(arg0);
    }

    @Then("should see {string} text on Email")
    public void shouldSeeTextOnEmail(String arg0) {
        loginPage.checkEmailPlaceholder(arg0);
    }

    @Then("should see {string} text on Password")
    public void shouldSeeTextOnPassword(String arg0) {
        loginPage.checkPasswordPlaceholder(arg0);
    }

    @Then("should see Show Password Icon")
    public void shouldSeeShowPasswordIcon() {
        loginPage.checkShowPassword();
    }

    @Then("should see {string} remember me")
    public void shouldSeeRememberMe(String arg0) {
        loginPage.checkRememberMeCheckbox();
    }


    @Then("should see {string} forgot password")
    public void shouldSeeForgotPassword(String arg0) {
        loginPage.checkForgotPasswordButton();
    }

    @Then("should see {string} login button")
    public void shouldSeeLoginButton(String arg0) {
        loginPage.checkLoginButton();
    }

    @Then("should see Phone Text Box")
    public void shouldSeePhoneTextBox() {
        loginPage.checkPhoneTextField();
    }

    @When("click login button")
    public void clickLoginButton() {
        loginPage.clickLoginButton();
    }

    @Then("should see {string} Password Empty message")
    public void shouldSeePasswordEmptyMessage(String arg0) {
        loginPage.checkEmptyPasswordWarning(arg0);
    }

    @When("type Email {string}")
    public void typeEmail(String arg0) {
        loginPage.fillEmailField(arg0);
    }

    @When("type Password {string}")
    public void typePassword(String arg0) {
        loginPage.fillPasswordField(arg0);
    }

    @When("type Email {string} and click login")
    public void typeEmailAndClickLogin(String arg0) {
        loginPage.fillEmailField(arg0);
        loginPage.clickLoginButton();
    }

    @Then("should see {string} Email False message")
    public void shouldSeeEmailFalseMessage(String arg0) {
        loginPage.checkInvalidEmailWarning(arg0);
    }


    @When("type Email {string}, Password {string} and click login")
    public void typeEmailPasswordAndClickLogin(String arg0, String arg1) {
        loginPage.fillEmailField(arg0);
        loginPage.fillPasswordField(arg1);
        loginPage.clickLoginButton();
    }

    @Then("should see {string} Login Error message")
    public void shouldSeeLoginErrorMessage(String arg0) {
        loginPage.checkUnmatchedCredentialsWarning(arg0);
    }

    @Then("should see Login Page")
    public void shouldSeeLoginPage() {
        loginPage.checkLoginTitle();
    }
}
