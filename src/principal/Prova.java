/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.ArrayList;

public class Prova {
    Objetiva ListaObjetiva;
    Discursiva ListaDiscursiva;
    private String nomeDisciplina;
    private int peso;
    private String local;
    private String data;
    
    ArrayList <Questao> questoes = new ArrayList<Questao>();

    public  String obtemDetalhes(){
        String cabecalho = "";
        cabecalho += "Nome:_______________"+"\n"+"Disciplina : "+this.nomeDisciplina+"\n";
        cabecalho += "Peso : " + this.peso+"\t";
        cabecalho += "Local : " + this.local+"\t\t";
        cabecalho += "Data : " + this.data;
        return cabecalho;
    }
    public String obtemProvaImpressao(){
        String impressao = obtemDetalhes();

        for(int i = 0; i <questoes.size() ; i++){
            if(questoes.get(i) instanceof Discursiva){
                impressao += "\n"+questoes.get(i).retornaQuestao();
            }else if (questoes.get(i) instanceof Objetiva){
                impressao += "\n"+questoes.get(i).retornaQuestao();
            }
        }
        return impressao;
    }
    
    
    //Sets and Gets
    
    public void setListaObjetiva(int indice, Objetiva novaLista){
        this.ListaObjetiva = novaLista;
    }
    
    public Objetiva getListaObjetiva(int indice){
        return this.ListaObjetiva;
    }
    
    public void setListaDiscursiva(Discursiva novaLista){
        this.ListaDiscursiva = novaLista;
    }
    public Discursiva getListaDiscursiva(){
        return this.ListaDiscursiva;
    }
    
    public void setNomeDisciplina(String novoNome){
        this.nomeDisciplina = novoNome;
    }
    
    public String getNomeDisciplina(){
        return this.nomeDisciplina;
    }
    
    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    
    public Prova(String nomeDisciplina){
        this.nomeDisciplina = nomeDisciplina; 
    }
    
}
