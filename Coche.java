package Pildoras;

public class Coche {

	private int ruedas;
	private int largo;
	private int ancho;
	private int motor;
	private int pesoPlataforma;
	private String color;
	private int pesoTotal;
	private boolean asientosDeCuero, aireAcondicionado;
	
	public Coche(){
		ruedas=4;
		largo= 2000;
		ancho=300;
		motor=1600;
		pesoPlataforma=500;
	}
	
	public String dameDatosGenerales() {
		return "la plataforma del vehívulo tiene "+ ruedas + " ruedas " +
	" Mide " + largo/1000 + " metros de largo, con un ancho de: " + ancho +" cm. Y un peso de plataforma de " + pesoPlataforma + " kg."; 
	}
	public String dameColor() {
		return "El color del coche es: " + color;
	}
	public void estableceColor(String colorCoche) {
		color=colorCoche;
	}
	public void configuraAsientosDeCuero(String asientosDeCuero) {
		if (asientosDeCuero.equalsIgnoreCase("si")){
			this.asientosDeCuero = true;
		}else {
			this.asientosDeCuero = false;
		}
	} 
	public String dimeAsientos() {
		if(asientosDeCuero==true) {
			return "El coche tiene asientos de cuero";
		}else {
			return "El coche NO tiene asientos de cuero";
		}
	}
	public void configuraAireAcondicionado(String aireAcondicionado) {
		if (aireAcondicionado.equalsIgnoreCase("si")){
			this.aireAcondicionado = true;
		}else {
			this.aireAcondicionado = false;
		}
	} 
	public String dimeAireAcondicionado() {
		if(aireAcondicionado==true) {
			return "El coche tiene AA";
		}else {
			return "El coche NO tiene AA";
		}
	}
}
