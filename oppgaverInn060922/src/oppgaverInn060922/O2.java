package oppgaverInn060922;

import java.util.Scanner;

public class O2 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		for (int i = 1; i <= 3; i++) {
		
			System.out.print("Poeng:"); 
			String inTxt = input.nextLine();
			int inNr = java.lang.Integer.parseInt(inTxt) ;
		
			String utTxt = "";
			String person = "Elev Nr" + i ; 
			
			if (inNr < 0 || inNr > 100) {
				
				utTxt = person + " har tastet inn en ugyldig verdi, tast inn på nytt" ;
				i = i - 1;
				
			}else {
				
				if(inNr >= 90) {
					utTxt = person + " har fått karakteren: A" ;
				} else if(inNr >= 80) {
					utTxt = person + " har fått karakteren: B" ;
				} else if(inNr >= 60) {
					utTxt = person + " har fått karakteren: C" ;
				} else if(inNr >= 50) {
					utTxt = person + " har fått karakteren: D" ;
				} else if(inNr >= 40) {
					utTxt = person + " har fått karakteren: E" ;
				} else if(inNr >= 0) {
					utTxt = person + " har fått karakteren: F" ;
				}
				
			}
			
			System.out.println(utTxt);
		}
	}
}
