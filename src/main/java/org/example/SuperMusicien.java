package org.example;

import org.example.music.Instrument;
import org.example.music.Musicien;
import org.example.superΩ.SuperHeros;

public class SuperMusicien {

    //Properties
    private Musicien musicien;
    private SuperHeros superHeros;

    //
    public SuperMusicien() {
        this.musicien = new Musicien();
        this.superHeros = new SuperHeros();
    }

    public SuperMusicien(Musicien musicien, SuperHeros superHeros) {
        this.musicien = musicien;
        this.superHeros = superHeros;
    }

    public Musicien getMusicien() {
        return musicien;
    }

    public void setMusicien(Musicien musicien) {
        this.musicien = musicien;
    }

    public SuperHeros getSuperHeros() {
        return superHeros;
    }

    public void setSuperHeros(SuperHeros superHeros) {
        this.superHeros = superHeros;
    }


    //Methods
    public String getIdentiteSecrete(){
        return superHeros.getInfo();
    }
    public String getPouvoir() { return superHeros.getpouvoir(); }
    public Instrument getInstrumentMusicien(){
        return musicien.getInstrument();
    }
}
