package com.evavrynchuk.creational.abstr.factory.factories;

import com.evavrynchuk.creational.abstr.factory.buttons.Button;
import com.evavrynchuk.creational.abstr.factory.buttons.MacOSButtonImpl;
import com.evavrynchuk.creational.abstr.factory.checkboxes.Checkbox;
import com.evavrynchuk.creational.abstr.factory.checkboxes.MacOSCheckboxImpl;

public class MacOSGUIFactoryImpl implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacOSButtonImpl();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckboxImpl();
    }
}
