package com.betterware.stepDefinitions;

import com.betterware.pages.LoginPage;
import com.betterware.utils.ExcelReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import java.io.IOException;
import java.util.Map;


public class LoginStepDefinitions {
    private WebDriver driver;
    private LoginPage loginPage;

    public LoginStepDefinitions() {
        this.driver = Hooks.getDriver();  // Obtener el WebDriver del hook
        loginPage = new LoginPage(driver);
    }

    @Given("Open browser {string}")
    public void openBrowser(String url) {
        Hooks.driver.get(url);
    }

    @When("Login user")
    public void LoginUser() throws IOException, InterruptedException {
        Map<String, String> credentials = ExcelReader.getDataLogin( "LoginDataQA", 1);
        String username = credentials.get("username");
        String password = credentials.get("password");
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
        loginPage.clickLogin();
    }
    /*
    @When("Click in order")
    public void clickInOrder() throws InterruptedException {
        pedido.pedidoElectronico();
    }
     */
}
