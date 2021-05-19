package Questao02;

import java.util.Arrays;
import java.util.Random;

public class Exercicio02 {

  
    public static void main(String[] args) {
        Random random = new Random(50);
        int [] num;
        num = new int[50];

        for(int i = 0; i < 50; i++) {
         num[i]=random.nextInt();

        }

         Arrays.sort(num);
        System.out.println(Arrays.toString(num));

    }
}
