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
        
        
        System.out.print("Digite as informações da prova : \nData : ");
        String data = in.nextLine();
        m1.setData(data);
        
        System.out.print("Local : ");
        String local = in.nextLine();
        m1.setLocal(local);
        
        System.out.print("Peso : ") ;
        
        int peso = Integer.parseInt(in.nextLine());
        m1.setPeso(peso);
        
        System.out.print("\nDigite a quantidade de questões discursivas : ");
        int qtdDis = Integer.parseInt(in.nextLine());
        m1.ListaDiscursiva = new Discursiva[qtdDis];

        System.out.print("\nDigite as informações das questões discursivas : \n\n");
        
        for(int i=0; i<qtdDis ; i++){
            m1.ListaDiscursiva[i] = new Discursiva();
            System.out.print("Digite os criterios de avaliação : ");
            String criterio = in.nextLine();
            m1.ListaDiscursiva[i].setCriterioDeAvaliacao(criterio);
            System.out.print("\nQuestão "+ "("+(i+1)+")"+": \nPergunta : ");
            String pergunta = in.nextLine();
            m1.ListaDiscursiva[i].setPergunta(pergunta);
            
            System.out.print("Peso : ");
            
            double pes = Double.parseDouble(in.nextLine());
            m1.ListaDiscursiva[i].setPeso(pes);
        }
        
        
        System.out.print("Digite a quantidade de questoes Objetivas : ");
        int qtdObj = Integer.parseInt(in.nextLine());
        m1.ListaObjetiva = new Objetiva[qtdDis];
        
        for(int i=0; i<qtdObj ; i++){
            
            m1.ListaObjetiva[i] = new Objetiva();
            System.out.print("Questão "+ (i+1) +": \nPergunta : ");
            String pergunta = in.nextLine();
            m1.ListaObjetiva[i].setPergunta(pergunta);
            
            String[] ops = new String[5];
            
            for(int j=0; j<5 ; j++){
                System.out.print("Opção "+j+" : ");
                ops[j] =  in.nextLine();
            }
            
            m1.ListaObjetiva[i].setOpcao(ops);

            System.out.print("\nPeso : ");
            double pes = in.nextDouble();
            m1.ListaObjetiva[i].setPeso(pes);
            
            System.out.print("\nDigite o numero da opção correta : ");
            int res = in.nextInt();
            m1.ListaObjetiva[i].setResCorreta(res);
        }

        System.out.print(m1.obtemProvaImpressao());
        
        
        //System.out.print(m1.obtemDetalhes());
       
    }
    
}
