package com.betterware.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        // Ruta a los archivos de características .feature
        features = "src/test/resources/feature",
        // Paquete donde están los step definitions
        glue = "com.betterware.stepDefinitions",
        // Plugins para generar reportes
        plugin = {
                "pretty",
                "html:target/cucumber-reports/cucumber.html",
                "json:target/cucumber-reports/cucumber.json"
        },
        // Para hacer que la consola sea más legible
        monochrome = true,
        // Puedes definir qué escenarios ejecutar usando etiquetas
        tags = "@LoginTest"
)

public class TestRunner extends AbstractTestNGCucumberTests {

}
