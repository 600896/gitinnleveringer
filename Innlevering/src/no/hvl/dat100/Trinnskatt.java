package no.hvl.dat100;
import static javax.swing.JOptionPane.*;
public class Trinnskatt {

	public static void main(String[] args) {
		String bruttolonn = showInputDialog("Bruttolønn: ");
		int lonn = Integer.parseInt(bruttolonn);
		
		double trinn = 0;
		double trinn1 = 0.093;
		double trinn2 = 0.241;
		double trinn3 = 0.1152;
		double trinn4 = 0.1452;
		
		if (lonn <=0 && lonn>=164100) {
			showMessageDialog(null,"Din lønn etter skattetrekk: " + lonn*trinn);
		}
		if (lonn <=164100 && lonn>=230950) {
			showMessageDialog(null,"Din lønn etter skattetrekk: " + lonn*trinn1);
		}
		if (lonn <=230950 && lonn>=580650) {
			showMessageDialog(null,"Din lønn etter skattetrekk: " + lonn*trinn2);
		}
		if (lonn <=580650 && lonn>=934050) {
			showMessageDialog(null,"Din lønn etter skattetrekk: " + lonn*trinn3);
		}
		if (lonn <=934050) {
			showMessageDialog(null,"Din lønn etter skattetrekk: " + lonn*trinn4);
		}
			
		}
		
}
