package com.example.builder.View;

import com.example.builder.BL.BLShoes;
import com.example.builder.Main;
import com.example.builder.Products.Shoe;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

import java.io.IOException;

public class ChangeComponents {
    @FXML
    public ComboBox<String> boxMaterial;

    @FXML
    public ComboBox<String> boxSole;

    @FXML
    public ComboBox<String> boxClosing;

    @FXML
    public ComboBox<String> boxInSole;

    @FXML
    public ComboBox<String> boxAccessory;

    @FXML
    public ComboBox<String> boxShoeTongue;

    @FXML
    public ComboBox<String> boxUnions;

    @FXML
    public Label sole;

    @FXML
    public Label insole;

    @FXML
    public Label unions;

    @FXML
    public Label shoeTongue;

    private BLShoes bl = BLShoes.getBlInstance();

    private Shoe shoe = bl.getCurrentShoe();


    public void initialize(){

        boxMaterial.setValue(shoe.getMaterial().getType());
        boxAccessory.setValue(shoe.getAccesory().getType());
        boxSole.setValue(shoe.getSole() == null ? "" : shoe.getSole().getType() );
        boxInSole.setValue(shoe.getInsole() == null ? "" : shoe.getInsole().getType());
        boxUnions.setValue(shoe.getUnions() == null ?  "" : shoe.getUnions().getType());
        boxShoeTongue.setValue(shoe.isShoeTongue() ? "Yes" : "No");
        boxClosing.setValue(shoe.getClosing().getType());

        if(this.shoe.getStyle().toString().equals("Mocassin")){
            sole.setVisible(false);
            boxSole.setVisible(false);
            insole.setVisible(false);
            boxInSole.setVisible(false);
            unions.setVisible(false);
            boxUnions.setVisible(false);
            shoeTongue.setVisible(false);
            boxShoeTongue.setVisible(false);
        }
    }

    public void handleSave() throws IOException {
        bl.createAccessory(boxAccessory.getValue(), "black");
        bl.createMaterial(boxMaterial.getValue(), "black");
        bl.createSole(boxSole.getValue(), "Black");
        bl.createInsole(boxInSole.getValue(), "Black");
        bl.createUnions(boxUnions.getValue(), "Black");
        bl.createShoeTongue(boxShoeTongue.getValue().equals("Yes"));
        bl.createClosing(boxClosing.getValue(), "black");
        Main.changeScene("ListShoe");
    }



}
