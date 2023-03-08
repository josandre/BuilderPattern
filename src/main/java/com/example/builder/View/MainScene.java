package com.example.builder.View;

import com.example.builder.BL.BLShoes;
import com.example.builder.Main;


import java.io.IOException;

public class MainScene {
    private BLShoes bl = BLShoes.getBlInstance();

    public void handleMocassin() throws IOException {
        bl.createMocassin();
        Main.changeScene("ListShoe");
    }

    public void HandleHighHeels() throws IOException {
        bl.createHighHeels();
        Main.changeScene("ListShoe");
    }

    public void handleTennis() throws IOException {
        bl.createTennis();
        Main.changeScene("ListShoe");
    }
}
