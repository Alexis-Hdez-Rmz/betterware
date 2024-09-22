package com.betterware.utils;

import java.text.NumberFormat;

public class Moneda {
    public static String cambio(String precio){
        double money = Double.parseDouble(precio);
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        String moneyString = formatter.format(money);
        return moneyString;
    }
}
