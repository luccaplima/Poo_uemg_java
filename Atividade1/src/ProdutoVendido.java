
/*questao 04 atividade 1*/

import java.util.Scanner;

public class ProdutoVendido {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        String produto;
        float preco, desc, valortotal, ax;
        int qnt;
        
        System.out.println("Insira o nome do produto: ");
        produto = teclado.nextLine();
        
        System.out.println("Insira o valor do produto: ");
        preco = teclado.nextFloat();
        
        System.out.println("Insira a quantidade que deseja comprar: ");
        qnt = teclado.nextInt();
        
           
        
            if (qnt>0 & qnt<=10){
                valortotal = (preco * qnt);
                System.out.println("o valor total a ser pago por "+qnt+" "+produto+" e: "+valortotal);
            }else if (qnt>=11 & qnt <=20){
                 ax = preco * qnt;
                 valortotal = (float) (ax - (ax *0.1));
                 System.out.println("o valor total a ser pago por "+qnt+" "+produto+" e: "+valortotal);
            }else if(qnt>= 21 & qnt <= 50){
                 ax = preco * qnt;
                 valortotal = (float) (ax - (ax *0.2));
                 System.out.println("o valor total a ser pago por "+qnt+" "+produto+" e: "+valortotal);
            }else if (qnt > 50){
                 ax = preco * qnt;
                 valortotal = (float) (ax - (ax *0.25));
                 System.out.println("o valor total a ser pago por "+qnt+" "+produto+" e: "+valortotal);
                 
            }else System.out.println("quantidade invalida!");

    }
    
}
