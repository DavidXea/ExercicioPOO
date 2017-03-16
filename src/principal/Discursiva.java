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


public class Discursiva extends Questao {
    private String criterioDeAvaliacao;
    
    public void setCriterioDeAvaliacao(String novoCriterio){
        this.criterioDeAvaliacao = novoCriterio;
    }
    
    public String getCriterioDeAvaliacao(){
        return this.criterioDeAvaliacao;
    }
    
    
}
