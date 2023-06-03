package ru.geekbrains.adapter;

public class Program {

    public static void main(String[] args) {

        ST500info st500info_1 = new ST500info(44331);
        MS200 ms200_1 = new MS200(11554);

        MeteoStore meteoStore = new MeteoStore();

        meteoStore.save(ms200_1);
        meteoStore.save(new AdapterST500info(st500info_1));
    }
}
