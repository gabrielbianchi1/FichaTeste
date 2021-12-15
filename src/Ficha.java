import java.io.IOException;
import java.util.Scanner;

public class Ficha {
	private static String nome;
	private static int idade;
	private static float altura;
	private static float peso;
	private static char sexo;

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		do {
			System.out.println("Digite seu nome: ");
			nome = leitura.nextLine();
		} while (nome.length() < 6 || nome.length() > 30);

		do {
			System.out.println("Digite sua idade: ");
			idade = leitura.nextInt();
		} while (idade <= 0 || idade >= 100);

		do {
			System.out.println("Digite sua altura: ");
			altura = leitura.nextFloat();
		} while (altura <= 0);

		do {
			System.out.println("Digite seu peso: ");
			peso = leitura.nextFloat();
		} while (peso <= 0);

		do {
			System.out.println("Digite seu sexo: ");
			try {
				sexo = (char) System.in.read();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} while (sexo != 'f' && sexo != 'm');

		System.out.println("Nome: " + nome);
		System.out.println("idade: " + idade);
		System.out.println("Peso: " + peso);
		System.out.println("Altura: " + altura);
		System.out.println("Sexo: " + sexo);

		leitura.close();
	}

}
