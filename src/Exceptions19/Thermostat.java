package Exceptions19;

import Exceptions19.CustomExceptions.OutOfRangeExceptions;

public class Thermostat {
    public void setTemperature(double temperature) throws OutOfRangeExceptions , RuntimeException {
        // handling multiple exceptions
        System.out.println("Setting temperature to " + temperature);
        if (temperature < 0 || temperature > 35) {
            throw new OutOfRangeExceptions("Temperature out of range");
        } else {
            throw new RuntimeException("rtrtrt");
        }
    }
}
