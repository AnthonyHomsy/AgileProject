Feature: verifier super villain

  Scenario: get Infos about heros
    Given We have a super hero
    When I request infos
    Then I should see the informations about it

  Scenario: get Infos about heros and vilains
    Given We have a super hero and a villain
    When I request infos villains
    Then I should see the the villain

