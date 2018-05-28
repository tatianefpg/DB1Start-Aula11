package exercicioDeInteger;

public class VerificaNumeroPar {
	private Integer numero;

	public int isPar() {
		if (numero % 2 == 0)
			return 1;
		else
			return 0;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

}
