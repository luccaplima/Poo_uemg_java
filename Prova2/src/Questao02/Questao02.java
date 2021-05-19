package Questao02;
import java.util.Scanner;

public class Questao02 {
    
    public static <E> boolean Igual (E v1, E v2){
        if (v1.equals(v2))
            return true;
        else
            return false;               
    }
    
    //criei a classe conta para fazer os testes de objetos
    
    static class Conta {
    double saldo;

    public Conta (double saldoInicial){
        if (saldo<0){
        saldo=0;
        System.out.println("Saldo informado menor que 0!");
        }
        else if(saldo>=0) {
        saldo=saldoInicial;
        }   
        }
    }
    
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        double d1, d2;
        String s1, s2;
        int i1, i2;
        Conta teste1 = new Conta(153.23);
        Conta teste2 = new Conta(233.85);
        Conta teste3 = new Conta(233.85);
        
        System.out.println("Este programa compara dois inputs e retorna true se forem iguais e falso se forem diferentes!");
        
        //TESTE de double
        System.out.println("Informe o primeiro double a ser comparado:");
        d1=ler.nextDouble();
        System.out.println("Informe o segundo double a ser comparado:");
        d2=ler.nextDouble();
        if (Igual(d1,d2)==true){
            System.out.println("TRUE");
        }
        else 
            System.out.println("FALSE");
        
        //TESTE de string
        System.out.println("Informe o primeiro string a ser comparado:");
        s1=ler.nextLine();
        System.out.println("Informe o segundo string a ser comparado:");
        s2=ler.nextLine();
        if (Igual(s1,s2)==true){
            System.out.println("TRUE");
        }
        else 
            System.out.println("FALSE");
        
        //TESTE de int
        System.out.println("Informe o primeiro inteiro a ser comparado:");
        i1=ler.nextInt();
        System.out.println("Informe o segundo inteiro a ser comparado:");
        i2=ler.nextInt();
        if (Igual(i1,i2)==true){
            System.out.println("TRUE");
        }
        else 
            System.out.println("FALSE");
        
        //TESTE de objeto
        if (Igual(teste1.saldo,teste2.saldo)==true){
            System.out.println("TRUE");
        }
        else 
            System.out.println("FALSE");
    }
}

