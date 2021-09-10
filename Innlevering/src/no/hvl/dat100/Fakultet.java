package no.hvl.dat100;

import static javax.swing.JOptionPane.*;


public class Fakultet {
public static void main(String[] args) {
		
		String tall = showInputDialog("Skriv inn tall: ");
		int N = Integer.parseInt(tall);
		int fakultet = 1;
		
		if (N > 0) {
		for (int f = 2; f <= N; f++) {
			fakultet *=f;
		}
		showMessageDialog(null, fakultet);
		}
		else {
			showMessageDialog(null, "Default");
			}
		}

}
