/**
 *
 * @author Joaquin Urbano Polo
 */

public class Lib {

    public void metodoAlumno1(){
        System.out.println("metodo 1");
    }

    public void metodoAlumno2(){
        metodo3();
    }

	public void metodo3(){

		System.out.println("metodo 3");		
	}

    public void metodoComunitario(){
        System.out.println("Cambio en metodo3");
    }
}
