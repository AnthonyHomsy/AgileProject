Feature: US_006
  Attribution pouvoir selon instrument
  En tant que Musicien
  Je veux que la Pouvoir Factory attribue automatiquement des pouvoirs spécifiques en fonction de l'instrument que je choisis
  Afin de bénéficier d'avantages liés à la famille d'instruments que je joue

  Scenario Outline: Attribution automatique de pouvoirs
    Given un musicien nommé <nom>
    When il choisit son instrument de la famille <famille>
    Then l usine de pouvoirs attribue automatiquement le pouvoir correspondant à l instrument du musicien

    Examples:
      |   nom    | famille  |
      | "Mozart" | "cordes" |
