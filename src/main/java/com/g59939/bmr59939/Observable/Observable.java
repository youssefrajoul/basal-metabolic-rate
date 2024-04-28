package com.g59939.bmr59939.Observable;

public interface Observable {
    public void setPersonData(double taille, double poids, double age, String sexe, double style);
    public void notifyUpdate();
    public void addObs(Observer observer);
    public void removeObs(int position);
}
