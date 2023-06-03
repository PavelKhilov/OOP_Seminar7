package ru.geekbrains.observer;

import java.util.Random;

public class Vacancy {

    private Random random = new Random();

    private Company company;

    public void needVacancy(Company company){
        double salary = random.nextDouble(3000, company.getMaxSalary());
        company.getJobAgency().sendOffer(company.getNameCompany(), salary);
    }
}
