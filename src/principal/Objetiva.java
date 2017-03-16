/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

/**
 *
 * @author david
 */
public class Objetiva extends Questao{
    private String[] opcao;
    private int resCorreta;
    
    public void setOpcao(String[] novaOpcao){
        this.opcao = novaOpcao;
    }
    public String getOpcao(int indice){
        return this.opcao[indice];
    }
    
    public void setResCorreta(int novaResCor){
        this.resCorreta = novaResCor;
    }
    
    public int getResCorreta(){
        return this.resCorreta;
    }
    
    
}
