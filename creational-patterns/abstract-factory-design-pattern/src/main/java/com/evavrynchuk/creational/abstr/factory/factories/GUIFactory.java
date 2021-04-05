package com.evavrynchuk.creational.abstr.factory.factories;

import com.evavrynchuk.creational.abstr.factory.buttons.Button;
import com.evavrynchuk.creational.abstr.factory.checkboxes.Checkbox;

public interface GUIFactory {

    Button createButton();
    Checkbox createCheckbox();
}
