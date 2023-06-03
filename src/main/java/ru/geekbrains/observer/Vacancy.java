package ru.geekbrains.observer;

import java.util.List;
import java.util.Random;

public class Vacancy {

    private Random random = new Random();

    private String nameCompany;
    private double salary;

    private String typeVacancy;

    public Vacancy(Company company) {
        this.nameCompany = company.getNameCompany();
        this.salary = random.nextDouble(3000, company.getMaxSalary());
        this.typeVacancy = typeVacancy;
    }

    public String randomVacancy(TypeVacancy listVacancy){
        return typeVacancy = listVacancy.getElement(random.nextInt(0, listVacancy.getSize()));
    }
    public void needVacancy(Company company, TypeVacancy listVacancy){
        String nameCompany = company.getNameCompany();
        double salary = random.nextDouble(3000, company.getMaxSalary());
        String vacancy = randomVacancy(listVacancy);
        company.getJobAgency().sendOffer(nameCompany, salary, vacancy);
    }
}
