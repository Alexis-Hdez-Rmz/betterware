package com.betterware.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.io.IOException;

public class PedidoPage {
    WebDriver driver;

    // Localizadores con @FindBy
    @FindBy(xpath = "//button/span[text()=('Pedidos')]")
    WebElement pedido;
    @FindBy(xpath = "//span[text()=('Pedido electrónico')]")
    WebElement pedidoElectronico;
    @FindBy(xpath = "//h1[text()=('Crear Pedido Electrónico')]")
    WebElement crearPedido;
    @FindBy(xpath = "//input[@placeholder=('######### - Nombre de Asociado')]")
    WebElement asociado;
    @FindBy(xpath = "//div[text()=('30000002 - maria asoc de z100 A')]")
    WebElement elemAsociado;
    @FindBy(xpath = "//*[contains(text(),'Catálogo-09')]/parent::div/div")
    WebElement catalogo;
    @FindBy(xpath = "//input[@placeholder=('Ej. 010203 o Better Pop')]")
    WebElement producto;
    @FindBy(xpath = "//p[contains(text(),'Agrega productos')]/parent::div//following-sibling::div//following-sibling::div[@style='display: inline-block;']/input")
    WebElement cantidad;
    @FindBy(xpath = "//span[text()=('Agregar')]")
    WebElement agregar;
    @FindBy(xpath = "//span[text()=('Agregar')]")
    WebElement guardar_Crear;
    @FindBy(xpath = "//span[text()=('Continuar')]")
    WebElement continuar;

    // Constructor
    public PedidoPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public void pedidoElectronico() throws InterruptedException {
        Thread.sleep(1000);
        pedido.click();
        pedidoElectronico.click();
        crearPedido.click();
    }

    public void crearPedido(String asocia, String catalogo) throws IOException, InterruptedException {
        asociado.sendKeys(asocia);
        asociado.sendKeys(Keys.BACK_SPACE);
        Thread.sleep(500);
        asociado.sendKeys(Keys.BACK_SPACE);
        asociado.sendKeys(Keys.ARROW_DOWN);
        asociado.sendKeys(Keys.ENTER);
       // catalogo.click();
    }
    public void crearProducto(String articulo, int cant) throws IOException, InterruptedException {
        String qty = cant +"";
        Thread.sleep(200);
        producto.sendKeys(articulo);
        articulo= "//div[contains(text(),'" + articulo +"')]";
        By ELEMN = By.xpath(articulo);
        Thread.sleep(1000);
        producto.sendKeys(Keys.BACK_SPACE);
        Thread.sleep(500);
        producto.sendKeys(Keys.ARROW_DOWN);
        producto.sendKeys(Keys.ENTER);
        Thread.sleep(500);
        Thread.sleep(500);
        cantidad.sendKeys(Keys.BACK_SPACE,qty);
        Thread.sleep(500);
        agregar.click();
    }
}