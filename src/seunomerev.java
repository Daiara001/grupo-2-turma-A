import java.util.Scanner;

public class seunomerev {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite saeu nome: ");
		String nome = entrada.nextLine();

		System.out.println("Seu nome é: " + nome);

		entrada.close();

	}

}
