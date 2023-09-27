package com.sprint1.stepDefinitions;

import com.sprint1.pages.LoginPage;
import com.sprint1.utilities.ConfigurationReader;
import com.sprint1.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;


public class login_step {

    LoginPage LoginPage=new LoginPage();

    @Given("user is on the library login page")
    public void user_is_on_the_library_login_page() {
        String url= ConfigurationReader.getProperty("url");
        Driver.getDriver().get(url);

    }
    @When("{string} enters helpdesk  username")
    public void enters_helpdesk_username(String string) {
        String username=ConfigurationReader.getProperty("helpdesk.username");
        LoginPage.inputUsername.sendKeys(username);

    }
    @Then("{string} enters helpdesk  password")
    public void enters_helpdesk_password(String string) {
        String password=ConfigurationReader.getProperty("helpdesk.password");
        LoginPage.inputPassword.sendKeys(password);

    }
    @Then("user click sing in button")
    public void user_click_sing_in_button() {
        LoginPage.click_sing_in.click();

    }
    @Then("user should see the dashboard")
    public void user_should_see_the_dashboard() {
        String expected="Portal";
        String actual=Driver.getDriver().getTitle();
        WebDriverWait wait= new WebDriverWait(Driver.getDriver(), Duration.ofMillis(5));

        Assert.assertTrue(actual.contains(expected));

    }
    @Then("user close driver")
    public void userCloseDriver() {
        Driver.closeDriver();
    }

    @Then("{string} enters hr username")
    public void enters_hr_username(String string) {
        String username2=ConfigurationReader.getProperty("hr.username");
        LoginPage.inputUsername.sendKeys(username2);
    }

    @Then("{string} enters hr  password")
    public void enters_hr_password(String string) {
        String password2=ConfigurationReader.getProperty("hr.password");
        LoginPage.inputPassword.sendKeys(password2);

    }

    @Then("{string} enters marketing  username")
    public void enters_marketing_username(String string) {
        String username3=ConfigurationReader.getProperty("marketing.username");
        LoginPage.inputUsername.sendKeys(username3);

    }

    @Then("{string} enters marketing  password")
    public void enters_marketing_password(String string) {
        String password=ConfigurationReader.getProperty("marketing.password");
        LoginPage.inputPassword.sendKeys(password);


    }




}



