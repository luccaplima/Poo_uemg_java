
/*primeiro exercicio do slide da aula. a saida será x= -1.0 y= 1.0 e z=0.0*/
class Atribuicoes {

    public static void main(String[] args) {
        float x = 1.0f;
        float y = 2.0f;
        float z = 3.0f;
        
        x = -x;
        y = y - 1;
        z = z + x;
        z = z + x - y;
        
        System.out.println("x = "+x+", y = "+y+", z = "+z);
     }    
}
