package edu.grupoesfera.mocking;


import org.junit.Assert;
import org.junit.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TragamonedasTest {

	@Test
	public void siLosTresTamboresTienenElMismoValorDeberiaDarPremio(){
		
		TamborFactory factory = mock(TamborFactory.class);
		Tambor tambor1Mock = mock(Tambor.class);
		Tambor tambor2Mock = mock(Tambor.class);
		Tambor tambor3Mock = mock(Tambor.class);
		
		when(factory.crearTambor(1)).thenReturn(tambor1Mock);
		when(factory.crearTambor(2)).thenReturn(tambor2Mock);
		when(factory.crearTambor(3)).thenReturn(tambor3Mock);
		
		when(tambor1Mock.obtenerPosicion()).thenReturn(3);
		when(tambor2Mock.obtenerPosicion()).thenReturn(3);
		when(tambor3Mock.obtenerPosicion()).thenReturn(3);
		
		Tragamonedas maquinita = new Tragamonedas(factory);
		maquinita.activar();
		Assert.assertTrue(maquinita.entregaPremio());
	}
}
