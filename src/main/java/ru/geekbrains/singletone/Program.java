package ru.geekbrains.singletone;

public class Program {
    public static void main(String[] args) {

        Settings settings1 = Settings.getInstance();

        Settings settings2 = Settings.getInstance();
    }
}
