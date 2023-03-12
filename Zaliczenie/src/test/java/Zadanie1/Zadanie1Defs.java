package Zadanie1;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Zadanie1Defs {
    private WebDriver driver;

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://mystore-testlab.coderslab.pl");
    }

    @After
    public void cleanup(){
        driver.quit();
    }

    @When("user logs in with {} and {}")
    public void user_logs_in(String email, String password) {
        MainPage mainPage = new MainPage(driver);
        mainPage.signInButton();

        SignInPage signInPage = new SignInPage(driver);
        signInPage.SignIn(email, password);

        AddressPage addressPage = new AddressPage(driver);
        addressPage.addressButton();
        addressPage.createAddressButton();

    }
    @And("user adds new address with {}, {}, {}, {}, {}")
    public void user_adds_new_address(String alias, String address, String city, String postcode, String phone) {
        NewAddressFormPage newAddressFormPage = new NewAddressFormPage(driver);
        newAddressFormPage.createNewAddress(alias, address, city, postcode, phone);

    }

    @Then("new address should contain {}, {}, {}, {}, {}")
    public void new_address_contains(String expectedAlias, String expectedAddress, String expectedCity, String expectedPostcode, String expectedPhone) {
        AddressCheckPage addressCheckPage = new AddressCheckPage(driver);
        Assert.assertTrue(addressCheckPage.addressDetailsCheck().contains(expectedAlias) );
        Assert.assertTrue(addressCheckPage.addressDetailsCheck().contains(expectedAddress) );
        Assert.assertTrue(addressCheckPage.addressDetailsCheck().contains(expectedCity) );
        Assert.assertTrue(addressCheckPage.addressDetailsCheck().contains(expectedPostcode) );
        Assert.assertTrue(addressCheckPage.addressDetailsCheck().contains(expectedPhone) );
    }

    @Then("user can delete the address")
    public void deleteAddress() {
        AddressCheckPage addressCheckPage = new AddressCheckPage(driver);
        addressCheckPage.deleteAddress();

        Assert.assertEquals("Address successfully deleted!", addressCheckPage.addressDeleteCheck());
    }


}

