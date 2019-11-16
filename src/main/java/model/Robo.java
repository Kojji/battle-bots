/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Fernando Koji
 */
public class Robo {
    private String nome;
    private Arma arma;
    private Arena posicao;
    private int vida;

    public Robo(Arma arma, Arena posicao, int vida, String nome) {
        this.nome = nome;
        this.arma = arma;
        this.posicao = posicao;
        this.vida = vida;
    }


    public String getNome() { return this.nome; }
    public void setNome(String nome) { this.nome = nome; }
    public Arma getArma() { return this.arma; }
    public void setArma(Arma arma) { this.arma = arma; }
    public Arena getPosicao() { return this.posicao; }
    public void setPosicao(Arena posicao) { this.posicao = posicao; }
    public int getVida() { return this.vida; }
    public void setVida(int vida) { this.vida = vida; }

    public int increaseVida(int value) {
        this.setVida(this.getVida()+value);
        return this.getVida();
    }
    public int decreaseVida(int value) {
        this.setVida(this.getVida()-value);
        return this.getVida();
    }
    
    
}
