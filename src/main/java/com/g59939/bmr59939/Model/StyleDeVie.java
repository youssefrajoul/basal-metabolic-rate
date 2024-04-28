package com.g59939.bmr59939.Model;

public enum StyleDeVie {
    SEDENTAIRE(1.2),
    PEU_ACTIF(1.375),
    ACTIF(1.55),
    FORT_ACTIF(1.725),
    EXTREME_ACTIF(1.9);

    private double factor;

    StyleDeVie(double value) {
        this.factor = value;
    }

    public double getFactor() {
        return factor;
    }
}
