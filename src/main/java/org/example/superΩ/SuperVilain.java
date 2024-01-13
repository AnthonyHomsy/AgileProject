package org.example.superΩ;

/**
 * Write a description of class SuperVillain here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SuperVilain
{
    // instance variables - replace the example below with your own
    private String identiteSecrete = "Tante Plante";
    private String faiblesse = "Feu";
    private SuperHeros ennemi;

    /**
     * Constructor for objects of class SuperVilain
     */
    public SuperVilain(SuperHeros ennemi)
    {
        // initialise instance variables
        this.ennemi = ennemi;
    }

    public String getInfo()
    {
        // put your code here
        return "Nom : "+ this.identiteSecrete+"; Faiblesse : " + this.faiblesse+ "; Ennemie/Pouvoir : "+ this.ennemi.getInfo()+";";
    }
}
