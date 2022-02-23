Feature:US001 amazon page suche

  Scenario: TC_01 Amazon suchen

    Given User öffnet amazon Homepage
    And User sucht iphone
    Then User verifiziert, dass das Ergebnis iphone enthält

    Given User öffnet amazon Homepage
    And User sucht tea pot
    Then User verifiziert, dass das Ergebnis tea pot enthält

    Given User öffnet amazon Homepage
    And User sucht flower
    Then User verifiziert, dass das Ergebnis flower enthält

    Then User schlieẞt die Seite.