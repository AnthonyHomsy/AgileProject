package unitaires;

import org.example.SuperMusicien;
import org.example.music.Instrument;
import org.example.music.Musicien;
import org.example.superΩ.SuperHeros;

import static org.junit.jupiter.api.Assertions.*;

public class superAInstrument {

    Instrument piano = new Instrument();
    Musicien mozart = new Musicien();
    SuperMusicien amadeus = new SuperMusicien();

    @org.junit.jupiter.api.Test
    void aInstru() {
        mozart.setInstrument(piano);
        amadeus.setMusicien(mozart);
        assertNotNull(amadeus.getInstrumentMusicien());
    }

}
