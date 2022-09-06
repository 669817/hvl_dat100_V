package oppgaverInn060922;

import static javax.swing.JOptionPane.*;

public class O1 {
	
	public static void main(String[] args) {
		
		String inntT = showInputDialog("Skriv inn bruttoonntekten din");
		int innt = java.lang.Integer.parseInt(inntT);
		
		double trinn0 = 0.00;
		double trinn1 = 0.93;
		double trinn2 = 2.41;
		double trinn3 = 11.52;
		double trinn4 = 14.52;
		
		String txt1 = "Skatten du betaler er: ";
		String txt2 = ", Du betaler skatt på trinn: ";
		
		if ( innt <= 164100) {
			
			int skatt = (int) (innt * trinn0)/100 ;
			
			txt1 += skatt;
			txt2 += 0; 
			
		}else if (innt <= 230950) {
			
			int skatt = (int) (innt * trinn1)/100 ;
			
			txt1 += skatt;
			txt2 += 1;
			
		} else if (innt <= 580650) {
			
			int skatt = (int) (innt * trinn2)/100 ;
			
			txt1 += skatt;
			txt2 += 2;
			
		} else if(innt <= 934050) {
			
			int skatt = (int) (innt * trinn3)/100 ;
			
			txt1 += skatt;
			txt2 += 3; 
			
		} else {
			
			int skatt = (int) (innt * trinn4)/100 ;
			
			txt1 += skatt;
			txt2 += 4; 
			
		}
		
		String txt = txt1 + txt2;
		
		showMessageDialog(null, txt);
	}
}
