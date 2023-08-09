package test.git;

public class Probing implements TestingInterface {
	
	String frase="prueba de interfaz";
	
	
	
	public Probing() {
	}



	@Override
	public void hiTest() {
		// TODO Auto-generated method stub
		System.out.println(frase);

	}
	
	@Override
	public void byeTest() {
		
		System.out.println("bye");
	}

}
