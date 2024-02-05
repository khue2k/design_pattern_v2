package org.example.abstractPattern;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Demo {
    public static void main(String[] args) {
//        GUIFactory factory;
//        String osName = System.getProperty("os.name").toLowerCase();
//
//        if (osName.contains("mac"))
//            factory = new MacOsFactory();
//        else
//            factory = new WindowFactory();
//
//        Application application = new Application(factory);
//        application.paint();
        System.out.println(Demo.formatFloatWithComma(23456.1234567f));
    }

    private static String formatFloatWithComma(float value) {
        return "" + value;
    }
}
