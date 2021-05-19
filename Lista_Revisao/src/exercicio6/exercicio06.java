package exercicio6;

import java.util.Scanner;
import java.util.Arrays;

public class exercicio06 {

    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        char[][] matriz = new char [3][3];
        //System.out.println("Matriz M[3][3]\n");

        for(int i=0; i < matriz.length; i++){
            for(int j=0; j < matriz[i].length; j++){
            
                System.out.println("Digite o elemento da linha "+(i+1)+" da coluna "+(j+1));
                matriz[i][j] = teclado.next().charAt(0);

            }
        }
                

        for(int i=0; i < matriz.length; i++){
                       
               System.out.println(Arrays.toString(matriz[i])); 

        }
        
        

    }

}
