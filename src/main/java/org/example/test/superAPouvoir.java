package org.example.test;

import org.example.SuperMusicien;
import org.example.music.Instrument;
import org.example.music.Musicien;
import org.example.superΩ.SuperHeros;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class superAPouvoir {

    String pouvoir = "Télékynésie";
    String id = "Mozart";
    SuperHeros superman = new SuperHeros(id, pouvoir);
    SuperMusicien amadeus = new SuperMusicien();

    @org.junit.jupiter.api.Test
    void aInstru() {
        amadeus.setSuperHeros(superman);
        assertNotNull(amadeus.getPouvoir());
    }
}


