package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class SuperVilainTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class SuperVilainTest
{
    private SuperHeros magmaMama;
    private SuperVilain tantePlante;


    /**
     * Default constructor for test class SuperVilainTest
     */
    public SuperVilainTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
        magmaMama= new SuperHeros("Magma Mama","Contrôle du Magma");
        tantePlante = new SuperVilain(magmaMama);
    }
    @AfterEach
    public void tearDown()
    {
    }

    @Test
    public void testGetVilainInfo()
    {
        assertEquals("Nom : Tante Plante; Faiblesse : Feu; Ennemie/Pouvoir : Magma Mama : Contrôle du Magma;", tantePlante.getInfo());
    }
}


