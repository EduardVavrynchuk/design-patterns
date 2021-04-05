package com.evavrynchuk.creational.factory.factory;

import com.evavrynchuk.creational.factory.buttons.Button;
import com.evavrynchuk.creational.factory.buttons.WindowButtonImpl;

public class WindowDialogImpl extends Dialog {

    @Override
    public Button createButton() {
        return new WindowButtonImpl();
    }
}
