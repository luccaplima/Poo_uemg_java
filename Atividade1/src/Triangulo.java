
/*primeiro exercicio do slide da aula 3*/

import java.util.Scanner;

class Triangulo {

    
     public static void main(String[] args) {
     Scanner teclado = new Scanner(System.in);
     
     int x1, y1, x2, y2, x3, y3, ax1, ax2, ax3;
     float distAB, distBC, distAC;
     
     System.out.println("informe o valor de x da coordenada 1: ");
        x1= teclado.nextInt();
        
        System.out.println("informe o valor de y da coordenada 1: ");
        y1= teclado.nextInt();
        
        System.out.println("informe o valor de x da coordenada 2: ");
        x2= teclado.nextInt();
        
        System.out.println("informe o valor de y da coordenada 2: ");
        y2= teclado.nextInt();
        
        System.out.println("informe o valor de x da coordenada 3: ");
        x3= teclado.nextInt();
        
        System.out.println("informe o valor de y da coordenada 3: ");
        y3= teclado.nextInt();
        
        ax1=((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1));
        
        ax2=((x3-x2)*(x3-x2))+((y3-y2)*(y3-y2));
                
        ax3=((x3-x1)*(x3-x1))+((y3-y1)*(y3-y1));
        
        distAB = (float) Math.sqrt(ax1);
        distBC = (float) Math.sqrt(ax2);
        distAC = (float) Math.sqrt(ax3);
        
        if (distAB == distBC && distAB == distAC){
            System.out.println("Triangulo Equilatero");
        }else if (distAB == distBC && distAB != distAC && distBC != distAC){
            System.out.println("Triangulo Isosceles");
        }else if (distAB != distBC && distAB != distAC && distAC != distBC){
            System.out.println("Triangulo Escaleno");
        }
    }
}