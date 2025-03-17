import classiMie.DynamicArray;

public class Main {

	public static void main(String[] args) {
		
		DynamicArray a = new DynamicArray();
		a.add(5);
		a.add("giorgio");
		a.printArray();
		a.remove(1);
		a.set(0, "ciao");
		a.printArray();
	}
}
