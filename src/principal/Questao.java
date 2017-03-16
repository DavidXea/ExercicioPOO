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
public class Questao {
    
    private String pergunta;
    private double peso;
    
    
    public void setPeso(double novoPeso){
        this.peso = novoPeso;
    }
    public double getPeso(){
        return this.peso;
    }
    
    public void setPergunta(String novaPergunta){
        this.pergunta = novaPergunta;
    }
    public String getPergunta(){
        return this.pergunta;
    }
    
    
    
}
