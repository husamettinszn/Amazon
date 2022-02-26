package stepdefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.DataTablesPage;

public class DataTablesStepDefinitions {

    DataTablesPage dataTablesPage = new DataTablesPage();

    @Then("User gibt {string} ins Vornamentextfeld")
    public void user_gibt_ins_vornamentextfeld(String string) throws InterruptedException {
        Thread.sleep(2000);
        dataTablesPage.firstNameTextBox.sendKeys(string);
    }

    @Then("User gibt {string} ins Namentextfeld")
    public void user_gibt_ins_namentextfeld(String string) {
       dataTablesPage.lastNameTextBox.sendKeys(string);
    }

    @Then("User gibt {string} ins Positiontextfeld")
    public void user_gibt_ins_positiontextfeld(String string) {
        dataTablesPage.positionTexBox.sendKeys(string);
    }

    @Then("User gibt {string} ins Officetextfeld")
    public void user_gibt_ins_officetextfeld(String string) {
        dataTablesPage.officeTexBox.sendKeys(string);
    }

    @Then("User gibt {string} ins Extentiontextfeld")
    public void user_gibt_ins_extentiontextfeld(String string) {
        dataTablesPage.extensionTexBox.sendKeys(string);
    }

    @Then("User gibt {string} ins Startdatumtextfeld")
    public void user_gibt_ins_startdatumtextfeld(String string) {
        dataTablesPage.startDate.sendKeys(string);
    }

    @Then("User gibt {string} ins Gehalttextfeld")
    public void user_gibt_ins_gehalttextfeld(String string) {
        dataTablesPage.salaryTextBox.sendKeys(string);
    }

    @Then("User klik auf create Button")
    public void user_klik_auf_create_button() {
       dataTablesPage.create.click();
    }

    @Then("User sucht {string} im Suchfeld")
    public void user_sucht_im_suchfeld(String string) {
        dataTablesPage.suchFeld.sendKeys(string, Keys.ENTER);
    }

    @Then("User verifiziert, dass {string} in der Liste steht")
    public void user_verifiziert_dass_in_der_liste_steht(String string) {
        System.out.println(dataTablesPage.ersterName.getText());
        Assert.assertTrue(dataTablesPage.ersterName.getText().contains(string));
    }

    @Then("User klikt auf new Taste")
    public void userKliktAufNewTaste() {
        dataTablesPage.newButton.click();
    }
}
