package esercizi;

import java.util.Scanner;

public class esercizio_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		While();
	}

	public static void While() {
		Scanner sc = new Scanner(System.in);
			while (true) {
				System.out.print("inserisci una scritta: ");
				String x = sc.nextLine();
				if(x.equals(":q")) {
					break;
				}
				else {
					String[] stringArr = x.split("");
				for (int i = 0; i < stringArr.length; i++) {
				System.out.print(stringArr[i] + ",");
				}
				
					
			} 
			System.out.println();
		}
		
		System.out.println("fatto!!");

	}
	
}
