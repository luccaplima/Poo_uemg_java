package exercicio4;

import java.util.Scanner;

public class exercicio04 {

    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
       
        char x;
        
       System.out.println("Informe o caracter: ");
       x = teclado.next().charAt(0);

       System.out.println("o codigo na tabela ASCII referente ao caracter "+x+" e: "+(int)x);
       System.out.println("Acesse o link https://web.fe.up.pt/~ee96100/projecto/Tabela%20ascii.htm para conferir ");
    }
}
