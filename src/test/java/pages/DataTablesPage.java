package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DataTablesPage {

    public DataTablesPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//button[@class='dt-button buttons-create']")
    public WebElement newButton;
    @FindBy(id = "DTE_Field_first_name")
    public WebElement firstNameTextBox;
    @FindBy(id = "DTE_Field_last_name")
    public WebElement lastNameTextBox;
    @FindBy(id = "DTE_Field_position")
    public WebElement positionTexBox;
    @FindBy(id = "DTE_Field_office")
    public WebElement officeTexBox;
    @FindBy(id = "DTE_Field_extn")
    public WebElement extensionTexBox;
    @FindBy(id = "DTE_Field_start_date")
    public WebElement startDate;
    @FindBy(id="DTE_Field_salary")
    public WebElement salaryTextBox;
    @FindBy(xpath = "//button[@class='btn']")
    public WebElement create;
    @FindBy(xpath = "//input[@type='search']")
    public WebElement suchFeld;
    @FindBy(xpath = "//tbody//td[2]")
    public WebElement ersterName;

}
