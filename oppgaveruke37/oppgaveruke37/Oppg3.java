package oppgaveruke37;

import javax.swing.JOptionPane;
import easygraphics.*;

public class Oppg3 extends EasyGraphics {
	
	private int xGr = 400;
	private int yGr = 150;
	
	public static void main(String[] args) {
		launch(args);
	}
	
	public void run() {
		
		int yRec = yGr/3;
		
		makeWindow("Grafikk", xGr, yGr);
		soyle(0, 0, 28, yRec);
		soyle(0, yRec, 38, yRec);
		soyle(0, yRec * 2, 46, yRec);
		
	}
	
	private void soyle(int startx, int starty, int xPr, int y) {
		
		int xRec1 = (xGr/100) * xPr;		
		int xPr2 = 100 - xPr;
		int xRec2 = (xGr/100) * xPr2;
		int startx2 = startx + xRec1; 
		
		rec(startx, starty, xRec1, y, 0, 255, 0);
		rec(startx2, starty, xRec2, y, 255, 0, 0);
	}
	
	private void rec(int xS, int yS, int x, int y, int r, int g, int b) {
		setColor(0, 0, 0);
		fillRectangle(xS, yS, x, y);
		setColor(r, g, b);
		fillRectangle(xS +2, yS +2, x -4, y -4);
	}
}
