package empresa;

public class Principal {

	public static void main(String[] args) {

		Aluno a1 = new Aluno("Mario", "Encanador", new Avaliacao(10, 9, 8));
		Aluno a2 = new Aluno("Julia", "Desenvolvedora", new Avaliacao(7, 9, 6));

		a1.info();
		a2.info();

		// Avaliacao mario = new Avaliacao(7,4,10);
		
		// Avaliacao julia = new Avaliacao(8, 9, 10);
		
		// System.out.println("Média Aritimética do Mário é: " + mario.mediaAritimetica());
		// System.out.println("Média Ponderada do Mário é: " + mario.mediaPonderada());
		
		// System.out.println("Média Aritimética do Julia é: " + julia.mediaAritimetica());
		// System.out.println("Média Ponderada do Julia é: " + julia.mediaPonderada());
	}

}
