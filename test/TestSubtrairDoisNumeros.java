package test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import exercicioDeInteger.SubtrairDoisNumeros;

public class TestSubtrairDoisNumeros {

	SubtrairDoisNumeros subtrair1 = new SubtrairDoisNumeros();
	SubtrairDoisNumeros subtrair2 = new SubtrairDoisNumeros();

	@Before
	public void init() {
		subtrair1.setNumero1(1);
		subtrair1.setNumero2(5);
		subtrair2.setNumero1(10);
		subtrair2.setNumero2(15);
	}

	@Test
	public void TestSubtrairNumero() {
		Assert.assertTrue(-4 == subtrair1.subtrairNumero());
		Assert.assertTrue(-5 == subtrair2.subtrairNumero());
		Assert.assertTrue(5 == subtrair1.getNumero2());

	}
}
