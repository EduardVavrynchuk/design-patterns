package com.evavrynchuk.creational.abstr.factory;

import com.evavrynchuk.creational.abstr.factory.buttons.Button;
import com.evavrynchuk.creational.abstr.factory.checkboxes.Checkbox;
import com.evavrynchuk.creational.abstr.factory.factories.GUIFactory;

public class Application {

    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
