package exercicioDeInteger;

import java.util.Scanner;

public class ExecutaSomaDoisNumeros {
	private static Scanner teclado;

	public static void main(String[] args) {
		teclado = new Scanner(System.in);
		SomaDoisNumeros soma = new SomaDoisNumeros();

		System.out.print("Digite um numero: ");
		soma.setNumero1(teclado.nextInt());

		System.out.print("Digite outro numero: ");
		soma.setNumero2(teclado.nextInt());

		System.out.println("A soma de " + soma.getNumero1() + " + " + soma.getNumero2() + " = " + soma.somaNumero());

	}

}
