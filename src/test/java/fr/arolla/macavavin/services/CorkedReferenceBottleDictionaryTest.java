package fr.arolla.macavavin.services;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class CorkedReferenceBottleDictionaryTest {
    @Test
    public void getAllReferences() throws Exception {
        Assertions.assertThat(new CorkedReferenceBottleDictionary().getAllReferences().size()).isEqualTo(3);
    }

}