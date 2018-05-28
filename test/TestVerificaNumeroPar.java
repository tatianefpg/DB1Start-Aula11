package test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import exercicioDeInteger.VerificaNumeroPar;

public class TestVerificaNumeroPar {

	VerificaNumeroPar numero1 = new VerificaNumeroPar();
	VerificaNumeroPar numero2 = new VerificaNumeroPar();

	@Before
	public void init() {
		numero1.setNumero(1);
		numero2.setNumero(4);
	}

	@Test
	public void TestSomaNumero() {
		Assert.assertTrue(0 == numero1.isPar());
		Assert.assertTrue(1 == numero2.isPar());
		Assert.assertTrue(1 == numero1.getNumero());

	}
}
