package org.example;

class PouvoirDefault implements Pouvoir {
    @Override
    public void utiliserPouvoir() {
        System.out.println("Pouvoir par défaut activé !");
    }
}
