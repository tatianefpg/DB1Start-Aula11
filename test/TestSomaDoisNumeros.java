package test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import exercicioDeInteger.SomaDoisNumeros;

public class TestSomaDoisNumeros {

	SomaDoisNumeros soma1 = new SomaDoisNumeros();
	SomaDoisNumeros soma2 = new SomaDoisNumeros();

	@Before
	public void init() {
		soma1.setNumero1(1);
		soma1.setNumero2(5);
		soma2.setNumero1(10);
		soma2.setNumero2(15);
	}

	@Test
	public void TestSomaNumero() {
		Assert.assertTrue(6 == soma1.somaNumero());
		Assert.assertTrue(25 == soma2.somaNumero());
		Assert.assertTrue(5 == soma1.getNumero2());

	}
}
