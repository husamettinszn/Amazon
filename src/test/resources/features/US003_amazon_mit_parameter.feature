Feature: US003_amazon_mit_parameter


  Scenario: TC_005_parameter_nutzung

    When User öffnet amazon Homepage
    And User sucht "iphone"
    Then User verifiziert, dass das Ergebnis "iphone" enthält
    And User schlieẞt die Seite.