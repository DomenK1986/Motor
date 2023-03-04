/* 
	Ime datoteke:	ElektricniMotorTableModel.java
	Avtor:		  	Domen Koprivnik
	
*/
import javax.swing.table.*;

public class ElektricniMotorTableModel extends DefaultTableModel {
	
	// Konstruktor
	public ElektricniMotorTableModel() {
		
		//kliče konstuktor nadrazdreda
		super();
		
		// V tabelo dodamo stolpce
		addColumn("Ime  motorja");
		addColumn("Moč motorja");
		addColumn("Starost motorja");
		addColumn("Napetost motorja");
		
		
		// Dodamo naslovno vrstico.
		// Ustvarimo statičen seznam objektov
		Object[] vrstica = new Object[] {"Ime motorja","Starost motorja","Moč motorja", "Napetost motorja"};
		
		// Dodamo vrstico v tabelo
		addRow(vrstica) ;
		
	}
	
	// Vhodni parametri: em
	// Potek/opis: Metoda, ki doda el. motor na seznam in v tabelo
	// Vrne vrednost: /
	public void addElektricniMotor (ElektricniMotor em) {
		
		// Ustvarimo statičen seznam objektov
		Object[] vrstica = new Object[] {em.getIme(), em.getMoc(), em.getStarostMotorja(),em.getNapetostMotorja()};
		
		// Dodamo vrstico v tabelo
		addRow(vrstica);
			
	}	
}