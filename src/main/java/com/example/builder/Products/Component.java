package com.example.builder.Products;

public class Component {
    private String type;
    private String color;



    public Component(String type, String color) {
        this.type = type;
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Material{" +
                "type='" + type + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
