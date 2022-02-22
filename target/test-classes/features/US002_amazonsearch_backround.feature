Feature: US002_amazonsearch_backround

  Background:
    Given User öffnet amazon Homepage

  Scenario: TC_002_amazon_iphone_suche_test
    And User sucht iphone
    Then User verifiziert, dass das Ergebnis iphone enthält
    And User schlieẞt die Seite.

  Scenario: TC_003_amazon_teapot_suche_test
    And User sucht tea pot
    Then User verifiziert, dass das Ergebnis tea pot enthält
    And User schlieẞt die Seite.

  Scenario: TC_004_amazon_flower_suche_test
    And User sucht flower
    Then User schlieẞt die Seite.
    And User schlieẞt die Seite.