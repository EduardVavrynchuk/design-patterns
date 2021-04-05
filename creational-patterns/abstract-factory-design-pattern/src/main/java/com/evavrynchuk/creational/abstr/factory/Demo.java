package com.evavrynchuk.creational.abstr.factory;

import com.evavrynchuk.creational.abstr.factory.factories.GUIFactory;
import com.evavrynchuk.creational.abstr.factory.factories.MacOSGUIFactoryImpl;
import com.evavrynchuk.creational.abstr.factory.factories.WindowsGUIFactoryImpl;

public class Demo {

    private static Application configureApplication() {
        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();

        if (osName.contains("mac")) {
            factory = new MacOSGUIFactoryImpl();
        } else {
            factory = new WindowsGUIFactoryImpl();
        }
        app = new Application(factory);
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}
