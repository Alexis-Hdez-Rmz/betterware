package com.betterware.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage  {
    private WebDriver driver;
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // Elementos
    private By username = By.xpath("//input[@placeholder= 'Escribe tu usuario']");
    private By password = By.xpath("//input[@placeholder= 'Escribe tu contraseña']");
    private By loginButton = By.xpath("//button[@data-testid= 'login__form__submit']");

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
