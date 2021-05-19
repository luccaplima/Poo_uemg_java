
/*questao 03 atividade 1*/

import java.util.Scanner;
import java.lang.Math;

class DistanciaPontos {
    
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        
        int x1, y1, x2, y2, ax1;
        double dist;
        
        System.out.println("informe o valor de x do ponto 1: ");
        x1= teclado.nextInt();
        
        System.out.println("informe o valor de y do ponto 1: ");
        y1= teclado.nextInt();
        
        System.out.println("informe o valor de x do ponto 2: ");
        x2= teclado.nextInt();
        
        System.out.println("informe o valor de y do ponto 2: ");
        y2= teclado.nextInt();
        
        ax1=((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1));
        
        dist = Math.sqrt(ax1);
        
        System.out.println("A distancia do ponto ( "+x1+", "+y1+") ao ponto ( "+x2+", "+y2+") e: "+dist);
        
        
    }
}