package fr.arolla.macavavin.model;

public class ReferenceBottleBuilder {
    private String id;
    private String country;
    private WineColor color;
    private String appellation;
    private String producer;
    private String plot;
    private String cuvee;

    public ReferenceBottleBuilder id(String id) {
        this.id = id;
        return this;
    }

    public ReferenceBottleBuilder country(String country) {
        this.country = country;
        return this;
    }

    public ReferenceBottleBuilder color(WineColor color) {
        this.color = color;
        return this;
    }

    public ReferenceBottleBuilder appellation(String appellation) {
        this.appellation = appellation;
        return this;
    }

    public ReferenceBottleBuilder producer(String producer) {
        this.producer = producer;
        return this;
    }

    public ReferenceBottleBuilder plot(String plot) {
        this.plot = plot;
        return this;
    }

    public ReferenceBottleBuilder cuvee(String cuvee) {
        this.cuvee = cuvee;
        return this;
    }

    public ReferenceBottle createReferenceBottle() {
        return new ReferenceBottle(id, country, color, appellation, producer, plot, cuvee);
    }
}