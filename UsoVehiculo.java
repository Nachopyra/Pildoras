package Pildoras;

import javax.swing.*;

public class UsoVehiculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Coche miCoche1 = new Coche();
		
		miCoche1.estableceColor("Rojo");
		
		Furgoneta miFurgoneta1 = new Furgoneta(7, 580);
		
		miFurgoneta1.estableceColor("Azul");
		
		miFurgoneta1.configuraAsientosDeCuero("si");
		miFurgoneta1.configuraAireAcondicionado("si");
		
		
		
		System.out.println(miCoche1.dameDatosGenerales());
		System.out.println(miFurgoneta1.dameDatosGenerales() + miFurgoneta1.dimeDatosFurgoneta());
	}

}
