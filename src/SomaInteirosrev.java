import java.util.Scanner;

public class SomaInteirosrev {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int n1, n2, soma;

		System.out.println("Digite N1: ");
		n1 = entrada.nextInt();

		System.out.println("Digite N2: ");
		n2 = entrada.nextInt();

		soma = (n1 + n2);

		double media = (double)(n1 + n2) / 2;

		System.out.println("O valor da soma é " + soma);
		System.out.println("O valor da média é " + media);

		entrada.close();

	}

}
