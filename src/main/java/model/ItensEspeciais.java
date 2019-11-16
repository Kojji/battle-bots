/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author otavi
 */
public class ItensEspeciais {

    private String nome;
    private int coefDano;
    private int range;

    public ItensEspeciais(String nome, int coefDano, int range) {
        this.nome = nome;
        this.coefDano = coefDano;
        this.range = range;
    }
    public String getNome() {
        return this.nome;
    }
    public int getCoefDano() {
        return this.coefDano;
    }
    public int getRange() {
        return this.range;
    }
    public String getItem() {
        return "Nome: " + this.nome + " - Dano: " + this.coefDano + " - Distancia: " + this.range;
    }



}
