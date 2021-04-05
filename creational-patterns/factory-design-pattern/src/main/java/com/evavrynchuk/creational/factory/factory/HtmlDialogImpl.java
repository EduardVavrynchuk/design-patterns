package com.evavrynchuk.creational.factory.factory;

import com.evavrynchuk.creational.factory.buttons.Button;
import com.evavrynchuk.creational.factory.buttons.HtmlButtonImpl;

public class HtmlDialogImpl extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButtonImpl();
    }
}
