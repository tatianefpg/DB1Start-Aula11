package test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import exercicioDeInteger.DivisaoDoisNumeros;

public class TestDivisaoDoisNumeros {

	DivisaoDoisNumeros divisao1 = new DivisaoDoisNumeros();
	DivisaoDoisNumeros divisao2 = new DivisaoDoisNumeros();

	@Before
	public void init() {
		divisao1.setNumero1(5);
		divisao1.setNumero2(1);
		divisao2.setNumero1(10);
		divisao2.setNumero2(5);
	}

	@Test
	public void TestdivisaoDoisNumeros() {
		Assert.assertTrue(5 == divisao1.divisaoDoisNumeros());
		Assert.assertTrue(2 == divisao2.divisaoDoisNumeros());
		Assert.assertTrue(1 == divisao1.getNumero2());

	}
}
