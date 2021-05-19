
//Exercicio 1: Exercício do Slide da aula05 
//OBS.: nao consegui fazer a parte de ordenar os nomes a partir da idade =/

package atividade2;

import java.util.Arrays;
import java.util.Scanner;
import java.util.List;
import java.util.Collections;

public class PessoaIdade {
    
public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    final int numero_pessoas = 10;
    String [] nomes = new String[10];
    int[] idade;
    System.out.println();
    idade = new int[10];
    for(int i=0; i<numero_pessoas; i++)
    {
            System.out.println("Informe o nome da pessoa " +(i+1)+ ":");
            nomes[i]=ler.nextLine();
    }
    for(int i=0; i<numero_pessoas; i++){
            System.out.println("Informe a idade de " +nomes[i]+ ":"); 
            idade[i]=ler.nextInt();    
            
    }
    
    List list = Arrays.asList(nomes);
    Collections.sort(list);
    System.out.println(""+list);
}
}
