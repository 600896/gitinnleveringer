package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class Karakterskala {

	public static void main(String[] args) {
	final int N = 10;
	for (int j = 1; j <= N; j++) {
		
		String poengsum = showInputDialog("Din poengsum: ");
		double poeng = Double.parseDouble(poengsum);
					
		if (poeng <= 100 && poeng >=90) {
			showMessageDialog(null, "Din karakter: A");
		}
		
		if (poeng <= 89 && poeng >=80) {
			showMessageDialog(null, "Din karakter: B");
		}
		
		if (poeng <= 79 && poeng >=60) {
				showMessageDialog(null, "Din karakter: C");
		} 
		
		if (poeng <= 59 && poeng >=50) {
					showMessageDialog(null, "Din karakter: D");
		}
		if (poeng <= 49 && poeng >=40) {
			showMessageDialog(null, "Din karakter: C");
		}
		if (poeng <=39 && poeng >=0) {
			showMessageDialog(null, "Din karakter: D");
		}
		else {
			showMessageDialog(null, "Default");
			j--;
		}
		}
	}
}
