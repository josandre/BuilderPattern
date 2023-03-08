package com.example.builder.Constructores;


import com.example.builder.Products.Component;
import com.example.builder.Products.Shoe;

public abstract class Builder {
    protected Shoe shoe;


    public Shoe createShoe(){
        this.shoe = new Shoe();
        return this.shoe;
    }
    public Shoe getShoe(){return this.shoe;}

    public abstract Component buildAccessory(String type, String color);
    public abstract Component buildClosing(String type, String color);
    public abstract Component buildInsole(String type, String color);
    public abstract Component buildMaterial(String type, String color);
    public abstract Component buildSole(String type, String color);
    public abstract Component buildUnions(String type, String color);

    public abstract boolean buildShoeTongue(boolean shoeTongue);


}
