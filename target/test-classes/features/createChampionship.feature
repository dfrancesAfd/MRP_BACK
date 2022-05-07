Feature: Créer un championnat
  Scenario Outline: Créer un championnat
    Given Une base de donnée ne contenant aucun Championnat existe
    And Un Championnat1 à créer avec les informations suivantes existe
    |nameChampionship|startDateChampionship|endDateChampionship|
    |<nameChampionship>|<startDateChampionship>|<endDateChampionship>|
    And Un Championnat2 avec les informations suivantes existe
    |nameChampionship|startDateChampionship|endDateChampionship|stateChampionship|
    |<nameChampionship>|<startDateChampionship>|<endDateChampionship>|<stateChampionship>|
    And Une liste1 vide de Manche existe
    And La liste1 de Manche existe dans Championnat2
    And Une liste2 vide de Classement existe
    And La liste2 de Classement existe dans Championnat2
    When Un championnat est créé avec le Championnat1 à créer
    Then Un championnat est renvoyé possédant les informations que Championnat2 au delta de l'identifiant
    And L'identifiant du Championnat renvoyé est renseigné
    Examples:
      |nameChampionship|startDateChampionship|endDateChampionship|stateChampionship|
      |Championnat MRP #2|2023-02-01T00:00:00Z|2023-06-29T00:00:00Z|PLANNED        |