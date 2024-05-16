package org.lesson.java.abstrac;

public class Acquila extends Animali implements Volo {
	public void volo() {
		System.out.println("Sto volando!!!!!");
	}


	public void verso() {
		System.out.println("Stridio");
		}
	@Override
	public void mangia() {
	System.out.println("carne");
	}

}
