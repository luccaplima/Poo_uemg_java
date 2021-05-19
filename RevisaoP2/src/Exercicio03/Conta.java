package Exercicio03;

import java.util.Scanner;

public class Conta {
    double saldo;
    
    public void depositar(){
        System.out.println("Informe o valor a ser depositado na conta:");
        double aux;
        Scanner ler = new Scanner(System.in);
        aux=ler.nextDouble();
        saldo=saldo+aux;
    }
    
     public void sacar(){
        System.out.println("Informe o valor a ser sacado da conta:");
        double aux;
        Scanner ler = new Scanner(System.in);
        aux=ler.nextDouble();
        saldo=saldo-aux;
    }
    
    public static class Poupanca extends Conta{
        int diaRendimento;
        
        public void getdiaRendimento(){
            System.out.println(diaRendimento);
        }
        
        public void setdiaRendimento(){
            System.out.println("Informe o dia de rendimento da poupança:");
            Scanner ler = new Scanner(System.in);
            diaRendimento=ler.nextInt();
        }
        
        public void getSaldo(){
            System.out.println(saldo);
        }
        
        public void setSaldo(){
            System.out.println("Informe o saldo da poupança:");
            Scanner ler = new Scanner(System.in);
            double aux;
            aux=ler.nextDouble();
            if(aux>=0){
                saldo=aux;
            }
            else if(aux<0){
                System.out.println("ERRO: o saldo da poupança não pode ser negativo!");
            }
        }
    }
    
    public static void main(String[] args) {
        
    }
}