package com.sprint1.stepDefinitions;

import com.sprint1.pages.Access_search_dataPage;
import com.sprint1.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class access_search_data_step {



    Access_search_dataPage Access_search_dataPage= new Access_search_dataPage();



    @Then("user click hamburger menu")
    public void userClickHamburgerMenu() {
        Access_search_dataPage.hamburger_menu.click();

    }
    @Then("user can click conversation button")
    public void userCanClickConversationButton() {

        Access_search_dataPage.conBtn.click();
    }



    @Then("user see conversation title")
    public void userSeeConversationTitle() {


        String expected="Conversations";
        String actual= Driver.getDriver().getTitle();
        WebDriverWait wait= new WebDriverWait(Driver.getDriver(), Duration.ofMillis(1));

        Assert.assertTrue(actual.contains(expected));


    }
    @Given("user see conversation tit")
    public void userSeeConversationTit() {
        Access_search_dataPage.hamburger_menu.click();
        WebDriverWait wait= new WebDriverWait(Driver.getDriver(), Duration.ofMillis(3000));
        Access_search_dataPage.conBtn.click();
    }

    @When("user click search bar top the page")
    public void user_click_search_bar_top_the_page() {
        Access_search_dataPage.search_bar.click();

    }


    @Given("user click search bar top the pages")
    public void userClickSearchBarTopThePages() {
        Access_search_dataPage.search_bar.click();


    }
    @When("user types {string}")
    public void userTypes(String arg0) {




        Access_search_dataPage.search_bar.sendKeys("Group"+ Keys.ENTER);

    }


    @Then("user click their group")
    public void userClickTheirGroup() {
        Access_search_dataPage.clickGroup.click();
    }



}



