package com.pluralsight.finance;

public class Gold extends FixedAsset{
    private double weight;

    public Gold(double weight) {
        super();
        this.weight = weight;
        this.setMarketValue(this.getValue());
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public double getValue() {
        return weight*20;
    }
}
