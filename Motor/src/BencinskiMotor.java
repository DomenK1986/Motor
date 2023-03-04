/* 	Avtor: Domen Koprivnik
	Ime datoteke: BencinskiMotor.java

*/	
// Deklariramo javni razred, ki razširja razred Motor
// in implementira vmesnik StarostMotorja
public class BencinskiMotor extends Motor implements StarostMotorja {
	
	// Vse lastnosti nadrazreda se prenesejo-....
	;
	//definiramo nove lastnosti.sa
    private int prostornina;
	private boolean odprtRezervoar;
	private int starostMotorja;

// Javni konstruktor
	// Vhodni parametri: prostornina
	// Potem/opis: ustvari nov objekt tipa Bencinski motor
	// Vrne vrednost: nov objekt.
	
	
    public BencinskiMotor(String ime, int moc, int prostornina, int ms ) {
        super(ime, moc);
        this.prostornina = prostornina;
		this.odprtRezervoar = true;
		starostMotorja = ms;
    }

	// Javna metoda, ki dolije bencin
	// Vhodni parametri: količina dolitega bencinabencina
	// Potem/opis: dolije bencin
	// Vrne vrednost: količine dolitega bencina
	
    public int dodajBencin(int litri) throws Exception {
		
		System.out.println("Dolil bom  " + litri + " goriva");
		
		// Poskusil bom doliti gorivo
		if(odprtRezervoar) {
			
			// prištejemo količino dolitega goriva
			 prostornina += litri;
			
			System.out.println("Motorju " + ime + " sem dolil " + litri + " litrov bencina.");
			System.out.println("Količina vsebine po polnjenju: " + prostornina);
		}
		else {
			
			// vrnemo izjemo za neuspešno polnjenje
			throw new Exception("Rezervoar je zaprt!");
		}
		
		// vrnemo količino goriva
		return prostornina;
	}
	
	// Javna getter metoda, ki vrne ime in obrate
	// Vhodni parametri: /
	// Potek/opis: vrne vrednosti
	// Vrne vrednost: niz z imenom in obrati vsebine
	public String getImeObrati() {
	
		return ime + ", " + getObrati();
	
	}	
	
		// Implementiramo metodo, ki vrne starost motorja
		// in jo predpisuje vmesnik StarostMotorja
		// Vhodni parametri: /
		// Potek/opis: vrne starost
		// Vrne vrednost: int - getStarostMotorja
		public int getStarostMotorja() {
	
		return starostMotorja;
	
		}
	}