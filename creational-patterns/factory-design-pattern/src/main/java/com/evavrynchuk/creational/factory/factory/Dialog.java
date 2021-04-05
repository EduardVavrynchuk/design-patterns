package com.evavrynchuk.creational.factory.factory;

import com.evavrynchuk.creational.factory.buttons.Button;

public abstract class Dialog {

    public void renderWindow() {

        Button okButton = createButton();
        okButton.render();
    }

    public abstract Button createButton();
}
