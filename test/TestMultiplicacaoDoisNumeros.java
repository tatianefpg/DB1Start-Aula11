package test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import exercicioDeInteger.MultiplicacaoDoisNumeros;

public class TestMultiplicacaoDoisNumeros {

	MultiplicacaoDoisNumeros multiplicacao1 = new MultiplicacaoDoisNumeros();
	MultiplicacaoDoisNumeros multiplicacao2 = new MultiplicacaoDoisNumeros();

	@Before
	public void init() {
		multiplicacao1.setNumero1(1);
		multiplicacao1.setNumero2(5);
		multiplicacao2.setNumero1(10);
		multiplicacao2.setNumero2(15);
	}

	@Test
	public void TestmultiplicacaoDoisNumeros() {
		Assert.assertTrue(5 == multiplicacao1.multiplicacaoDoisNumeros());
		Assert.assertTrue(150 == multiplicacao2.multiplicacaoDoisNumeros());
		Assert.assertTrue(5 == multiplicacao1.getNumero2());

	}
}
