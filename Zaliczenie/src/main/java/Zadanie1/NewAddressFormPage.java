package Zadanie1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class NewAddressFormPage {

    public NewAddressFormPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "field-alias")
    private WebElement aliasField;

    @FindBy(id = "field-address1")
    private WebElement addressField;

    @FindBy(id = "field-city")
    private WebElement cityField;

    @FindBy(xpath = "//*[@id='field-id_state']/option[4]")
    private WebElement stateField;


    @FindBy(id = "field-postcode")
    private WebElement postcodeField;

    @FindBy(id = "field-id_country")
    private WebElement countrySelection;

    @FindBy(id = "field-phone")
    private WebElement phoneField;

    @FindBy(name = "submitAddress")
    private WebElement saveButton;



    public void createNewAddress(String alias, String address, String city, String postcode, String phone) {
        aliasField.sendKeys(alias);
        addressField.sendKeys(address);
        cityField.sendKeys(city);
        stateField.click();
        postcodeField.sendKeys(postcode);
        countrySelection.click();
        phoneField.sendKeys(phone);
        saveButton.submit();
    }

}
