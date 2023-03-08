package com.example.builder.Constructores;


import com.example.builder.Products.*;

public class BuilderShoe extends Builder{


    @Override
    public Component buildAccessory(String type, String color) {
        Accesory accessory = new Accesory(type, color);
        this.shoe.addComponent(accessory);
        return accessory;
    }

    @Override
    public Component buildClosing(String type, String color) {
        Closing closing = new Closing(type, color);
        this.shoe.addComponent(closing);
        return closing;
    }

    @Override
    public Component buildInsole(String type, String color) {
        Insole inSole = new Insole(type, color);
        this.shoe.addComponent(inSole);
        return inSole;
    }

    @Override
    public Component buildMaterial(String type, String color) {
        Material material = new Material(type, color);
        this.shoe.addComponent(material);
        return material;
    }

    @Override
    public Component buildSole(String type, String color) {
        Sole sole = new Sole(type, color);
        this.shoe.addComponent(sole);
        return sole;
    }

    @Override
    public Component buildUnions(String type, String color) {
        Unions unions = new Unions(type, color);
        this.shoe.addComponent(unions);
        return unions;
    }

    @Override
    public boolean buildShoeTongue(boolean shoeTongue) {
        boolean tongue = shoeTongue;
        this.shoe.setShoeTongue(shoeTongue);
        return tongue;
    }
}
