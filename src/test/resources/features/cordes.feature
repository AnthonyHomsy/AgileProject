Feature: IT_001 Vérifie si un instrument est à cordes ou non
  En tant que Musicien
  Je veux savoir si oui ou non mon instrument est un instrument à cordes

  Scenario Outline: Vérifier un instrument à cordes
    Given un musicien possède un instrument
    When l'instrument est inspecté
    Then le musicien vérifie si l'instrument est à cordes
    Examples:
      | Cordes |
      | false  |