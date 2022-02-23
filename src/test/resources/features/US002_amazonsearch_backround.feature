Feature: US002_amazonsearch_backround
# @wip work in progress
# @ wip or @amazon birinden biri varsa
# @wip and @amazon ikisi de varsa
# not @amazon yazilan tag olmayan

  Background:
    Given User öffnet amazon Homepage
@amazon
  Scenario: TC_002_amazon_iphone_suche_test
    And User sucht iphone
    Then User verifiziert, dass das Ergebnis iphone enthält
    And User schlieẞt die Seite.
  @amazon @teapot
  Scenario: TC_003_amazon_teapot_suche_test
    And User sucht tea pot
    Then User verifiziert, dass das Ergebnis tea pot enthält
    And User schlieẞt die Seite.
@amazon @flower
  Scenario: TC_004_amazon_flower_suche_test
    And User sucht flower
    Then User schlieẞt die Seite.
    Then  User verifiziert, dass das Ergebnis flower enthält
    And User schlieẞt die Seite.