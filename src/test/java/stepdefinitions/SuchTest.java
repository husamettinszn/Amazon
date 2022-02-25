package stepdefinitions;

import io.cucumber.java.bs.A;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.tr.Ama;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class SuchTest {

    AmazonPage amazonPage = new AmazonPage();

    @Given("User öffnet amazon Homepage")
    public void user_öffnet_amazon_homepage() {

        Driver.getDriver().get(ConfigReader.getProperty("amazon_startSeite"));

    }
    @Given("User sucht iphone")
    public void user_sucht_iphone() {
        amazonPage.suchFeld.sendKeys("iphone", Keys.ENTER);

    }
    @Then("User verifiziert, dass das Ergebnis iphone enthält")
    public void user_verifiziert_dass_das_ergebnis_iphone_enthält() {
        System.out.println(amazonPage.ergebnisText.getText());
        Assert.assertTrue(amazonPage.ergebnisText.getText().contains("iphone"));

    }
    @Given("User sucht tea pot")
    public void user_sucht_tea_pot() {
        amazonPage.suchFeld.sendKeys("teapot", Keys.ENTER);

    }
    @Then("User verifiziert, dass das Ergebnis tea pot enthält")
    public void user_verifiziert_dass_das_ergebnis_tea_pot_enthält() {
        System.out.println(amazonPage.ergebnisText.getText());
        Assert.assertTrue(amazonPage.ergebnisText.getText().contains("teapot"));

    }
    @Given("User sucht flower")
    public void user_sucht_flower() {
        amazonPage.suchFeld.sendKeys("flower", Keys.ENTER);

    }
    @Then("User verifiziert, dass das Ergebnis flower enthält")
    public void user_verifiziert_dass_das_ergebnis_flower_enthält() {
        System.out.println(amazonPage.ergebnisText.getText());
        Assert.assertTrue(amazonPage.ergebnisText.getText().contains("flower"));

    }

    @Then("User schlieẞt die Seite.")
    public void userSchlieẞtDieSeite() {
        Driver.closeDriver();
    }

    @When("User sucht {string}")
    public void user_sucht(String gesuchtesWort) {

        amazonPage.suchFeld.sendKeys(gesuchtesWort+ Keys.ENTER);
    }

    @Then("User verifiziert, dass das Ergebnis {string} enthält")
    public void user_verifiziert_dass_das_ergebnis_enthält(String gesuchtesWort) {
        Assert.assertTrue(amazonPage.ergebnisText.getText().contains(gesuchtesWort));

    }
}
