package com.betterware.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage  {
    private WebDriver driver;
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    // Elementos
    private By username = By.id("username");
    private By password = By.id("password");
    private By loginButton = By.id("submit");

    public void enterUsername(String user) {
        driver.findElement(username).sendKeys(user);
    }

    public void enterPassword(String pass) {
        driver.findElement(password).sendKeys(pass);
    }

    public void clickLogin() {
        driver.findElement(loginButton).click();
    }
}
