package fr.arolla.macavavin.model;

public class ReferenceBottle {

    private final String id;
    private final String country;
    private final WineColor color;
    private final String appellation;
    private final String producer;
    private final String plot;
    private final String cuvee;

    public ReferenceBottle(String id, String country, WineColor color, String appellation, String producer, String plot, String cuvee) {
        this.id = id;

        this.country = country;
        this.color = color;
        this.appellation = appellation;
        this.producer = producer;
        this.plot = plot;
        this.cuvee = cuvee;
    }

    public String getId() {
        return id;
    }

    public String getCountry() {
        return country;
    }

    public WineColor getColor() {
        return color;
    }

    public String getAppellation() {
        return appellation;
    }

    public String getProducer() {
        return producer;
    }

    public String getPlot() {
        return plot;
    }

    public String getCuvee() {
        return cuvee;
    }
}
