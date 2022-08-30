package oppgaver300822;

import static javax.swing.JOptionPane.*;

public class OppgB1 {
	
	public static void main(String[] args) {
		
		String radius = showInputDialog("Skriv inn radiusen på kulen");
		int rad = java.lang.Integer.parseInt(radius);
		double rad3 = Math.pow(rad, 3) ;
		double pi = Math.PI;
		
		int volum = (int) ((4 * pi * rad3)/3);
		
		String txt = "Volumet av kulen er: " + volum; 
		
		showMessageDialog(null, txt);
		
	}
}
