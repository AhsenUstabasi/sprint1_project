package com.sprint1.pages;

import com.sprint1.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class LoginPage {


    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(name="USER_LOGIN")
    public WebElement inputUsername;


    @FindBy(name="USER_PASSWORD")
    public WebElement inputPassword;

    @FindBy(xpath ="//*[@id=\"login-popup\"]/form/div[2]/input")
    public WebElement click_sing_in;








}

