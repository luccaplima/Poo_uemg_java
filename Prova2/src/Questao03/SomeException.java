package Questao03;
import java.util.Scanner;
import java.util.InputMismatchException;

public class SomeException {  
static int aux;

    public SomeException (int v1, int v2) throws ArithmeticException{
        aux=v1/v2;
    }      

    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        try{
        System.out.println("Informe o primeiro valor a ser dividido:");
        int v1=ler.nextInt();
        System.out.println("Informe o segundo valor a ser dividido:");
        int v2=ler.nextInt();
        SomeException teste1 = new SomeException(v1,v2);
        System.out.println("RESULTADO: " +aux);
        }
        catch(InputMismatchException e){
        System.err.printf("Exceçao: %s\n", e);
        System.out.println("\nINSERIR VALORES INTEIROS!");
        }
        catch(ArithmeticException e){
            System.err.printf("Exceçao: %s\n", e);
            System.out.println("\nDIVISAO POR ZERO!");
        }
    }

}
