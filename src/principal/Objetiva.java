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
    private String[] opcao = new String[10];
    private int resCorreta;
    
    public String retornaQuestao(){
            String impressao = "";
            
            impressao += "\n\nPerguntas Objetivas:\nPergunta : "+this.getPergunta();
            impressao += "\nOpcões : ";
            for(int j  = 0 ; j<5 ; j++){
                impressao += "\nOpcão "+(j+1)+" : "+this.getOpcao(j);
            }
            return impressao;
    }
            
    
    
    
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
