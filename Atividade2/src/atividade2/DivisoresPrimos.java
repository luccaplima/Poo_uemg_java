
//Exercicio 1: Exercício do Slide da aula04

package atividade2;

import java.util.Scanner;

public class DivisoresPrimos {
    
        public static void divisores(int x){
            int i;
            System.out.println("Os divisores de "+x+" sao: ");
            for (i=x; i>0; i--){
                if(x%i==0){                   
                    System.out.println(i);
                }
            }            
        }
        
        public static void primos(int x){
            int i, ax = 0;
            for(i=2; i<=x; i++){
              if((x%i)==0){
                  ax++;
              }else if(ax==0){
                  System.out.println("O numero "+x+" e primo!");
                  
              }              
              else divisores(x);              
            }
        }
    
        public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
            int ax2=1;
        do{
        System.out.println("Insira o numero que deseja verificar: ");
        int x = ler.nextInt();
        primos(x);
                  
        }while(ax2==1);
            
       
        }
}
