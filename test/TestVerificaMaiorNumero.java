package test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import exercicioDeInteger.VerificaMaiorNumero;

public class TestVerificaMaiorNumero {

	VerificaMaiorNumero numero1 = new VerificaMaiorNumero();
	VerificaMaiorNumero numero2 = new VerificaMaiorNumero();
	VerificaMaiorNumero numero3 = new VerificaMaiorNumero();

	@Before
	public void init() {
		numero1.setNumero1(1);
		numero1.setNumero2(1);
		numero2.setNumero1(2);
		numero2.setNumero2(10);
		numero3.setNumero1(5);
		numero3.setNumero2(7);
	}

	@Test
	public void TestSomaNumero() {
		Assert.assertTrue(0 == numero1.verificaMaiorNumero());
		Assert.assertTrue(10 == numero2.verificaMaiorNumero());
		Assert.assertTrue(7 == numero3.verificaMaiorNumero());
		Assert.assertTrue(1 == numero1.getNumero1());
		Assert.assertTrue(1 == numero1.getNumero2());
		Assert.assertTrue(2 == numero2.getNumero1());
		Assert.assertTrue(10 == numero2.getNumero2());
		Assert.assertTrue(5 == numero3.getNumero1());
		Assert.assertTrue(7 == numero3.getNumero2());

	}
}
