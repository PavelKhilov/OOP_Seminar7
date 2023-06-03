package ru.geekbrains.adapter;

public interface MeteoSensor {

    int getId(); // индентификатор датчика

    double getTemperature(); // Температура

    double getHumidity(); // Влажность

    double getPressure(); // Давление

}
