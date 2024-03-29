package ru.geekbrains.observer;

public class Master implements Observer{

    private String name;
    private double salary;

    public Master(String name) {
        this.name = name;
        salary = 80000;
    }

    @Override
    public void receiveOffer(String nameCompany, double salary, String typeVacancy) {
        if(this.salary < salary){
            System.out.printf("Специалист %s >>> Мне нужна эта работа! [%s - %f - %s]\n",
                    name, nameCompany, salary, typeVacancy);
            this.salary = salary;
        } else {
            System.out.printf("Специалист %s >>> Я найду работу получше! [%s - %f - %s]\n",
                    name, nameCompany, salary, typeVacancy);
        }
    }
}
