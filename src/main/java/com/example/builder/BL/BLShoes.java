package com.example.builder.BL;


import com.example.builder.DAO.DAOShoe;
import com.example.builder.Directores.DirectorShoe;
import com.example.builder.Products.Shoe;

import java.util.HashMap;

public class BLShoes
{
    private DirectorShoe directorShoe = new DirectorShoe();
    private static BLShoes blInstance;

    private DAOShoe daoShoe;

    public BLShoes getBlInstance(){
        if(blInstance == null){
            blInstance = new BLShoes();
        }

        return blInstance;
    }


    private String generateShoeName(){
        StringBuilder name = new StringBuilder();
        HashMap<Integer, Character> vocales = new HashMap<>();
        vocales.put(1,'a');
        vocales.put(2,'e');
        vocales.put(3,'i');
        vocales.put(4,'o');
        vocales.put(5,'u');


        HashMap<Integer, Character> abc = new HashMap<>();
        abc.put(1,'b');
        abc.put(2,'c');
        abc.put(3,'d');
        abc.put(4,'f');
        abc.put(5,'g');
        abc.put(6,'h');
        abc.put(7,'j');
        abc.put(8,'k');
        abc.put(9,'l');
        abc.put(10,'m');
        abc.put(11,'n');
        abc.put(12,'p');
        abc.put(13,'q');
        abc.put(14,'r');
        abc.put(15,'s');
        abc.put(16,'t');
        abc.put(17,'v');


        int amountOfLetters = 4;

        for(int i = 1; i <= amountOfLetters; i++){
            int letter = (int) (Math.random() * 10) - 1;

            if(!(i%2 == 0)){
                name.append(abc.get(letter));
            }else {
                name.append(vocales.get(letter));
            }
        }

        return name.toString();
    }

    public Shoe createTennis(){
        Shoe tennis = this.directorShoe.createTennis();
        this.daoShoe.getDataBase().add(tennis);
        return tennis;
    }

    public Shoe createHighHeels(){
        Shoe highHeels = this.directorShoe.createHighHeels();
        this.daoShoe.getDataBase().add(highHeels);
        return highHeels;
    }

    public Shoe createMocassin(){
        Shoe mocassin = this.directorShoe.createMocassin();
        this.daoShoe.getDataBase().add(mocassin);
        return mocassin;
    }

    public void createAccessory(String type, String color){
        this.directorShoe.createAccessory(type, color);
    }

    public void createClosing(String type, String color){
        this.directorShoe.createClosing(type, color);
    }

    public void createInsole(String type, String color){
        this.directorShoe.createInsole(type, color);
    }

    public void createMaterial(String type, String color){
        this.directorShoe.createMaterial(type, color);
    }

    public void createSole(String type, String color){
        this.directorShoe.createSole(type, color);
    }

    public void createUnions(String type, String color){
        this.directorShoe.createUnions(type, color);
    }

    public void createShoeTongue(boolean sTongue){
        this.directorShoe.createShoeTongue(sTongue);
    }


}
