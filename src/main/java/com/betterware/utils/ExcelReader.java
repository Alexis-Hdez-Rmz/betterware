package com.betterware.utils;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ExcelReader {

    // HashMap es la estructura que permite crear una lista clave-valor
    public static Map<String, String> getDataLogin(String sheetName, int rowNumber) throws IOException {
        // Abrir el archivo, crear un flujo de entrada que permite leer datos del archivo
        // FileInputStream es una clase que se entiende de InputStream
        String filePath ="src/test/resources/TestData.xlsx";
        FileInputStream fileInputStream = new FileInputStream(filePath);

        // Crea una instancia del libro
        Workbook workbook = WorkbookFactory.create(fileInputStream);

        // Obtener una hoja especifica del libro de trabajo
        Sheet sheet = workbook.getSheet(sheetName);

        // Obtener una fila especifica de una hoja
        Row row = sheet.getRow(rowNumber);

        // Se crea un Map para almacenar datos clave-valor
        // Cada clave es un String que representa un atributo (por ejemplo "username" o "password")
        Map<String, String> data = new HashMap<>();

        // Inserta un dato clave-valor en el mapa data
        // username o password: es la clave que identifica el valor dentro del mapa
        // row.getCell(0): obtiene la celda en la posición 0 (la primera celda) de la fila row
        // getStringCellValue(): devuelve el valor de la celda como un String
        data.put("username", row.getCell(0).getStringCellValue());
        data.put("password", row.getCell(1).getStringCellValue());

        // Cerrar recuersos que se utilizan
        workbook.close();
        fileInputStream.close();

        return data;
    }
    public static Map<String, String> getData(String sheetName, int rowNumber, int columnNumber) throws IOException {
        String filePath ="src/test/resources/TestData.xlsx";
        FileInputStream fileInputStream = new FileInputStream(filePath);
        Workbook workbook = WorkbookFactory.create(fileInputStream);
        Sheet sheet = workbook.getSheet(sheetName);
        Row row = sheet.getRow(rowNumber);
        Map<String, String> data = new HashMap<>();
        data.put("Articulo", row.getCell(columnNumber).getStringCellValue());

        workbook.close();
        fileInputStream.close();

        return data;
    }


}


