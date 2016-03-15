/**
 *
 * @author Joaquin Urbano Polo
 */

public class Lib {

    public void metodoAlumno1(){
        System.out.println("modificado por alumno 1"); // alumno
    }

    public void metodoAlumno2(){
        metodo3();
    }

	public void metodo3(){

		System.out.println("metodo 3");		
	}

    public void metodoComunitario(){

        System.out.println("cambio en master y metodo3");
	//Modificaciones alumno 1
	System.out.println("Alumno 1 inserta esta sentencia");

    }
}
