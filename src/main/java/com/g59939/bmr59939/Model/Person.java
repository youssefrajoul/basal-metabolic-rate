package com.g59939.bmr59939.Model;

import com.g59939.bmr59939.Observable.Observable;
import com.g59939.bmr59939.Observable.Observer;

import java.util.ArrayList;

public class Person implements Observable {
    private double taille;
    private double poids;
    private double age;
    private String sexe;
    private double style;
    private double bmr;
    private double calories;
    private ArrayList<Observer> obsList;

    public Person() {
    }


    public void setBmr(double bmr) {
        this.bmr = bmr;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    public double getBmr() {
        return bmr;
    }

    public double getCalories() {
        return calories;
    }

    public void calculBmr() {
        double bmrResult;
        if (this.sexe.equals("Homme")) {
            bmrResult = (5 * this.taille) + (13.7 * this.poids) - (6.8 * this.age) + 66;
        } else {
            bmrResult = (1.8 * this.taille) + (9.6 * this.poids) - (4.7 * this.age) + 655;
        }
        setBmr(bmrResult);
    }

    public void calculCalories() {
        setCalories(this.bmr * this.style);
    }

    public void setPersonData(double taille, double poids, double age, String sexe, double style) {
        this.taille = taille;
        this.poids = poids;
        this.age = age;
        this.sexe = sexe;
        this.style = style;
        calculBmr();
        calculCalories();
        notifyUpdate();
    }

    @Override
    public void notifyUpdate() {
        try {
            //obsList.forEach(element -> element.update());
            //obsList.get(0).update();
        } catch (Exception e){

        }
    }

    @Override
    public void addObs(Observer observer) {
        try {
            this.obsList.add(observer);
        } catch (Exception e){

        }

    }

    @Override
    public void removeObs(int postion) {
        this.obsList.remove(postion);
    }
}
