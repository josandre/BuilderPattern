package com.example.builder.View;

import com.example.builder.BL.BLShoes;
import com.example.builder.Main;
import com.example.builder.Products.Shoe;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.io.IOException;

public class LIstShoe {

    ObservableList<Shoe> shoeList = FXCollections.observableArrayList();

    @FXML
    public TableView<Shoe> tblShoe;

    @FXML
    public TableColumn<Shoe, String> colName;

    @FXML
    public TableColumn<Shoe, String> colStyle;

    @FXML
    public TableColumn<Shoe, String> colMaterial;

    @FXML
    public TableColumn<Shoe, String> colSole;

    @FXML
    public TableColumn<Shoe, String> colClosing;

    @FXML
    public TableColumn<Shoe, String> colInsole;

    @FXML
    public TableColumn<Shoe, String> colUnions;

    @FXML
    public TableColumn<Shoe, String> colShoeTongue;

    @FXML
    public TableColumn<Shoe, String> colAccessory;

    private BLShoes blInstance = BLShoes.getBlInstance();

    private Shoe selectedShoe;



    public void initialize(){

        tblShoe.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

        colName.setCellValueFactory(shoe -> new SimpleStringProperty(shoe.getValue().getName()));
        colStyle.setCellValueFactory(shoe -> new SimpleStringProperty(shoe.getValue().getStyle().toString()));
        colMaterial.setCellValueFactory(shoe -> new SimpleStringProperty(shoe.getValue().getMaterial().getType()));
        colSole.setCellValueFactory(shoe -> new SimpleStringProperty(shoe.getValue().getSole() == null ? "" : shoe.getValue().getSole().getType()));
        colClosing.setCellValueFactory(shoe -> new SimpleStringProperty(shoe.getValue().getClosing().getType()));
        colInsole.setCellValueFactory(shoe -> new SimpleStringProperty(shoe.getValue().getInsole() == null ? "" : shoe.getValue().getInsole().getType()));
        colUnions.setCellValueFactory(shoe -> new SimpleStringProperty(shoe.getValue().getUnions() == null ? "" : shoe.getValue().getUnions().getType()));
        colShoeTongue.setCellValueFactory(shoe -> new SimpleStringProperty(shoe.getValue().isShoeTongue() ? "Yes" : "No"));
        colAccessory.setCellValueFactory(shoe -> new SimpleStringProperty(shoe.getValue().getAccesory().getType()));
        System.out.println("initializing");

        tblShoe.getSelectionModel().selectedItemProperty().addListener(
                (observable, oldValue, shoe) -> {
                    try {
                       getShoeData(shoe);
                    } catch (IOException e) {
                        throw new RuntimeException(e);

                    }
                });

        loadData();
    }

    public void loadData(){
        shoeList.removeAll();
        shoeList.addAll(blInstance.getCurrentShoe());
        tblShoe.setItems(shoeList);
    }


    private void getShoeData(Shoe shoe) throws IOException {
        Shoe shoeFound  = blInstance.getShoeById(shoe.getId());
        this.selectedShoe = shoeFound;
        Main.changeScene("ChangeComponents");
    }


    public void handleback() throws IOException {
        Main.changeScene("MainScene");
    }
}
