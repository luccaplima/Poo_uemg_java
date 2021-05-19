package exercicio3;

import java.util.Scanner;
import java.lang.Math;

public class exercicio03 {
    
    public static void main(String[] args){
    Scanner teclado = new Scanner(System.in);
    double raio, diam, area, circ;
    
    System.out.println("informe o raio da circunferencia em centimetros: ");
    raio = teclado.nextDouble();

    diam = 2*raio;
    
    circ = 2 * Math.PI * raio;

    area = Math.PI * (raio*raio);

    System.out.println("o diametro da circunferencia de raio " +raio+ " e: "+diam);
    System.out.println("o comprimento da circunferencia de raio " +raio+ " e: "+circ);
    System.out.println("a area da circunferencia de raio " +raio+ " e: "+area+ " cm^2");
    
    }
}
