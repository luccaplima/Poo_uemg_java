package Questao01;

import java.util.Scanner;

public class Exercicio01 {

    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        final int valores = 12;
        int j = 0;
        int z = 0;
        int [] vet;
        vet = new int[valores];
        for (int i=0; i<valores; i++){
        System.out.println("Informe o numero " +(i+1)+":");
        vet[i]=ler.nextInt();
        if (vet[i]<8){

            j++;

        } 
        
            else if (vet[i]>10){
            
            z++;
            
        }
    }
    double menor=(double) (j*100)/12;
    System.out.println("Números menores que 8: " +menor+ "%\n");
    double maior=(double) (z*100)/12;
    System.out.println("Números maiores que 10: " +maior+ "%\n");
    }
   
}   
