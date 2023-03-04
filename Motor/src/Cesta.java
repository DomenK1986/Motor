/* 
	Ime datoteke:	Cesta.java
	Avtor:		  	Domen Koprivnik
	Vhodni podatki: /
	Opis: 			Aplikacija z grafičnim uporabniškim vmesnikom za delo z Motorji
	Izhodni podatki: Okno grafičnega vmesnika
*/

//Uvozimo pakete za delo z GUI
import javax.swing.*;

//uvozimo paket za delo z dogodki
import java.awt.event.*;

// Deklariramo javni razred
public class Cesta extends JFrame implements ActionListener {
	
	// Deklariramo zasebne lastnosti.
	private JPanel povrsina;
	private JButton dodajJButton;
	private JTextField imePolje,mocMotorjaPolje,starostMotorjaPolje,napetostPolje;
	private JTable tabela;
	private ElektricniMotorTableModel modelTabele;
	
	// Deklariramo javno statično metodo, ki se izvede ob zagonu programa
	// Vhodni parametri: vhodni parametri iz konzole
	// Potek/opis: ustvari novo okno
	// Vrne vrednost: n/
	public static void main(String[] args) {
		
	
		Cesta m = new Cesta("Cesta ");
	}
	
	// Javni konstruktor
	// Vhodni parametri: n - naslov okna
	// Potek/opis: vrne objekt tipa Cesta
	// Vrne vrednost: vrne objekt tipa Cesta
	public Cesta(String n) {
		
		// Kličemo konstruktor nadrazreda
		super(n);
		
		// Inicializiramo lastnosti
		povrsina = new JPanel() ;
		dodajJButton = new JButton("Dodaj motor na cesto");
		imePolje = new JTextField();
		mocMotorjaPolje = new JTextField();
		starostMotorjaPolje = new JTextField();
		napetostPolje = new JTextField();

		
		modelTabele = new ElektricniMotorTableModel();
		tabela = new JTable(modelTabele);
		
		// dodam  cesto
		add(povrsina);
		
		// Gumbu za dodajanje dodamo action listener
		dodajJButton.addActionListener(this);
		
		// dodamo gumb, vnosna polja in tabelo na površino
		povrsina.add(new JLabel ("Ime motorja in napetost motorja:"));
		povrsina.add(imePolje);
		povrsina.add(new JLabel ("Moč motorja:"));
		povrsina.add(mocMotorjaPolje);
		povrsina.add(new JLabel ("Starost motorja:"));
		povrsina.add(starostMotorjaPolje);
		povrsina.add(new JLabel ("Napetost motorja:"));
		povrsina.add(napetostPolje);
		povrsina.add(dodajJButton);
		povrsina.add(tabela);
		
		
		// Pokažemo okno
		setVisible(true);
		
		// Nastavimo velikost
		setSize(1000,1000);
		
		//Nastavimo obnašanje križca
		setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		
		System.out.println("Ustvarjam nov objekt Cesta");
	}
	
	// Metoda, ki jo predpisuje vmesnik ActionListener
	// Vhodni parametri: dogodek
	// Potek/opis: doda motor na seznam - v tabelo
	// Vrne vrednost: /
	
	public void actionPerformed(ActionEvent ae) {
		
		System.out.println("Dodajam motor...");
		System.out.println("Ime motorja je " + imePolje.getText());
		System.out.println("Moč motorja je " + mocMotorjaPolje.getText());
		System.out.println("Starost motorja  je " + starostMotorjaPolje.getText());
		System.out.println("Moč motorja je " + napetostPolje.getText());
		
		
		
		// Dodamo objekt v seznam
		//modelTabele.addElektricniMotor(Tesla);
		modelTabele.addElektricniMotor(new ElektricniMotor(imePolje.getText(), Integer.parseInt(mocMotorjaPolje.getText()), Integer.parseInt(starostMotorjaPolje.getText()), Integer.parseInt(napetostPolje.getText())));
		
	}
}