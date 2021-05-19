
/*Questao 2 atividade 1*/

import java.util.Scanner;
import java.lang.Math;

class DeterminarRaizes {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        double a, b, c, ax1, ax2, r1, r2;
        
        System.out.println("Informe o valor de 'a': ");
        a = teclado.nextDouble();
        
        System.out.println("Informe o valor de 'b': ");
        b = teclado.nextDouble();
        
        System.out.println("Informe o valor de 'c': ");
        c = teclado.nextDouble();
        
        ax1 = b*b - 4*a*c;
        ax2 = Math.sqrt(ax1);
        
        r1 = (-b + ax2) / (2 * a);
        r2 = (-b - ax2) / (2 * a);
        
        System.out.println("A raiz 1 da equacao sera: "+r1+", A raiz 2 da equaca sera: "+r2);
     
    }
    
}
