package no.hvl.dat100;
import static javax.swing.JOptionPane.*;


public class loggInn {
	
	
public static void main(String[] args) {
		
		String brukernavn = showInputDialog("Brukernavn :");

		String passord = showInputDialog("Passord :");

	
		
		if (brukernavn.equals("Vithu") && passord.equals("Semme")){
			System.out.println("Logget inn");
			
		}
		else {
			System.out.println("Brukernavn eller passordet er feil");
		}
}


}