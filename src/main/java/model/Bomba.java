/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author otavi
 */
public class Bomba {
    private ArrayList<ItensEspeciais> listaBombas;
    
    public Bomba() {
        this.listaBombas = new ArrayList<ItensEspeciais>();
    }
    
    public ArrayList<ItensEspeciais> getListaBombas() {
        return this.listaBombas;
    }
    public void imprimeListaBombas() {
        for(int i = 0; i < this.getListaBombas().size(); i++) {
            System.out.println(this.listaBombas.get(i).getItem());
        }
    }

    public void setItemlistaBombas(ItensEspeciais item) {
        this.listaBombas.add(item);
    }

    public boolean leArquivo() {
        try {
            int numLinha = 1;
            String nome = "";
            int coefDano = 0;
            int range = 0;
            // Le o arquivo
            FileReader ler = new FileReader("Bomba.txt");
            BufferedReader reader = new BufferedReader(ler);  
            String linha;
            while( (linha = reader.readLine()) != null ){
                switch(numLinha) {
                    case 1:
                        nome = linha;
                        numLinha++;
                        break;
                    case 2:
                        coefDano = Integer.parseInt(linha);
                        numLinha++;
                        break;
                    case 3:
                        range = Integer.parseInt(linha);
                        numLinha = 1;
                        this.setItemlistaBombas(new ItensEspeciais(nome, coefDano, range));
                        break;
                }
            }
            reader.close();
            // Imprime confirmacao
            return true;
        }
        catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
}
