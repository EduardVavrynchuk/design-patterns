package com.evavrynchuk.creational.builder.builders;

import com.evavrynchuk.creational.builder.cars.Car;
import com.evavrynchuk.creational.builder.cars.CarType;
import com.evavrynchuk.creational.builder.components.Engine;
import com.evavrynchuk.creational.builder.components.GPSNavigator;
import com.evavrynchuk.creational.builder.components.Transmission;
import com.evavrynchuk.creational.builder.components.TripComputer;

public class CarBuilderImpl implements Builder {

    private CarType type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    public void setCarType(CarType type) {
        this.type = type;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    @Override
    public void setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }

    public Car getResult() {
        return new Car(type, seats, engine, transmission, tripComputer, gpsNavigator);
    }
}
