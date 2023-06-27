package esercizio_1;

public class Rettangolo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rettangolo rettangolo1 = new Rettangolo(3,2);
		Rettangolo rettangolo2 = new Rettangolo(5,3);
		
		dueRettangoli(rettangolo1, rettangolo2);
		
	}
	
	
	public int altezza;
	public int larghezza;
	
	public Rettangolo (int altezza , int larghezza){
		this.altezza = altezza;
		this.larghezza = larghezza;
	} 
	
	public int perimetro() {
		
		int	z = (altezza + larghezza) * 2;
		return z;
	}
	
	public int area() {
		
		int z = altezza * larghezza;
		return z;
		
	}
	
	public void stampaRettangolo() {
		System.out.println(perimetro());
		System.out.println(area());
	}
	
	public static void dueRettangoli(Rettangolo x, Rettangolo y) {
		
		int area = x.area() + y.area();
		int perimetro = x.perimetro() + y.perimetro();
		
		System.out.println(x.area());
		System.out.println(x.perimetro());
		System.out.println(y.area());
		System.out.println(y.perimetro());
		System.out.println(perimetro);
		System.out.println(area);
		
	}
}
