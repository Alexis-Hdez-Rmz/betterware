package com.betterware.utils;



import java.util.*;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;

public class AddProduct {
    public static int quantity(int rowNumber, int columnNumber) throws IOException, SQLException {
        Map<String, String> credentials = ExcelReader.getData("Query", rowNumber, columnNumber);
        String query = credentials.get("Articulo");
        ResultSet rs = DatabaseUtils.executeQuery(query);
        int qty = 0;
        while(rs.next()) {
            qty = Integer.parseInt(rs.getString(1));
        }
        int row = (int)(Math.floor(Math.random()*(qty-1+1)+1));
        return row;
    }

    public static List<Integer> lista(){

        return null;
    }

    public static String addHiper() throws IOException, SQLException {
        int row = quantity(3,0);

        Map<String, String> credentials = ExcelReader.getData("Query", 1, 0);
        String query = credentials.get("Articulo");
        ResultSet rs = DatabaseUtils.executeQuery(query);
        try { int ban =1;
            while(rs.next()) {
                if (row == ban) {
                    Constants.HIPER_Articulo = rs.getString(1);
                    Constants.HIPER_Name = rs.getString(2);
                    Constants.HIPER_Price = rs.getString(3);
                    Constants.HIPER_Discount = rs.getString(4);
                    // System.out.println(FrameworkConstants.HIPER_Articulo + "  " + FrameworkConstants.HIPER_Name);
                    ban ++;
                }
                else {
                    ban++;}
            }
        } catch(Exception e){System.out.println("Row not found.");}
        // System.out.println(FrameworkConstants.HIPER_Articulo);
        return Constants.HIPER_Articulo;
    }

    public static String addMega() throws IOException, SQLException {
        int row = quantity(3,1);
        Map<String, String> credentials = ExcelReader.getData( "Query", 1,1);
        String query = credentials.get("Articulo");
        ResultSet rs = DatabaseUtils.executeQuery(query);
        try { int ban =1;
            while(rs.next()) {
                if (row == ban) {
                    Constants.MEGA_Articulo = rs.getString(1);
                    Constants.MEGA_Name = rs.getString(2);
                    Constants.MEGA_Price = rs.getString(3);
                    Constants.MEGA_Discount = rs.getString(4);
                   // System.out.println(Constants.MEGA_Price + "  " + Constants.MEGA_Discount);
                    ban ++;
                }
                else {
                    ban++;}
            }
        } catch(Exception e){System.out.println("Row not found.");}
        // System.out.println(FrameworkConstants.HIPER_Articulo);
        return Constants.MEGA_Articulo;
    }

    public static String addCasita() throws IOException, SQLException {
        int row = quantity(3,2);
        Map<String, String> credentials = ExcelReader.getData("Query", 1, 2);
        String query = credentials.get("Articulo");
        ResultSet rs = DatabaseUtils.executeQuery(query);
        try {
            int ban = 1;
            while (rs.next()) {
                if (row == ban) {
                    Constants.CASITA_Articulo = rs.getString(1);
                    Constants.CASITA_Name = rs.getString(2);
                    Constants.CASITA_Price = rs.getString(3);
                    Constants.CASITA_Discount = rs.getString(4);
                    //    System.out.println(FrameworkConstants.HIPER_Articulo + "  " + FrameworkConstants.HIPER_Name);
                    ban++;
                } else {
                    ban++;
                }
            }
        } catch (Exception e) {
            System.out.println("Row not found.");
        }
        // System.out.println(FrameworkConstants.HIPER_Articulo);
        return Constants.CASITA_Articulo;
    }
    public static String addNuevo() throws IOException, SQLException {

        int row = quantity(3,3);

        Map<String, String> credentials = ExcelReader.getData("Query", 1, 3);
        String query = credentials.get("Articulo");
        ResultSet rs = DatabaseUtils.executeQuery(query);
        try {
            int ban = 1;
            while (rs.next()) {
                if (row == ban) {
                    Constants.NUEVO_Articulo = rs.getString(1);
                    ban++;
                } else {
                    ban++;
                }
            }
        } catch (Exception e) {
            System.out.println("Row not found.");
        }
        // System.out.println(FrameworkConstants.HIPER_Articulo);
        return Constants.NUEVO_Articulo;
    }
    public static String addSet() throws IOException, SQLException {
        int row = quantity(3,5);

        Map<String, String> credentials = ExcelReader.getData("Query", 1, 5);
        String query = credentials.get("Articulo");
        ResultSet rs = DatabaseUtils.executeQuery(query);
        try {
          //  int ban = 1;
            while (rs.next()) {
               // if (row == ban) {
                    Constants.NUEVO_Articulo = rs.getString(1);
                  //  Constants.NUEVO_Name = rs.getString(2);
                    //Constants.NUEVO_Price = rs.getString(3);
                   // Constants.NUEVO_Discount = rs.getString(4);
                    //    System.out.println(FrameworkConstants.HIPER_Articulo + "  " + FrameworkConstants.HIPER_Name);
                  //  ban++;
              //  } else {
                 //   ban++;
               //}
            }
        } catch (Exception e) {
            System.out.println("Row not found.");
        }
        return Constants.NUEVO_Articulo;
    }
    public static String addProducto() throws IOException, SQLException {
        int row = quantity(3,4);

        Map<String, String> credentials = ExcelReader.getData("Query", 1, 4);
        String query = credentials.get("Articulo");
        ResultSet rs = DatabaseUtils.executeQuery(query);
        try {
            int ban = 1;
            while (rs.next()) {
                if (row == ban) {
                    Constants.NUEVO_Articulo = rs.getString(1);
                    ban++;
                } else {
                    ban++;
                }
            }
        } catch (Exception e) {
            System.out.println("Row not found.");
        }
        return Constants.NUEVO_Articulo;
    }

    public static String add1x2x(int lista) throws IOException, SQLException {
        int qty = quantity(3,6);
       // int row = (int)(Math.floor(Math.random()*(qty-1+1)+1));

        Map<String, String> credentials = ExcelReader.getData("Query", 1, 6);
        String query = credentials.get("Articulo");
        ResultSet rs = DatabaseUtils.executeQuery(query);
        try {
            int ban = 1;
            while (rs.next()) {
                if ( ban<6) {
                    Constants.NUEVO_Articulo = rs.getString(1);
                    Constants.NUEVO_Name = rs.getString(2);
                    Constants.NUEVO_Price = rs.getString(3);
                    Constants.NUEVO_Discount = rs.getString(4);
                    ban++;
                } else {
                    ban++;
                }
            }
        } catch (Exception e) {
            System.out.println("Row not found.");
        }
        // System.out.println(FrameworkConstants.HIPER_Articulo);
        return Constants.NUEVO_Articulo;
    }


}


