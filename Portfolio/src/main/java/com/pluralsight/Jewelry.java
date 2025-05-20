package com.pluralsight;

public class Jewelry extends FixedAsset {

    private double karat;

    public Jewelry(double karat,double marketValue, String name) {
        super(marketValue, name);
    }

    @Override
    public double getValue() {
        return super.getValue();
    }
}
