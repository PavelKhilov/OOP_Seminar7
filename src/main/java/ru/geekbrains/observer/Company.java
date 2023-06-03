package ru.geekbrains.observer;

import java.util.Random;

/**
 * Компания
 */

public class Company {

    private Random random;
    private String nameCompany;
    private double maxSalary;

    private Publisher jobAgency;

    public Company(String nameCompany, double maxSalary, Publisher jobAgency) {
        this.nameCompany = nameCompany;
        this.maxSalary = maxSalary;
        this.jobAgency = jobAgency;
        random = new Random();
    }

    public String getNameCompany() {
        return nameCompany;
    }

    public double getMaxSalary() {
        return maxSalary;
    }

    public Publisher getJobAgency() {
        return jobAgency;
    }

    public void needEmployee(Company company){
        Vacancy vacancy = new Vacancy();
        vacancy.needVacancy(company);
//        double salary = random.nextDouble(3000, maxSalary);
//        jobAgency.sendOffer(nameCompany, salary);
    }
}
