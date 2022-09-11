package oppgaver300822;

import static javax.swing.JOptionPane.*;

public class OppgB2 {
	
	public static void main(String[] args) {
		
		//henter ut info og gjør om til int 
		String prisT = showInputDialog("Hva er prisen?");
		String belopT = showInputDialog("Hva betalte de?");
		int pris = java.lang.Integer.parseInt(prisT);
		int belop = java.lang.Integer.parseInt(belopT);
		
		//Regner ut 
		int def = belop - pris;
		int p10 = def/10;
		int p1 = def%10;
		
		String txt = "Rest 10-kr: " + p10 + ", Rest 1-kr: " + p1;
		
		showMessageDialog(null, txt);
	}
}
