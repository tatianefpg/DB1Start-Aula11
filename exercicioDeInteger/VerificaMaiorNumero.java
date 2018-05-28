package exercicioDeInteger;

public class VerificaMaiorNumero {
	private Integer numero1;
	private Integer numero2;

	public int verificaMaiorNumero() {
		if (numero1 > numero2)
			return numero1;
		else if (numero2 > numero1)
			return numero2;
		else
			return 0;
	}

	public Integer getNumero1() {
		return numero1;
	}

	public void setNumero1(Integer numero1) {
		this.numero1 = numero1;
	}

	public Integer getNumero2() {
		return numero2;
	}

	public void setNumero2(Integer numero2) {
		this.numero2 = numero2;
	}

}
