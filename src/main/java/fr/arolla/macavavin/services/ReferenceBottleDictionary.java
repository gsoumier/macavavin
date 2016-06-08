package fr.arolla.macavavin.services;

import fr.arolla.macavavin.model.ReferenceBottle;

import java.util.Collection;


public interface ReferenceBottleDictionary {

    Collection<ReferenceBottle> getAllReferences();

    void addReference(ReferenceBottle referenceBottle);

}
