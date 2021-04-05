package com.evavrynchuk.creational.factory;

import com.evavrynchuk.creational.factory.factory.Dialog;
import com.evavrynchuk.creational.factory.factory.HtmlDialogImpl;
import com.evavrynchuk.creational.factory.factory.WindowDialogImpl;

public class FactoryMain {

    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    static void configure() {
        if (System.getProperty("os.name").equals("Mac OS X")) {
            dialog = new WindowDialogImpl();
        } else {
            dialog = new HtmlDialogImpl();
        }
    }

    static void runBusinessLogic() {
        dialog.renderWindow();
    }
}
