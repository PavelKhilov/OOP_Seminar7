package ru.geekbrains.observer;

public class Program {

    /**
     * TODO: 1.Доработать приложение, поработать с шаблоном проектирования Observer
     *  добавить новый тип соискателя.
     *  **.2 Добавить новую сущность "Вакансия", компания должна рассылать вакансии.
     *  **.3 Предусмотреть тип вакансии (enum)
     * @param args
     */
    public static void main(String[] args) {

        JobAgency jobAgency = new JobAgency();

        Company geekBrains = new Company("GeekBrains", 70000, jobAgency);
        Company google = new Company("Google", 100000, jobAgency);
        Company yandex = new Company("Yandex", 120000, jobAgency);

        Master ivanov = new Master("Ivanov");
        Master petrov = new Master("Petrov");
        Student sidorov = new Student("Sidorov");
        Student lebedev = new Student("Lebedev");
        Junior sokolov = new Junior("Sokolov");
        Junior novikov = new Junior("Novikov");

        jobAgency.registerObserver(ivanov);
        jobAgency.registerObserver(petrov);
        jobAgency.registerObserver(sidorov);
        jobAgency.registerObserver(lebedev);
        jobAgency.registerObserver(sokolov);
        jobAgency.registerObserver(novikov);

        for(int i = 0; i < 10; i++){
            geekBrains.needEmployee();
            google.needEmployee();
            yandex.needEmployee();
        }

    }
}
