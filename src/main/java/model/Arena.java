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
public class Arena {
    private int altura;
    private int largura;
    private int comprimento;

    private int[][] arena;

    public Arena(int altura, int largura, int comprimento) {
        this.altura = altura;
        this.largura = largura;
        this.comprimento = comprimento;
        this.arena = new int[largura][comprimento];

    }

    public boolean initialize() {
        for(int i = 0; i < this.getLargura(); i++) {
            for(int j = 0; j < this.getComprimento(); j++) {
                this.setArenaIndex(i, j, 1);
            }
        }
        return true;
    }

    public void setArenaIndex(int largura, int comprimento, int value) {
        this.arena[largura][comprimento] = value;
    }

    public int[][] getArena() {
        return this.arena;
    }

    public int getAltura() {
        return this.altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getLargura() {
        return this.largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public int getComprimento() {
        return this.comprimento;
    }

    public void setComprimento(int comprimento) {
        this.comprimento = comprimento;
    }    
}
