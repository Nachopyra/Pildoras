package Pildoras;



public class Uso_Empleado{

		public static void main (String[] args) {
			
			Empleado[] misEmpleados= new Empleado[4];
			
			misEmpleados[0] = new Empleado("Paco Gomez", 85000,1990,12,17);
			misEmpleados[1] = new Empleado("Ana Lopez", 95000,1995,06,02);
			misEmpleados[2] = new Empleado("María Martín", 105000,2002,03,15);
			misEmpleados[3] = new Empleado("Antonio Fernández");
			
			for(Empleado e: misEmpleados) {
				e.subeSueldo(5);
			}
			for(Empleado e: misEmpleados) {
				System.out.println("Nombre: "+e.dameNombre()
				+ " Sueldo: "+ e.dameSueldo() + " Fecha de Alta: "+ e.dameFechaContrato());
			}
		}
}


 
