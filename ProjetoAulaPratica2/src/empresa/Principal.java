package empresa;

public class Principal {

	public static void main(String[] args) {
		Avaliacao mario = new Avaliacao(7,4,10);
		
		Avaliacao julia = new Avaliacao(8, 9, 10);
		
		System.out.println("Média Aritimética do Mário é: " + mario.mediaAritimetica());
		System.out.println("Média Ponderada do Mário é: " + mario.mediaPonderada());
		
		System.out.println("Média Aritimética do Julia é: " + julia.mediaAritimetica());
		System.out.println("Média Ponderada do Julia é: " + julia.mediaPonderada());
	}

}
