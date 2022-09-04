package oppgaver300822;

import static javax.swing.JOptionPane.*;
import java.util.Scanner;

public class OppgB5a {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Poeng:"); 
		String inTxt = input.nextLine();
		int inNr = java.lang.Integer.parseInt(inTxt) ;
	
		String utTxt = "";
		
		if (inNr < 0 || inNr > 100) {
			
			utTxt = "Du har tastet inn en ugyldig verdi" ;
			
		}else {
			
			if(inNr >= 90) {
				utTxt = "Du har fått karakteren: A" ;
			} else if(inNr >= 80) {
				utTxt = "Du har fått karakteren: B" ;
			} else if(inNr >= 60) {
				utTxt = "Du har fått karakteren: C" ;
			} else if(inNr >= 50) {
				utTxt = "Du har fått karakteren: D" ;
			} else if(inNr >= 40) {
				utTxt = "Du har fått karakteren: E" ;
			} else if(inNr >= 0) {
				utTxt = "Du har fått karakteren: F" ;
			}
			
		}
		
		System.out.println(utTxt);
	}
}
