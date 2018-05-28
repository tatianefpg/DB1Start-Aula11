package exercicioDeInteger;

import java.util.Scanner;

public class ExecutaVerificaNumeroPar {
	private static Scanner teclado;

	public static void main(String[] args) {
		teclado = new Scanner(System.in);
		VerificaNumeroPar numero = new VerificaNumeroPar();

		System.out.print("Digite um numero: ");
		numero.setNumero(teclado.nextInt());

		if (0 == numero.isPar())
			System.out.println("O numero " + numero.getNumero() + " não é par");
		else
			System.out.println("O numero " + numero.getNumero() + " é par");
	}

}
