package no.hvl.dat100;
import static javax.swing.JOptionPane.showInputDialog;


public class fakultet {

public static void main(String[] args) {
	   
String txtTall = showInputDialog("Skriv inn tall");

	      
int n = Integer.parseInt(txtTall);

	int j = 1;

	for (int i=1; i<=n; i++) {
 j =i*j;


	 

}
	System.out.println(n + "! = " + j);
}

}

