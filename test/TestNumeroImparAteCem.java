package test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import exercicioDeInteger.NumImparAteCem;

public class TestNumeroImparAteCem {

	NumImparAteCem numero = new NumImparAteCem();
	NumImparAteCem numero2 = new NumImparAteCem();

	@Before
	public void init() {
		numero.setNumero(0);
		numero2.setNumero(50);
	}

	@Test
	public void TestcalculaNumImparAteCem() {
		Assert.assertTrue(50 == numero.calculaNumImparAteCem().size());
		Assert.assertTrue(25 == numero2.calculaNumImparAteCem().size());
		Assert.assertTrue(51 == numero2.calculaNumImparAteCem().get(0));

	}
}
