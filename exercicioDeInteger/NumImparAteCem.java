package exercicioDeInteger;

import java.util.ArrayList;

public class NumImparAteCem {
	private int numero;
	private ArrayList<Integer> numeros = new ArrayList<>();

	public ArrayList<Integer> calculaNumImparAteCem() {
		for (int i = numero; i <= 100; i++) {
			if (i % 2 != 0) {
				numeros.add(i);
			}
		}
		return numeros;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

}
