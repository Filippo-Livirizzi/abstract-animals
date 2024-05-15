package org.lesson.java.abstrac;

public  class Mainanimali  {

	public static void main(String[] args) {
		Animali delfino = new Delfino();
		Animali acquila = new Acquila();
		Animali cane = new Cane();
		Animali passerotto = new Passerotto();
	//------------	DELFINO -------------
		System.out.println("Il Delfino dorme: ");
		delfino.dormi();
		System.out.println("MANGIA: ");
		delfino.mangia();
		System.out.println("IL SUO VERSO E': ");
		delfino.verso();
	//------------	ACQUILA -------------	
		System.out.println("L'Acquila dorme: ");
		acquila.dormi();
		System.out.println("MANGIA: ");
		acquila.mangia();
		System.out.println("IL SUO VERSO E'");
		acquila.verso();
	//------------	CANE -------------
		System.out.println("Il Cane dorme: ");
		cane.dormi();
		System.out.println("MANGIA: ");
		cane.mangia();
		System.out.println("IL SUO VERSO E'");
		cane.verso();
	//------------	PASSEROTTO -------------
		System.out.println("Il Passerotto dorme: ");
		passerotto.dormi();
		System.out.println("MANGIA: ");
		passerotto.mangia();
		System.out.println("IL SUO VERSO E'");
		passerotto.verso();
		
	}

}
