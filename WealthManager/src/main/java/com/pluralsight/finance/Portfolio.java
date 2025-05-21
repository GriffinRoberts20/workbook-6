package com.pluralsight.finance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Portfolio{
    private String name;
    private String owner;
    private List<Valuable> assets;

    public Portfolio(String name, String owner) {
        this.name = name;
        this.owner = owner;
        this.assets=new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void add(Valuable asset){
        this.assets.add(asset);
    }

    public double getValue(){
        double value=0;
        for(Valuable asset:this.assets) value+=asset.getValue();
        return value;
    }


    public Valuable getMostValuable(){
//        Valuable most=this.assets.get(0);
//        for(Valuable asset:this.assets){
//            if(most.getValue()<asset.getValue()) most=asset;
//        }
//        return most;

        List<Valuable> temp=this.assets;
        return Collections.max(temp, Comparator.comparingDouble(Valuable::getValue));
    }

    public Valuable getLeastValuable(){
//        Valuable least=this.assets.get(0);
//        for(Valuable asset:this.assets){
//            if(least.getValue()>asset.getValue()) least=asset;
//        }
//        return least;

        List<Valuable> temp=this.assets;
        return Collections.min(temp, Comparator.comparingDouble(Valuable::getValue));
    }
}
