package org.example;

import org.example.music.Instrument;

import java.util.HashMap;
import java.util.Map;

class PouvoirFactory {
    private Map<String, Pouvoir> pouvoirMap;

    public PouvoirFactory() {
        pouvoirMap = new HashMap<>();
        // Associer chaque instrument à un pouvoir spécifique
        pouvoirMap.put("Cordes", new PouvoirCordes());
        pouvoirMap.put("Vents", new PouvoirVents());
        pouvoirMap.put("Percussions", new PouvoirPercussions());
    }
    public Pouvoir createPouvoirFromInstrument(Instrument instrument) {
        return pouvoirMap.getOrDefault(instrument.getFamille(), new PouvoirDefault());
    }
}

