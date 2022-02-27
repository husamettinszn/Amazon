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

    @Given("User offnet amazon Homepage")
    public void user_offnet_amazon_homepage() {

        Driver.getDriver().get(ConfigReader.getProperty("amazon_startSeite"));

    }
    @Given("User sucht iphone")
    public void user_sucht_iphone() {
        amazonPage.suchFeld.sendKeys("iphone", Keys.ENTER);

    }
    @Then("User verifiziert, dass das Ergebnis iphone enthalt")
    public void user_verifiziert_dass_das_ergebnis_iphone_enthalt() {
        System.out.println(amazonPage.ergebnisText.getText());
        Assert.assertTrue(amazonPage.ergebnisText.getText().contains("iphone"));

    }
    @Given("User sucht tea pot")
    public void user_sucht_tea_pot() {
        amazonPage.suchFeld.sendKeys("teapot", Keys.ENTER);

    }
    @Then("User verifiziert, dass das Ergebnis tea pot enthalt")
    public void user_verifiziert_dass_das_ergebnis_tea_pot_enthalt() {
        System.out.println(amazonPage.ergebnisText.getText());
        Assert.assertTrue(amazonPage.ergebnisText.getText().contains("teapot"));

    }
    @Given("User sucht flower")
    public void user_sucht_flower() {
        amazonPage.suchFeld.sendKeys("flower", Keys.ENTER);

    }
    @Then("User verifiziert, dass das Ergebnis flower enthalt")
    public void user_verifiziert_dass_das_ergebnis_flower_enthalt() throws InterruptedException {

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

    @Then("User verifiziert, dass das Ergebnis {string} enthalt")
    public void user_verifiziert_dass_das_ergebnis_enthalt(String gesuchtesWort) {
        Assert.assertTrue(amazonPage.ergebnisText.getText().contains(gesuchtesWort));

    }
}
