package com.pluralsight;

public class House extends FixedAsset {

    private int yearBuilt;
    private int squareFeet;
    private int bedrooms;


    public House(int yearBuilt, int squareFeet, int bedrooms,double marketValue, String name) {
        super(marketValue, name);
    }

    @Override
    public double getValue() {
        return super.getValue();
    }
}
