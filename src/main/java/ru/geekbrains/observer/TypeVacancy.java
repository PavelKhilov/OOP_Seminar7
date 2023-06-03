package ru.geekbrains.observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class TypeVacancy {

    private List<String> listVacancy = new ArrayList<>();

    public void registerVacancy(String vacancy) {
        listVacancy.add(vacancy);
    }

    public void removeVacancy(String vacancy) {
        listVacancy.remove(vacancy);
    }

    public int getSize(){
        return listVacancy.size();
    }

    public String getElement(int index){
        return listVacancy.get(index);
    }

}
