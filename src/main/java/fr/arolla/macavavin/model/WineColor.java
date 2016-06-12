package fr.arolla.macavavin.model;

public enum WineColor {

    RED("Vin rouge"),

    ROSE("Vin rosé"),

    WHITE("Vin blanc");

    private String label;

    WineColor(String label) {
        this.label = label;
    }

    public String getLabel(){
        return label;
    }

}
