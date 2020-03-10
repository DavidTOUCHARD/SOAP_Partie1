package eu.ensup.demoteamclient.presentation;

import java.util.List;

import teamsClient.Team;
import teamsClient.Teams;
import teamsClient.TeamsService;

public class Lanceur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TeamsService teamsservice = new TeamsService();

		Teams port = teamsservice.getTeamsPort();

		List<Team> resultat = port.getTeams();

		for (int i = 0; i < resultat.size(); i++) {
			System.out.println("Nom de l'équipe : " + resultat.get(i).getName() + "\nNombre de joueurs : "
					+ resultat.get(i).getRosterCount());
			for (int j = 0; j < resultat.get(i).getPlayers().size(); j++) {
				int k = j + 1;
				System.out.println("\t\t " + "Joueur " + k + " : " + resultat.get(i).getPlayers().get(j).getName());
			}
			System.out.println("\n");
		}
	}

}
