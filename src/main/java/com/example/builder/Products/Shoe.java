package com.example.builder.Products;


import com.example.builder.Enums.Styles;
import com.example.builder.Interface.IComponent;

public class Shoe implements IComponent {

    private int id;

    private String name;

    private Enum<Styles> style;

    private Material material;

    private Sole sole;

    private Closing closing;

    private Insole insole;

    private Unions unions;

    private boolean shoeTongue;

    private Accesory accesory;

    public Shoe( int id, String name, Enum<Styles> style, Material material, Sole sole, Closing closing, Insole insole, Unions unions, boolean shoeTongue, Accesory accesory) {
        this.id = id;
        this.name = name;
        this.style = style;
        this.material = material;
        this.sole = sole;
        this.closing = closing;
        this.insole = insole;
        this.unions = unions;
        this.shoeTongue = shoeTongue;
        this.accesory = accesory;
    }

    public Shoe(){}


    public String getType() {
        return name;
    }

    public void setType(String type) {
        this.name = type;
    }

    public Enum<Styles>  getStyle() {
        return style;
    }

    public void setStyle(Enum<Styles> style) {
        this.style = style;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public Sole getSole() {
        return sole;
    }

    public void setSole(Sole sole) {
        this.sole = sole;
    }

    public Closing getClosing() {
        return closing;
    }

    public void setClosing(Closing closing) {
        this.closing = closing;
    }

    public Insole getInsole() {
        return insole;
    }

    public void setInsole(Insole insole) {
        this.insole = insole;
    }

    public Unions getUnions() {
        return unions;
    }

    public void setUnions(Unions unions) {
        this.unions = unions;
    }

    public boolean isShoeTongue() {
        return shoeTongue;
    }

    public void setShoeTongue(boolean shoeTongue) {
        this.shoeTongue = shoeTongue;
    }

    public Accesory getAccesory() {
        return accesory;
    }

    public void setAccesory(Accesory accesory) {
        this.accesory = accesory;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public void addComponent(Component component) {
        if(component instanceof Material){
            addMaterial(component);
        }else if(component instanceof Sole){
            addSole(component);
        } else if (component instanceof Closing) {
            addClosing(component);
        } else if (component instanceof Insole) {
            addInSole(component);
        }else if(component instanceof Unions){
            addUnions(component);
        } else if (component instanceof Accesory) {
            addAccessory(component);
        }
    }

    @Override
    public void deleteComponent(Component component) {
        if(component instanceof Material){
            deleteMaterial();
        }else if(component instanceof Sole){
            deleteSole();
        } else if (component instanceof Closing) {
            deleteClosing();
        } else if (component instanceof Insole) {
            deleteInSole();
        }else if(component instanceof Unions){
            deleteUnions();
        } else if (component instanceof Accesory) {
            deleteAccessory();
        }
    }

    public void addMaterial(Component component){
        this.material = (Material) component;
    }

    public void addSole(Component component){
        this.sole = (Sole) component;
    }

    public void addClosing(Component component){
        this.closing = (Closing) component;
    }

    public void addInSole(Component component){
        this.insole = (Insole) component;
    }

    public void addUnions(Component component){
        this.unions = (Unions) component;
    }

    public void addAccessory(Component component){
        this.accesory = (Accesory) component;
    }


    public void deleteMaterial(){
        this.material = null;
    }

    public void deleteSole(){
        this.sole = null;
    }

    public void deleteClosing(){
        this.closing = null;
    }

    public void deleteInSole(){
        this.insole = null;
    }

    public void deleteUnions(){
        this.unions = null;
    }

    public void deleteAccessory(){
        this.accesory = null;
    }

}
