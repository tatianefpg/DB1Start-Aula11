package exercicioDeInteger;

import java.util.ArrayList;
import java.util.Scanner;

public class ExecutadoraNumeroImparAteCem {

	private static Scanner scan;

	public static void main(String[] args) {

		scan = new Scanner(System.in);
		NumImparAteCem verifica = new NumImparAteCem();
		ArrayList<Integer> listaResultante = new ArrayList<>();

		System.out.print("Digite um numero: ");

		verifica.setNumero(scan.nextInt());

		listaResultante = verifica.calculaNumImparAteCem();

		for (int i = 0; i < listaResultante.size(); i++) {
			System.out.print(listaResultante.get(i) + " ");
		}

	}
}
