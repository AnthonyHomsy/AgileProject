package org.example.test;

import org.example.superΩ.SuperHeros;
import org.example.superΩ.SuperVilain;

import static org.junit.jupiter.api.Assertions.*;

public class PasVilain {

    SuperHeros superman = new SuperHeros();
    SuperVilain unvilain = new SuperVilain(superman);

    @org.junit.jupiter.api.Test
    void pasVilain() {
        assertEquals(false, superman.getClass().equals(unvilain.getClass()));
    }

}


