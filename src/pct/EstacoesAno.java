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
        if((mes == 1) || (mes == 2) || (mes == 3)){
            if((mes == 3) && (dia >= 20)){
                System.out.println("Outono!");
            } else {
                System.out.println("Verão!");
            }
        } else if ((mes == 4) || (mes == 5) || (mes == 6)){
            System.out.println("Outono!");
        } else if((mes == 7) || (mes == 8) || (mes == 9)){
            System.out.println("Inverno!");
        } else if((mes == 10) || (mes == 11) || (mes == 12)){
            System.out.println("Primavera!");
        }
    }
    
}
