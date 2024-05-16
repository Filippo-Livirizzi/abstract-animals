package org.lesson.java.abstrac;

public  class Delfino extends Animali implements Nuoto {
	
	public void nuoto() {
		System.out.println("Sto nuotando!!!");
	}

@Override
public void verso() {
System.out.println("verso delfino");
}

@Override
public void mangia() {
System.out.println("pesci");
}

} 


