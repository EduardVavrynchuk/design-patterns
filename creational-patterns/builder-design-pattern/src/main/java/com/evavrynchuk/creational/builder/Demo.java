package com.evavrynchuk.creational.builder;

import com.evavrynchuk.creational.builder.builders.CarBuilderImpl;
import com.evavrynchuk.creational.builder.builders.CarManualBuilderImpl;
import com.evavrynchuk.creational.builder.cars.Car;
import com.evavrynchuk.creational.builder.cars.Manual;
import com.evavrynchuk.creational.builder.director.Director;

public class Demo {

    public static void main(String[] args) {
        Director director = new Director();

        CarBuilderImpl builder = new CarBuilderImpl();
        director.constructSportsCar(builder);

        Car car = builder.getResult();
        System.out.println("Car built:\n" + car.getCarType());

        CarManualBuilderImpl manualBuilder = new CarManualBuilderImpl();

        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());
    }
}
