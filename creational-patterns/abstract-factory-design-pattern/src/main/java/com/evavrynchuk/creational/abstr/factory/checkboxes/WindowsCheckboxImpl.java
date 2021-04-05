package com.evavrynchuk.creational.abstr.factory.checkboxes;

public class WindowsCheckboxImpl implements Checkbox {

    @Override
    public void paint() {
        System.out.println("You have created WindowsCheckbox.");
    }
}
