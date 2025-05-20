package com.pluralsight;

public abstract class FixedAsset implements IValuable{

    public String name;
    public double marketValue;

    public FixedAsset(double marketValue, String name) {
        this.marketValue = marketValue;
        this.name = name;
    }

    @Override
    public double getValue() {
        return 0;
    }
}
