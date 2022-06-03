package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.homePage;
import util.DriverFactory;

public class homePageSteps {

    homePage homePage = new homePage(DriverFactory.getDriver());


    @Given("Enes is on Home page")
    public void enes_is_home_page() {
        homePage.checkHomePage();
    }

    @Then("should see Banner")
    public void should_see_banner() {
        homePage.checkBanner();
    }

    @Then("should see {string} card")
    public void should_see_card(String string) {
        homePage.checkCard(string);
    }

    @When("click {string} card")
    public void clickCardCard(String card) {
        homePage.clickCard(card);
    }


    @When("click {string} button in the top right")
    public void clickCardInTheTopRight(String arg0) {
        if (arg0.contains("Giris Yap")) {
            homePage.clickHomeLoginButton();
        }
        else {
            System.out.println("Given button is not found");
        }
    }

    @Given("Enes is on Login Page")
    public void enesIsOnLoginPage() {
        homePage.clickHomeLoginButton();
    }
}
