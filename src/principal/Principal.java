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
import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        Prova m1 = new Prova("POO");
        Discursiva dis = new Discursiva();
  
        
        
        System.out.print("Digite as informações da prova : \nData : ");
        String data = in.nextLine();
        m1.setData(data);
        
        System.out.print("Local : ");
        String local = in.nextLine();
        m1.setLocal(local);
        
        System.out.print("Peso : ") ;
        int peso = in.nextInt();
        m1.setPeso(peso);
        
        System.out.print("Digite a quantidade de questões discursivas : ");
        int qtdDis = in.nextInt();
        System.out.print("Digite as informações das questões discursivas : \n\n");
        
        
        System.out.print("Digite os criterios de avaliação : ");
        String criterio = in.nextLine();
        m1.ListaDiscursiva[0].setCriterioDeAvaliacao(criterio);
        
        for(int i=0; i<qtdDis ; i++){
            System.out.print("\nQuestão "+ i+1 +": \nPergunta : ");
            String pergunta = in.nextLine();
            m1.ListaDiscursiva[i].setPergunta(pergunta);
            
            System.out.print("\nPeso : ");
            double pes = in.nextDouble();
            m1.ListaDiscursiva[i].setPeso(pes);
        }
        
        String[] ops = new String[4];
        for(int i=0; i<qtdDis ; i++){
            
            System.out.print("Questão "+ i+1 +": \nPergunta : ");
            String pergunta = in.nextLine();
            m1.ListaObjetiva[i].setPergunta(pergunta);
            
            for(int j=0; j<5 ; j++){
                ops[j] = in.nextLine();
                m1.ListaObjetiva[j].setOpcao(ops);
            }

            System.out.print("\nPeso : ");
            double pes = in.nextDouble();
            m1.ListaObjetiva[i].setPeso(pes);
            
            System.out.print("\nDigite o numero da opção correta : ");
            int res = in.nextInt();
            m1.ListaObjetiva[i].setResCorreta(res);
        }

        System.out.print(m1.obtemProvaImpressao());
        
        
        System.out.print(m1.obtemDetalhes());
       
    }
    
}
