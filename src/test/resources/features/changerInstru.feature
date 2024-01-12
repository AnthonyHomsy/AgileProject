Feature: US_002
  Changer son instrument
  En tant que Musicien
  Je veux changer l'instrument dont je joue
  Afin de connnaître une autre famille d'instruments

  Scenario Outline: Changement d'un instrument
    Given Un musicien existant nommé <nom> avec un instrument de la famille <famille>
    When On change l'instrument du musicien
    Then Un nouvel instrument a pour propriétaire le musicien et cet instrument est d'une nouvelle famille

    Examples:
      |    nom     | famille  |
      | "Coltrane" | "vents"  |