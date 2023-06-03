package ru.geekbrains.observer;

public class Student implements Observer{
    private String name;
    private double salary;

    public Student(String name) {
        this.name = name;
        salary = 5000;
    }

    @Override
    public void receiveOffer(String nameCompany, double salary, String typeVacancy) {
        if(this.salary < salary){
            System.out.printf("Студент %s >>> Мне нужна эта работа! [%s - %f - %s]\n",
                    name, nameCompany, salary, typeVacancy);
            this.salary = salary;
        } else {
            System.out.printf("Студент %s >>> Я найду работу получше! [%s - %f - %s]\n",
                    name, nameCompany, salary, typeVacancy);
        }
    }

}
