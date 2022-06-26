Feature: Creer un championnat
  Scenario Outline: Creer un championnat
    Given Une base de donnee ne contenant aucun Championnat existe
    And Un Championnat1 avec les informations suivantes existe
    |nameChampionship|startDateChampionship|endDateChampionship|
    |<nameChampionship>|<startDateChampionship>|<endDateChampionship>|
    And Un Championnat2 avec les informations suivantes existe
    |nameChampionship|startDateChampionship|endDateChampionship|stateChampionship|
    |<nameChampionship>|<startDateChampionship>|<endDateChampionship>|<stateChampionship>|
    And Une liste1 de Manche existe
    And La liste1 de Manche existe dans Championnat2
    And Une liste2 de Classement existe
    And La liste2 de Classement existe dans Championnat2
    When Championnat1 est cree
    Then Le Championnat renvoye possede les memes informations que Championnat2 au delta de le identifiant renseigne
    Examples:
      |nameChampionship|startDateChampionship|endDateChampionship|stateChampionship|
      |Championnat MRP #2|2023-02-01T00:00:00Z|2023-06-29T00:00:00Z|PLANNED        |