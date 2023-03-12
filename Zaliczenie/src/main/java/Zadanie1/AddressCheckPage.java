package Zadanie1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AddressCheckPage {

    public AddressCheckPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    @FindBy(id = "main")
    private WebElement addressCheck;

    @FindBy(css = ".alert-success")
    private WebElement deleteAddressMessage;

    @FindBy(xpath = "//article[contains(.,'praca')]/div[@class = 'address-footer']//span[contains(., 'Delete')]")
    private WebElement deleteAddress;


    public void deleteAddress() {
        deleteAddress.click();
        //List<WebElement> elements = driver.findElements(By.xpath("//a[@data-link-action='delete-address']"));
        //WebElement element = elements.get(1);
        //element.click();
        // //article[contains(.,'Domowy')]/div[@class = 'address-footer']//span[contains(., 'Delete')]
    }

    public String addressDetailsCheck(){
        return addressCheck.getText();
    }

    public String addressDeleteCheck() {
        return deleteAddressMessage.getText();
    }

}
