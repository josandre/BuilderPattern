package com.example.builder.DAO;


import com.example.builder.Products.Shoe;

import java.util.ArrayList;

public class DAOShoe {
    private ArrayList<Shoe> dataBase = new ArrayList<>();

    public Shoe getShoeByID(int id){
        for (int i = 0; i < this.dataBase.size(); i++){
            Shoe shoe = this.dataBase.get(i);
            if(shoe.getId() == id){
                return shoe;
            }
        }

        return null;
    }


    public ArrayList<Shoe> getDataBase(){
        return this.dataBase;
    }
}
