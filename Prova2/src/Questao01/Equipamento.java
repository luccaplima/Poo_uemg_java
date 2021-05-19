package Questao01;

import java.util.Scanner;


public class Equipamento {
    boolean ligado;

    public void liga(){
        ligado=true;
    }

    public void desliga(){
        ligado=false;
    }

    public static class EquipamentoSonoro extends Equipamento {
        short volume;
        boolean stereo;
        
        public void getVolume(){
            System.out.println(volume);
        }
        
        public void setVolume(){
            System.out.println("Informe o volume desejado:");
            Scanner ler = new Scanner(System.in);
            volume = ler.nextShort();
        }
        
        public void mono(){
            stereo=false;
        }
        
        public void stereo(){
            stereo=true;
        }
        
        public void liga(){
            volume=5;
        }
    }
    
    public static void main(String[] args) {
        //Equipamento meuEquipamento = new Equipamento();
       EquipamentoSonoro meuEquipamentoSonoro = new EquipamentoSonoro();
       meuEquipamentoSonoro.setVolume();
       meuEquipamentoSonoro.getVolume();
    }
}