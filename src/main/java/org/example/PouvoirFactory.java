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
        pouvoirMap.put("Cuivres", new PouvoirCuivres());
        // Ajouter d'autres associations au besoin
    }
    public Pouvoir createPouvoirFromInstrument(Instrument instrument) {
        return pouvoirMap.getOrDefault(instrument.getFamille(), new PouvoirDefault());
    }
}
