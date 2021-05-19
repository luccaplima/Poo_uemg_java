
//Exercício 3

package atividade2;

import java.util.Arrays;
import java.util.Random;

public class NumerosAleatorios {
    
    public static void main(String[] args) {
        int [] vet = new int[100];
        Random aleatorio = new Random();
        int i;
        for(i=0; i<vet.length; i++){
            vet[i]=aleatorio.nextInt(100);
            Arrays.sort(vet);
            System.out.println(vet[i]);          
        }
        
}
}
