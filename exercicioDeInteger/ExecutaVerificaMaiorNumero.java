package exercicioDeInteger;

import java.util.Scanner;

public class ExecutaVerificaMaiorNumero {
	private static Scanner teclado;

	public static void main(String[] args) {
		teclado = new Scanner(System.in);
		VerificaMaiorNumero numero = new VerificaMaiorNumero();

		System.out.print("Digite um numero: ");
		numero.setNumero1(teclado.nextInt());

		System.out.print("Digite outro numero: ");
		numero.setNumero2(teclado.nextInt());

		if (0 == numero.verificaMaiorNumero())
			System.out.println("Os numeros são iguais");
		else
			System.out.println("O maior numero é: " + numero.verificaMaiorNumero());
	}

}
