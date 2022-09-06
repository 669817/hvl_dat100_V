package oppgaverInn060922;

import java.util.Scanner;

public class O3 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Poeng:"); 
		String nT = input.nextLine();
		int n = java.lang.Integer.parseInt(nT) ;
		
		if(n <= 0) {
			System.out.print("Du har skrevet feil tall");
		}
		else {
			long fakn = fak(n) ;
			System.out.print(fakn);
		}
	}
	
	private static long fak (long a) {
		
		long sum = a;
		
		for (int i = 1; i < a; i++) {
			
			sum = sum * (a-i);
		}
		return sum;
	}
}
