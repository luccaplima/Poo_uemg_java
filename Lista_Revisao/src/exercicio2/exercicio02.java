package exercicio2;

import java.util.Scanner;

public class exercicio02 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int x, y;

        System.out.println("Informe o primeiro numer: ");
        x = teclado.nextInt();

        System.out.println("Informe o segundo numer: ");
        y = teclado.nextInt();

        if (x % y == 0 ){

            System.out.println("o numero "+x+" e multiplo de "+y);
        }
        else System.out.println("o numero "+x+" nao e multiplo de "+y);
        

    }
}
