package com.betterware.stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Hooks {
    // Variable compartida de WebDriver
    public static WebDriver driver;

    // Método que se ejecuta antes de cada escenario
    @Before
    public void setUp() {
        // Se utiliza para definir varias configuraciones para la instancia del navegador Chrome.
        ChromeOptions options = new ChromeOptions();

        // WebDriverManager se encarga de descargar e indicar la versión correcta de ChromeDriver
        //WebDriverManager.chromedriver().setup();

        // Inicialización del navegador Chrome
        driver = new ChromeDriver();

        // Maximizar pantalla de navegación
        driver.manage().window().maximize();

        driver.get("https://practicetestautomation.com/practice-test-login/");

        System.out.println("ChromeDriver iniciado");

        //System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver.exe");
        //driver = new ChromeDriver();
        //driver.manage().window().maximize();
    }

    // Método que se ejecuta después de cada escenario
    @After
    public void tearDown() {
        if (driver != null) {
            // Cierra el navegador y libera los recursos
            driver.quit();
            System.out.println("ChromeDriver cerrado");
        }
    }

    // Método para obtener la instancia del WebDriver
    public static WebDriver getDriver() {
        return driver;
    }
}
