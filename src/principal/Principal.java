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
    @SuppressWarnings("StringEquality")
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

        String decicao;
        @SuppressWarnings("UnusedAssignment")
        String tipo= " ";
        int i=0; 
        
        do{
        System.out.print("\nQue tipo de prova deseja criar? D/O (discursiva/objetiva)");
        
        tipo = in.nextLine();
        
        if("D".equals(tipo)){
            
            System.out.print("\nDigite as informações das questões discursivas : \n\n");
            

            m1.ListaDiscursiva = new Discursiva();

            System.out.print("Digite os criterios de avaliação : ");
            String criterio = in.nextLine();
            m1.ListaDiscursiva.setCriterioDeAvaliacao(criterio);
            System.out.print("\nQuestão "+ "("+(i+1)+")"+": \nPergunta : ");
            String pergunta = in.nextLine();
            m1.ListaDiscursiva.setPergunta(pergunta);
            
            System.out.print("Peso : ");
            
            double pes = Double.parseDouble(in.nextLine());
            m1.ListaDiscursiva.setPeso(pes);
            
            m1.questoes.add(m1.ListaDiscursiva);
            
        }else if("O".equals(tipo)){
            
            m1.ListaObjetiva = new Objetiva();
            
            m1.ListaObjetiva = new Objetiva();
            System.out.print("Questão "+ (i+1) +": \nPergunta : ");
            String pergunta = in.nextLine();
            m1.ListaObjetiva.setPergunta(pergunta);
            
            String[] ops = new String[5];
            
            for(int j=0; j<5 ; j++){
                System.out.print("Opção "+j+" : ");
                ops[j] =  in.nextLine();
            }
            m1.ListaObjetiva.setOpcao(ops);

            System.out.print("\nPeso : ");
            double pes = in.nextDouble();
            m1.ListaObjetiva.setPeso(pes);
            
            System.out.print("\nDigite o numero da opção correta : ");
            int res = in.nextInt();
            m1.ListaObjetiva.setResCorreta(res);
            
            m1.questoes.add(m1.ListaObjetiva);
        }

        System.out.print("Deseja criar outra questão ? s/n \t");
        
        i++;
        }while(in.nextLine().equals("s"));

        System.out.print(m1.obtemProvaImpressao());
        
        
        //System.out.print(m1.obtemDetalhes());
       
    }
    
}
