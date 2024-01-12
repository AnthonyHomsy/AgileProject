package org.example;

public class Musicien
{
    // variables d'instance
    private String nom = "Mozart";
    private Instrument instru;

    /**
     * Modificateur de famille
     */
    public void setInstrument(Instrument ins)
    {
        this.instru = ins;
        ins.setProprio(this);
    }

    public Instrument getInstrument(){
        return this.instru;
    }

    public void setName(String name){
        this.nom = name;
    }

    public String getName(){
        return this.nom;
    }

    public String commentaire(){
        if (instru.estCordes()){
            return "Vous jouez d'un instrument à cordes, bravo !";
        }else{
            return "Plutôt vents ou percussions ?";
        }
    }
}

