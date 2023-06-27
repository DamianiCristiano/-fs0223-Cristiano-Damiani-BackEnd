package esercizio_1;

public class SIM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SIM numero1 = new SIM (38721963 , 10);
		
		numero1.stampaDati();
	}
	
	public int numero;
	public int credito;
	
	
	chiamata[] List = {
	  	  new chiamata (10 , 3729817),
		  new chiamata (12 , 3732131),
		  new chiamata (2 , 3729817),
		  new chiamata (3 , 3729817),
		  new chiamata (13 , 3729817)
};
	
	
	public SIM (int numero, int credito){
		this.numero = numero;
		this.credito = 0;
	}
	
	public void stampaDati () {
		for (chiamata i : List) {
			System.out.println(i.chiamata + " " + i.numero);
		}
		System.out.println(numero);
		System.out.println(credito);
	}
	
}
