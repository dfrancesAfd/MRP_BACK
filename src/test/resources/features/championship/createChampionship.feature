Feature: Creer un championnat
  Scenario Outline: Creer un championnat
    #identifiant;nom;startDate;endDate;listeDeManches;listDeClassement
  #{
  # id: "string",
  # nameChampionship: "string", le nom du championnat
  # startDateChampionship: "string",
  # endDateChampionship: "string",
  # state: [PLANNED, IN COURSE, TERMINATED] PLANNED : un championnat planifié qui n'a pas encore démaré
    # IN COURSE : un championnat en cours, dont la date de début est antérieur à la date actuelle
    # TEMINATED : Un championnat qui est terminé sans conctraintes de date
  # rounds: []
  # ranks: [{
  #   login: "string",
  #   points: int
  # }]
  #}
  #GIVEN étant donné mon état initial que je décris
  #WHEN Je déclenche mon action (ici c'est la création de mon championnat
  #THEN Je m'attends à un résultat

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
      |Championnat MRP #2|2023-02-01T00:00:00Z|2023-06-29T00:00:00Z|FINISHED        |