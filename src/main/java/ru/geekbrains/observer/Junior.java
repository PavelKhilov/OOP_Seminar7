package ru.geekbrains.observer;

public class Junior implements Observer{

    private String name;
    private double salary;

    public Junior(String name) {
        this.name = name;
        salary = 30000;
    }

    @Override
    public void receiveOffer(String nameCompany, double salary, String typeVacancy) {
        if(this.salary < salary){
            System.out.printf("Молодой специалист %s >>> Мне нужна эта работа! [%s - %f - %s]\n",
                    name, nameCompany, salary, typeVacancy);
            this.salary = salary;
        } else {
            System.out.printf("Молодой специалист %s >>> Я найду работу получше! [%s - %f - %s]\n",
                    name, nameCompany, salary, typeVacancy);
        }
    }
}
