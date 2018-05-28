package exercicioDeInteger;

import java.util.Scanner;

public class ExecutaSubtrairDoisNumeros {
	private static Scanner teclado;

	public static void main(String[] args) {
		teclado = new Scanner(System.in);
		SubtrairDoisNumeros subtrair = new SubtrairDoisNumeros();

		System.out.print("Digite um numero: ");
		subtrair.setNumero1(teclado.nextInt());

		System.out.print("Digite outro numero: ");
		subtrair.setNumero2(teclado.nextInt());

		System.out.println("A subtração de " + subtrair.getNumero1() + " + " + subtrair.getNumero2() + " = "
				+ subtrair.subtrairNumero());

	}

}
