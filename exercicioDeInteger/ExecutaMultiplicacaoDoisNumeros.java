package exercicioDeInteger;

import java.util.Scanner;

public class ExecutaMultiplicacaoDoisNumeros {
	private static Scanner teclado;

	public static void main(String[] args) {
		teclado = new Scanner(System.in);
		MultiplicacaoDoisNumeros multiplicacao = new MultiplicacaoDoisNumeros();

		System.out.print("Digite um numero: ");
		multiplicacao.setNumero1(teclado.nextInt());

		System.out.print("Digite outro numero: ");
		multiplicacao.setNumero2(teclado.nextInt());

		System.out.println("A multiplicação de " + multiplicacao.getNumero1() + " * " + multiplicacao.getNumero2()
				+ " = " + multiplicacao.multiplicacaoDoisNumeros());

	}

}
