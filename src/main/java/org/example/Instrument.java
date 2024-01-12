package org.example;

import java.util.ArrayList;

public class Instrument
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private String famille = "vents";
    private String tonalite = "Mib";
    private ArrayList<Musicien> proprios = new ArrayList<Musicien>();

    /**
     * Modificateur de famille
     */
    public void setFamille(String fam)
    {
        this.famille = fam;
    }

    /**
     * Accesseur de famille
     */
    public String getFamille()
    {
        return this.famille;
    }

    /**
     * Modificateur de tonalite
     */
    public void setTonalite(String ton)
    {
        this.tonalite = ton;
    }

    /**
     * Accesseur de tonalite
     */
    public String getTonalite()
    {
        return this.tonalite;
    }

    public void setProprio(Musicien m)
    {
        this.proprios.add(m);
    }

    /**
     * Accesseur de tonalite
     */
    public ArrayList<Musicien> getProprio()
    {
        return this.proprios;
    }

    /**
     * Cette méthode permet de vérifier si un instrument appartient à la famille des cordes
     */
    public boolean estCordes()
    {
        // Insérez votre code ici
        return this.famille == "cordes";
    }
}

