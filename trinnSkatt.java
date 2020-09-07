package no.hvl.dat100;


import static java.lang.Double.parseDouble;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class trinnSkatt {
	public static void main(String[] args) {
		
		String txtLønn = showInputDialog("Skriv inn lønn");

		double lønn = parseDouble(txtLønn);
		
		if (lønn >= 0 && lønn <= 164101) {
			
			showMessageDialog(null,"Du betaler ingenting");
			
			
		}

		else if ( lønn >= 164101 && lønn <= 230950) {
			double skatt = lønn*0.0093;
			double resultat = skatt - lønn;
			String utTxt = "Du skal betale " + resultat + "kr i skatt";
			showMessageDialog(null,utTxt);
		}

		else if ( lønn >= 230951 && lønn <= 580650) {
			double skatt = lønn*0.024;
			double resultat = skatt - lønn;
			String utTxt = ("Du skal betale" + resultat + "kr i skatt");
			showMessageDialog(null,utTxt);
		}
		
		else if( lønn >= 580651 && lønn <= 934050) {
			double skatt = lønn*0.1152;
			double resultat = skatt - lønn;
			String utTxt = ("Du skal betale" + resultat + "kr i skatt");
			showMessageDialog(null,utTxt);
		}
		else if (lønn >= 934051) {
			double skatt = lønn*0.452;
			double resultat = skatt - lønn;
			String utTxt = ("Du skal betale" + resultat + "kr i skatt");
			showMessageDialog(null,utTxt);
		}
		
			
			
			
		
	}
}
