package Zadanie1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressPage {
    private WebDriver driver;

    public AddressPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "addresses-link")
    private WebElement addressButton;

    @FindBy(xpath = "//span[contains(text(), 'Create new address')]")
    private WebElement createAddressButton;

    public void addressButton() {
        addressButton.click();
    }

    public void createAddressButton() {
        createAddressButton.click();
    }
}

