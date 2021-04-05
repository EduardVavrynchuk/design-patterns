package com.evavrynchuk.structural.composite;

import com.evavrynchuk.structural.composite.editor.ImageEditor;
import com.evavrynchuk.structural.composite.shapes.Circle;
import com.evavrynchuk.structural.composite.shapes.CompoundShapeImpl;
import com.evavrynchuk.structural.composite.shapes.Dot;
import com.evavrynchuk.structural.composite.shapes.Rectangle;

import java.awt.*;

public class Demo {

    public static void main(String[] args) {
        ImageEditor editor = new ImageEditor();

        editor.loadShapes(
                new Circle(10, 10, 10, Color.BLUE),

                new CompoundShapeImpl(
                        new Circle(110, 110, 50, Color.RED),
                        new Dot(160, 160, Color.RED)
                ),

                new CompoundShapeImpl(
                        new Rectangle(250, 250, 100, 100, Color.GREEN),
                        new Dot(240, 240, Color.GREEN),
                        new Dot(240, 360, Color.GREEN),
                        new Dot(360, 360, Color.GREEN),
                        new Dot(360, 240, Color.GREEN)
                )
        );
    }
}
