
/*segundo exercicio do slide da aula 02*/

import java.util.Scanner;

public class QuantasMoedas {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); //leitor do teclado
        
        int valor, qmoeda1, qmoeda5, qmoeda10, qmoeda25, qmoeda50, qmoeda100;
        
        System.out.print("Informe o valor em centavos: ");        
        valor = teclado.nextInt();
        
        qmoeda100 = valor / 100;
        valor = valor - (qmoeda100*100);
       
        qmoeda50 = valor / 50;
        valor = valor - (qmoeda50 * 50);
        
        qmoeda25 = valor / 25;
        valor = valor - (qmoeda25 * 25);
        
        qmoeda10 = valor / 10;
        valor = valor - (qmoeda10*10);
        
        qmoeda5 = valor / 5;
        valor = valor - (qmoeda5 * 5);
        
        qmoeda1 = valor;
        
        System.out.println ("Moedas de 1 real: "+qmoeda100);
        System.out.println ("Moedas de 50 centavos: "+qmoeda50);
        System.out.println ("Moedas de 25 centavos: "+qmoeda25);
        System.out.println ("Moedas de 10 centavos: "+qmoeda10);
        System.out.println ("Moedas de 5 centavos: "+qmoeda5);
        System.out.println ("Moedas de 1 centavo: "+qmoeda1);

    }
    
}
