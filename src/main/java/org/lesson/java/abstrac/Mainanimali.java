package org.lesson.java.abstrac;

public  class Mainanimali  {

	public static void main(String[] args) {
		
		
		
	//------------	DELFINO -------------
		Animali delfino = new Delfino();
		System.out.println("Il Delfino dorme: ");
		delfino.dormi();
		System.out.println("MANGIA: ");
		delfino.mangia();
		System.out.println("IL SUO VERSO E': ");
		delfino.verso();
	//------------	ACQUILA -------------	
		Animali acquila = new Acquila();
		System.out.println("L'Acquila dorme: ");
		acquila.dormi();
		System.out.println("MANGIA: ");
		acquila.mangia();
		System.out.println("IL SUO VERSO E'");
		acquila.verso();
	//------------	CANE -------------
		Animali cane = new Cane();
		System.out.println("Il Cane dorme: ");
		cane.dormi();
		System.out.println("MANGIA: ");
		cane.mangia();
		System.out.println("IL SUO VERSO E'");
		cane.verso();
	//------------	PASSEROTTO -------------
		Animali passerotto = new Passerotto();
		System.out.println("Il Passerotto dorme: ");
		passerotto.dormi();
		System.out.println("MANGIA: ");
		passerotto.mangia();
		System.out.println("IL SUO VERSO E'");
		passerotto.verso();
		
	}

}
