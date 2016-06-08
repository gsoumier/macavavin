package fr.arolla.macavavin.services;

import fr.arolla.macavavin.model.ReferenceBottle;
import fr.arolla.macavavin.model.ReferenceBottleBuilder;
import fr.arolla.macavavin.model.WineColor;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class CorkedReferenceBottleDictionary implements ReferenceBottleDictionary {

    private Map<String, ReferenceBottle> allReferences = new HashMap<String, ReferenceBottle>();

    public CorkedReferenceBottleDictionary() {
        addReference(new ReferenceBottleBuilder()
                .id("1").country("France").color(WineColor.RED).appellation("Pessac Leognan").producer("Chateau Brown")
                .createReferenceBottle());
        addReference(new ReferenceBottleBuilder()
                .id("2").country("France").color(WineColor.RED).appellation("Crozes-Hermitage").producer("Gilles Robin").plot("Terroir des Chassis")
                .createReferenceBottle());
        addReference(new ReferenceBottleBuilder()
                .id("3").country("France").color(WineColor.RED).appellation("Ventoux").producer("Chateau Landra")
                .createReferenceBottle());
    }

    public Collection<ReferenceBottle> getAllReferences() {
        return allReferences.values();
    }

    public void addReference(ReferenceBottle referenceBottle) {
        allReferences.put(referenceBottle.getId(), referenceBottle);
    }


}
