package com.example.builder.Directores;


import com.example.builder.Constructores.Builder;
import com.example.builder.Constructores.BuilderShoe;
import com.example.builder.Enums.Styles;
import com.example.builder.Products.Shoe;

public class DirectorShoe {
    private Builder builderShoe;



    public DirectorShoe(){
        builderShoe = new BuilderShoe();
    }

    public Shoe createTennis(){
        Shoe shoe = this.builderShoe.createShoe();
        shoe.setStyle(Styles.Tennis);
        this.builderShoe.buildAccessory("Sewing", "Rojo");
        this.builderShoe.buildClosing("Cord", "Negro");
        this.builderShoe.buildInsole("Foam", "Blanca");
        this.builderShoe.buildMaterial("PLastic", "Claro");
        this.builderShoe.buildSole("Glue", "Roja");
        this.builderShoe.buildUnions("Glue", "Blanco");
        this.builderShoe.buildShoeTongue(true);
        return shoe;
    }

    public Shoe createHighHeels(){
        Shoe shoe = this.builderShoe.createShoe();
        shoe.setStyle(Styles.HighHeels);
        this.builderShoe.buildAccessory("Glitter", "Blanco");
        this.builderShoe.buildClosing(" ", " ");
        this.builderShoe.buildInsole("Basic", "Blanca");
        this.builderShoe.buildMaterial("Cuerina", "Negro");
        this.builderShoe.buildSole("Leather", "Negro");
        this.builderShoe.buildUnions("Sewing", "Blanco");
        this.builderShoe.buildShoeTongue(false);

        return shoe;
    }

    public Shoe createMocassin(){
        Shoe shoe = this.builderShoe.createShoe();
        shoe.setStyle(Styles.Moccasin);
        this.builderShoe.buildAccessory("Any", " ");
        this.builderShoe.buildClosing("Zipper", "Negro");
        this.builderShoe.buildMaterial("Leather", "Negro");
        return shoe;
    }

    public void createAccessory(String type, String color){
        this.builderShoe.buildAccessory(type, color);
    }

    public void createClosing(String type, String color){
        this.builderShoe.buildClosing(type, color);
    }

    public void createInsole(String type, String color){
       this.builderShoe.buildInsole(type, color);
    }

    public void createMaterial(String type, String color){
        this.builderShoe.buildMaterial(type, color);
    }

    public void createSole(String type, String color){
        this.builderShoe.buildSole(type, color);
    }

    public void createUnions(String type, String color){
        this.builderShoe.buildUnions(type, color);
    }

    public void createShoeTongue(boolean sTongue){
        this.builderShoe.buildShoeTongue(sTongue);
    }



}
