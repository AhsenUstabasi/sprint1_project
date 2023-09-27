package com.sprint1.pages;

import com.sprint1.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Access_search_dataPage {


    public Access_search_dataPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }




    @FindBy(id="sitemap-menu")
    public WebElement hamburger_menu;

    @FindBy(xpath="//*[@id=\"sitemap-content\"]/div[1]/div/a[5]")
    public WebElement conBtn;



    @FindBy(xpath="/html/body/table/tbody/tr[1]/td/div[2]/div/div[3]/div/div/form/input")
    public WebElement search_bar;



    @FindBy(xpath = "/html/body/div[6]/div/div[2]/div[2]/div/div[1]/a")
    public WebElement clickGroup;


    @FindBy(id="pagetitle")
    public WebElement con_title;



}


