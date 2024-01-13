package org.example.superΩ;

/**
 * Write a description of class SuperHeros here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SuperHeros
{
    // instance variables - replace the example below with your own
    private String identiteSecrete;
    private String superPouvoir;

    public SuperHeros(String identiteSecrete, String superPouvoir) {
        this.identiteSecrete = identiteSecrete;
        this.superPouvoir = superPouvoir;
    }
    public SuperHeros() {
        this.identiteSecrete = "Magma Mama";
        this.superPouvoir = "Contrôle de Magma";
    }

    public String getInfo()
    {
        // put your code here

        return this.identiteSecrete + " : " + this.superPouvoir;
    }
}
