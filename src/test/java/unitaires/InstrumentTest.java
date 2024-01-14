package unitaires;

import org.example.music.Instrument;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InstrumentTest {

    Instrument saxophone = new Instrument();


    @org.junit.jupiter.api.Test
    void estCordes() {
        assertEquals(false, saxophone.estCordes());
    }
}
