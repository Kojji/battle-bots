/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.Arrays;

import model.*;

/**
 *
 * @author Fernando Koji
 */
public class Game {
  public static void main(String[] args) {
      Arma arma = new Arma();
      arma.leArquivo();
      Bomba bomba = new Bomba();
      bomba.leArquivo();
      Virus virus = new Virus();
      virus.leArquivo();
      System.out.println("\nArmas\n====================");
      arma.imprimeListaArmas();
      System.out.println("\nBombas\n====================");
      bomba.imprimeListaBombas();
      System.out.println("\nVirus\n====================");
      virus.imprimeListaVirus();

      Arena tabuleiro = new Arena(2,10,10);
      Arena initialPosition = tabuleiro; // criar uma função para gerar coordenada inicial randomica 
      Robo R1 = new Robo(arma.getListaArmas().get(0), initialPosition, 300, "Robo Teste 1");
      System.out.println(R1.getNome() + " - criado");
      Robo R2 = new Robo(arma.getListaArmas().get(0), initialPosition, 300, "Robo Teste 2");
      System.out.println(R2.getNome() + " - criado");

      System.out.println(Arrays.deepToString(tabuleiro.getArena()));
      
  }
}
