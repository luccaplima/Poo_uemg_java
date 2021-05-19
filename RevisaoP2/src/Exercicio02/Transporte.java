package Exercicio02;
import java.util.Scanner;

public class Transporte {
    boolean ligado;
    int velocidade;
    
     public void liga(){
        ligado=true;
    }

    public void desliga(){
        ligado=false;
        velocidade=0;
    }
    
    public void get(){
        System.out.println("A velocidade no momento Ã© igual a " +velocidade);
    }
    
    public void set(){
        System.out.println("Informe a velocidade desejada:");
        int aux;
        Scanner ler = new Scanner(System.in);
        aux=ler.nextInt();
            if(aux>0){
                velocidade=0;
            }
            else if(aux<=0){
                System.out.println("ERRO: a velocidade informada nÃ£o pode ser menor do que zero!");
            }
    }
    
    public static class Carro extends Transporte{
        int quilometragem;
        
        public void getVelocidade(){
            System.out.println("A velocidade no momento Ã© igual a " +velocidade);
        }
        
        public void setVelocidade(){
            System.out.println("Informe a velocidade desejada:");
            Scanner ler = new Scanner(System.in);
            int aux;
            aux=ler.nextInt();
            if(0<aux && aux<=200){
                velocidade=aux;
            }
            else if(aux<0 || aux>200){
                System.out.println("A velocidade do carro nÃ£o pode ser negativa, nem ultrapassar o valor 200!");
            }
        }
        
        public void getQuilometragem(){
            System.out.println("A quilometragem no momento Ã© igual a " +quilometragem);
        }
        
        public void setQuilometragem(){
            System.out.println("Informe a quilometragem desejada:");
            Scanner ler = new Scanner(System.in);
            int aux;
            aux=ler.nextInt();
            if(0<aux && aux<=999999){
                quilometragem=aux;
            }
            else if(aux<0 || aux>999999){
                System.out.println("A quilometragem nÃ£o pode ser negativa, nem ultrapassar o valor 999999!");
            }
        }
    }
    
    public static void main(String[] args) {
            
    }
}
