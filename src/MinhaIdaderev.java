import java.util.Scanner;

public class MinhaIdaderev {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite sua idade: "); 
		int idade = entrada.nextInt();

		System.out.println("Sua idade é " + idade + " anos.");
		entrada.close();

	}

}
