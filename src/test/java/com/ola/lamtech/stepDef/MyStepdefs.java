package com.ola.lamtech.stepDef;

import com.ola.lamtech.pageObjects.Login;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyStepdefs {

    WebDriver driver;

    @Given("^user on homepage$")
    public void userOnHomepage() throws Throwable {
        System.out.println("testing2");

        System.setProperty("webdriver.chrome.driver","C:\\cucumberselenium\\sanitypack\\Browsers\\chrome\\win\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://www.lamtechservices.com/");
    }

    @When("^user click login$")
    public void userClickLogin() throws Throwable {
        System.out.println("testing3");

//        Login login = new Login(driver);
//        login.setFirstname();



    }

    @When("^user enter \"([^\"]*)\" as firstname and \"([^\"]*)\" as password$")
    public void userEnterAsFirstnameAndAsPassword(String arg0, String arg1) throws Throwable {
        System.out.println("testing1");

    }
}

