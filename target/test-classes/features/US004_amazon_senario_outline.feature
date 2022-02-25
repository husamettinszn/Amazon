Feature: US004_amazon_senario_outline

  @wip
  Scenario Outline: TC_vielfältige_suche
    When User öffnet amazon Homepage
    Then User sucht "<abc>"
    And User verifiziert, dass das Ergebnis "<abc>" enthält
    Then User schlieẞt die Seite.

    Examples:
      | abc       |
      | samsung   |
      | headphone |
      | pencil    |