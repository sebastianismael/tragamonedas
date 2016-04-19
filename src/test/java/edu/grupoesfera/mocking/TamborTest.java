package edu.grupoesfera.mocking;

import org.junit.Assert;
import org.junit.Test;

public class TamborTest {

	@Test
	public void obtenerValorSinGirarElTamborDeveriaDevolverCero(){
		Tambor tambor = new Tambor();
		Assert.assertEquals(0, tambor.obtenerPosicion());
	}
	
	@Test
	public void obtenerValorDespuesDeGirarElTamborDeveriaDevolverEntreUnoYOcho(){
		Tambor tambor = new Tambor();
		tambor.girar();
		Assert.assertTrue(tambor.obtenerPosicion() >= 1 && tambor.obtenerPosicion() <= 8);
	}
}
