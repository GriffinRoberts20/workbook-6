package com.pluralsight.finance;

public class Jewelry extends FixedAsset{
    private double karat;

    public Jewelry(String name, double karat) {
        super(name);
        this.karat = karat;
        this.setMarketValue(this.getValue());
    }

    public double getKarat() {
        return karat;
    }

    public void setKarat(double karat) {
        this.karat = karat;
    }

    @Override
    public double getValue() {
        return karat*10;
    }
}
