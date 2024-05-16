package org.lesson.java.abstrac;

public class Passerotto extends Animali implements Volo {

public void volo() {
	System.out.println("Sto volando!!!!!");
}
	public void verso() {
		System.out.println("cinguettio");
		}
	@Override
	public void mangia() {
	System.out.println("semi");
	}
}
