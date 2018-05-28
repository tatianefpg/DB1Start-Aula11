package exercicioDeInteger;

import java.util.Scanner;

public class ExecutaDivisaoDoisNumeros {
	private static Scanner teclado;

	public static void main(String[] args) {
		teclado = new Scanner(System.in);
		DivisaoDoisNumeros divisao = new DivisaoDoisNumeros();

		System.out.print("Digite um numero: ");
		divisao.setNumero1(teclado.nextInt());

		System.out.print("Digite outro numero: ");
		divisao.setNumero2(teclado.nextInt());

		System.out.println("A multiplicação de " + divisao.getNumero1() + " / " + divisao.getNumero2() + " = "
				+ divisao.divisaoDoisNumeros());

	}

}
