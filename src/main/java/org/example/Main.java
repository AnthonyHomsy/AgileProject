package org.example;

import org.example.music.Instrument;

public class Main {
    public static void main(String[] args) {
        Instrument instrument = new Instrument();

        PouvoirFactory pouvoirFactory = new PouvoirFactory();
        Pouvoir pouvoir = pouvoirFactory.createPouvoirFromInstrument(instrument);

        pouvoir.utiliserPouvoir();
}
}