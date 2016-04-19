package edu.grupoesfera.mocking;

import java.util.Random;

public class Tambor {
	
	private int valor = 0;
	
	public int obtenerPosicion() {
		return valor;
	}
	
	public void girar() {
		Random ramdom = new Random();
		valor = ramdom.nextInt(8) + 1;
	}

}
