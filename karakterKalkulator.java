package no.hvl.dat100;

import static java.lang.Integer.*;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class karakterKalkulator {

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {

			String txtKarakter = showInputDialog("Skriv inn poeng");

			int poengSum = parseInt(txtKarakter);

			if (poengSum <= 39 && poengSum >= 0) {
				System.out.println("Karakter F");

			}

			else if (poengSum <= 49 && poengSum >= 40) {
				System.out.println("Karakter E");

			}

			else if (poengSum <= 59 && poengSum >= 50) {
				System.out.println("Karakter D");

			}

			else if (poengSum <= 79 && poengSum >= 60) {
				System.out.println("Karakter C");
			}

			else if (poengSum <= 89 && poengSum >= 80) {
				System.out.println("Karakter B");
			}

			else if (poengSum <= 100 && poengSum >= 90) {
				System.out.println("Karakter A");
			}

			else {
				
				
				System.out.println("Ulovlig poengsum, prøv igjen");
				
				showMessageDialog(null, "Skriv på nytt");
				i--;
			}

		}

	}

	}




