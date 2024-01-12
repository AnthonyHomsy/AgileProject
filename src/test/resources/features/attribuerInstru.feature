Feature: US_001
  Choisir son instrument
  En tant que Musicien
  Je veux choisir un instrument qui sera le mien
  Afin de savoir qui joue de quel instrument

  Scenario Outline: Attribution d'un instrument
    Given la création d'un musicien nommé <nom>
    When on attribue un instrument au musicien
    Then l'instrument du musicien devient l'instrument choisi

    Examples:
      |    nom     |
      | "Coltrane" |
      |  "Mozart"  |