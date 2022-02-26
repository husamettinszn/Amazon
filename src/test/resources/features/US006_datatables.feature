Feature: US006_datatables
@wip
  Scenario Outline: TC_007_dataTables
    Given User geht zur "data_tables_url" seite
    Then User klikt auf new Taste
    Then User gibt "<first_name>" ins Vornamentextfeld
    And User gibt "<last_name>" ins Namentextfeld
    And User gibt "<postion>" ins Positiontextfeld
    And User gibt "<office>" ins Officetextfeld
    And User gibt "<extension>" ins Extentiontextfeld
    And User gibt "<start_date>" ins Startdatumtextfeld
    And User gibt "<salary>" ins Gehalttextfeld
    And User klik auf create Button
    Then User sucht "<first_name>" im Suchfeld
    Then User verifiziert, dass "<first_name>" in der Liste steht
    And User schlieẞt die Seite.


    Examples:
      | first_name | last_name | postion | office | extension | start_date | salary |
      | ahmet      |selim      |manager  |home    |-----      |2022-02-01  | 3000|
      | mahmut      |selim      |scrum master  |home    |-----      |2022-02-01  | 3000|
      | tarik      |selim      |manager  |home    |-----      |2022-02-01  | 3000|
      | fatma      |selim      |manager  |office    |-----      |2022-02-01  | 20000|
      | ahmet      |kaya      |manager  |home    |-----      |2022-02-01  | 5000   |





