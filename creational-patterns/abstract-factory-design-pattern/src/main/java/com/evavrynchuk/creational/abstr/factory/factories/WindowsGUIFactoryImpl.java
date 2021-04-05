package com.evavrynchuk.creational.abstr.factory.factories;

import com.evavrynchuk.creational.abstr.factory.buttons.Button;
import com.evavrynchuk.creational.abstr.factory.buttons.WindowsButtonImpl;
import com.evavrynchuk.creational.abstr.factory.checkboxes.Checkbox;
import com.evavrynchuk.creational.abstr.factory.checkboxes.WindowsCheckboxImpl;

public class WindowsGUIFactoryImpl implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButtonImpl();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckboxImpl();
    }
}
