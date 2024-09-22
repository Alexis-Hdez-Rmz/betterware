package com.betterware.stepDefinitions;

import com.betterware.pages.LoginPage;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;


public class LoginStepDefinitions {
    private WebDriver driver;
    private LoginPage loginPage;
    private Hooks hooks;

    @Given("Open browser {string}")
    public void openBrowser(String url) {
        Hooks.driver.get(url);
        //driver = new ChromeDriver();
        //driver.get("https://practicetestautomation.com/practice-test-login/");
        //loginPage = new LoginPage(driver);
    }

/*
    @When("Login user")
    public void LoginUser() throws IOException, InterruptedException {
        Map<String, String> credentials = ExcelReader.getDataLogin( "LoginDataQA", 1);
        String username = credentials.get("username");
        String password = credentials.get("password");
        login.enterUsername(username);
        login.enterPassword(password);
        login.clickLogin();
    }

    @When("Click in order")
    public void clickInOrder() throws InterruptedException {
        pedido.pedidoElectronico();
    }
     */
}
