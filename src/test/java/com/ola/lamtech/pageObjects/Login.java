package com.ola.lamtech.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {



    //Initialise Web Elements using parameterised constructor
    public Login(WebDriver driver){

        PageFactory.initElements(driver, this);


    }

    public void setFirstname(){
        firstname.sendKeys("olatunji");
    }









    //Define Element Locators

    @FindBy(id="dghdjhdj")
    public static WebElement firstname;


}
