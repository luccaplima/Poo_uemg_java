package exercicio1;

import java.util.Scanner;

public class exercicio01 {
    
    public static void main(String[] args) {
    
        Scanner teclado = new Scanner(System.in);

        int x, y, z, produto;
        int maior = 0;
        double media;
        
        System.out.println("Informe o primeiro numer: ");
        x = teclado.nextInt();

        System.out.println("Informe o segundo numer: ");
        y = teclado.nextInt();

        System.out.println("Informe o terceiro numer: ");
        z = teclado.nextInt();

        if (x > maior){
            maior = x;
        }

        if (y > maior){
            maior = y;
        }

        if (z > maior){
            maior = z;
        }

        int menor = x;

        if (y < menor){

            menor = y;
        }

        if (z < menor){
            menor = z;
        }
           
        produto = x*y*z;
        media = (double)(x+y+z)/3;
        
        System.out.println("os numeros digitados foram: "+x+" , "+y+" , "+z);
        System.out.println("o maior dos numeros digitados e: "+maior);
        System.out.println("o menor dos numeros digitados e: "+menor);
        System.out.println("o produto dos numeros digitados e: "+produto);
        System.out.println("a media dos numeros digitados e: "+media);
    }

}
