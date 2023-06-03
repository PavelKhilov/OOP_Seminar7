package ru.geekbrains.adapter;

public class AdapterST500info implements MeteoSensorSimple {

    private final SensorTemperature sensorTemperature;
    public AdapterST500info(SensorTemperature sensorTemperature){
        this.sensorTemperature = sensorTemperature;
    }
    @Override
    public int getId() {
        return sensorTemperature.identifier();
    }

    @Override
    public double getTemperature() {
        return sensorTemperature.temperature();
    }

    /*@Override
    public double getHumidity() {
        throw new RuntimeException("Method getHumidity not implemented.");
    }

    @Override
    public double getPressure() {
        throw new RuntimeException("Method getPressure not implemented.");
    }*/
}
