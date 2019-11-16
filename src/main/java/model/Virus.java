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
public class Virus {

    private ArrayList<ItensEspeciais> listaVirus;
    
    public Virus() {
        this.listaVirus = new ArrayList<ItensEspeciais>();
    }
    
    public ArrayList<ItensEspeciais> getListaVirus() {
        return this.listaVirus;
    }
    public void imprimeListaVirus() {
        for(int i = 0; i < this.getListaVirus().size(); i++) {
            System.out.println(this.listaVirus.get(i).getItem());
        }
    }

    public void setItemlistaVirus(ItensEspeciais item) {
        this.listaVirus.add(item);
    }

    public boolean leArquivo() {
        try {
            int numLinha = 1;
            String nome = "";
            int coefDano = 0;
            int range = 0;
            // Le o arquivo
            FileReader ler = new FileReader("Virus.txt");
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
                        this.setItemlistaVirus(new ItensEspeciais(nome, coefDano, range));
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
