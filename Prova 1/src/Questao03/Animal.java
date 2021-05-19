package Questao03;

public class Animal {
String nome;
int idade;

    public void emitir_som()
	{
		System.out.println("O animal faz um som!");
	}


    public static class Cachorro extends Animal {
        
	public void correr()
	{
		System.out.println("Cachorro correndo...");
	}
        
	public void emitir_som()
	{
		System.out.println("AU AU AU!");
	}
}
    
    public static class Cavalo extends Animal {

	public void correr()
	{
		System.out.println("Cavalo correndo...");
	}
	
	public void emitir_som()
	{
		System.out.println("HINN IN IN");
	}
}
    
    public static class Preguica extends Animal {

	public void subir_arvore()
	{
		System.out.println("Preguica subindo em Ã¡rvores...");
	}
	
	public void emitir_som()
	{
		System.out.println("AAAAAAHHHHZZZZ");
	}
}
    
    
    public static void main(String[] args) {
        Animal meuAnimal = new Animal();
        meuAnimal.emitir_som();
        Cachorro meuCachorro = new Cachorro();
        meuCachorro.emitir_som();
    }
    
}

