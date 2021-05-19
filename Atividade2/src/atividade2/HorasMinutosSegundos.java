
//Exercício 2

package atividade2;

import java.util.Scanner;

public class HorasMinutosSegundos {
    
public static void main(String[] args) {
    
    int segIn,valor, horas, min, seg;
        System.out.println("Informe um valor segundos:");
        Scanner ler = new Scanner(System.in);
        segIn = ler.nextInt();
        valor = segIn;
        horas = valor/3600;
        valor = valor-(horas*3600);
        min = valor/60;
        valor = valor-(min*60);
        seg=valor;
       
        System.out.println("em "+segIn+ " segundos tem: " +horas+ " hora(s), "+min+" minuto(s) e "+seg+" segundo(s)"); 
    }          
}
