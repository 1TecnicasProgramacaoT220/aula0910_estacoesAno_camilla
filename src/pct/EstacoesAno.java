/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pct;

import java.util.Scanner;

/**
 *
 * @author hyran
 */
public class EstacoesAno {
    public static void main(String[] args) {
        //Declaração de Variáveis
        int dia, mes;
        
        //Objeto de Entrada
        Scanner entrada = new Scanner(System.in);
        
        //Apresentação
        System.out.println("\n\t\t-- Estações do Ano --\n");
        
        //Entrada
              System.out.print("Informe o dia: ");
        dia = entrada.nextInt();
        System.out.print("Informe o mês: ");
        mes = entrada.nextInt();
        
        //Processamento
        switch(mes){
            case 1:
            case 2:
            case 3:
                if((mes == 3) && (dia >= 20)){
                    System.out.println("Outono!");   
                } else {
                    System.out.println("Verão!");
                }
                
                break;
            case 4:
            case 5:
            case 6:
                if ((mes == 6) && (dia >= 21)){
                    System.out.println("Inverno!");
                } else {
                    System.out.println("Outono!");
                }
                
                break;
            case 7:
            case 8:
            case 9:
                if((mes == 9) && (dia >= 23)){
                    System.out.println("Primavera!");
                } else {
                    System.out.println("Inverno!");
                }
                
                break;
            case 10:
            case 11:
            case 12:
                if((mes == 12) && (dia >= 22)){
                System.out.println("Verão!");
                } else {
               System.out.println("Primavera!");
                }
                break;
            default:
                System.out.println("Mês " + mes + "incorreto!");
        }
    }
    
}
