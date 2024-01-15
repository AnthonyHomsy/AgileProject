package org.example.test;

import org.example.SuperMusicien;
import org.example.music.Musicien;
import org.example.superΩ.SuperHeros;
import org.example.superΩ.SuperVilain;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class testSuperMusicien {

    SuperHeros amadeus = new SuperHeros();
    Musicien mozart = new Musicien();
    SuperMusicien wolfgang = new SuperMusicien();

    @org.junit.jupiter.api.Test
    void pasVilain() {
        wolfgang.setSuperHeros(amadeus);
        wolfgang.setMusicien(mozart);
        assertNotNull(wolfgang.getMusicien());
        assertNotNull(wolfgang.getSuperHeros());
    }

}
