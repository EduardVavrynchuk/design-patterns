package com.evavrynchuk.creational.builder.builders;

import com.evavrynchuk.creational.builder.cars.CarType;
import com.evavrynchuk.creational.builder.components.Engine;
import com.evavrynchuk.creational.builder.components.GPSNavigator;
import com.evavrynchuk.creational.builder.components.Transmission;
import com.evavrynchuk.creational.builder.components.TripComputer;

public interface Builder {

    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);

}
