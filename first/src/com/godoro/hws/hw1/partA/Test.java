package com.godoro.hws.hw1.partA;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Team team = new Team(901, "Godoro Spor");
        team.setPlayerList(new ArrayList<Player>());

        Player player1 = new Player(301, "Neşet Ertaş", 45.2);
        player1.setTeam(team);
        team.getPlayerList().add(player1);


        Player player2 = new Player(302, "Mahsuni Şerif", 36.5);
        player2.setTeam(team);
        team.getPlayerList().add(player2);

        Player player3 = new Player(303, "Erkan Ocaklı", 71.3);
        player3.setTeam(team);
        team.getPlayerList().add(player3);

        System.out.println(team.getTeamId()+ "," + "Takım adı: " + team.getTeamName());

         for (Player player : team.getPlayerList()) {
            System.out.println("\t" + player.getPlayerId() + "," 
            + " Takım adı: " + player.getTeam().getTeamName() + ","
            + " Oyuncu adı: " + player.getPlayerName() + ","
            + " Skor: " + player.getAverageScore());            
         }
    }
    
}
