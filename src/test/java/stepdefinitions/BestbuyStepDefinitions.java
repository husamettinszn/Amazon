package stepdefinitions;

import io.cucumber.java.en.When;
import utilities.ConfigReader;
import utilities.Driver;

public class BestbuyStepDefinitions {

    @When("User geht zur {string} seite")
    public void user_geht_zur_seite(String string) {

        Driver.getDriver().get(ConfigReader.getProperty(string));
    }
}
