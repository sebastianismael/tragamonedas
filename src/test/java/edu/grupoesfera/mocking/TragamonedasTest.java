package edu.grupoesfera.mocking;


import org.junit.Assert;
import org.junit.Test;
import static org.mockito.Mockito.mock;

public class TragamonedasTest {

	@Test
	public void siLosTresTamboresTienenElMismoValorDeberiaDarPremio(){
		
		Tragamonedas maquinita = new Tragamonedas(new TamborFactory());
		maquinita.activar();
		Assert.assertTrue(maquinita.entregaPremio());
	}
}
