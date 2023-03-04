//Deklariramo javni razred
public class Motor {
	
    protected String ime;
    private int moc;
    private int obrati;
	protected boolean turbo;
    
	// Javni konstruktor
	// Vhodni parametri: ime, moc ,obrati
	// Potem/opis: ustvari nov objekt tipa Motor
	// Vrne vrednost: nov objekt
   public Motor(String ime, int moc) {
        this.ime = ime;
        this.moc = moc;
        this.obrati = 0;
		this.turbo=true;
		}

	// Javna metoda za povečanje obratov
	// Vhodni parametri: dodatniObrati
	// Potek/Opis: prišteje dodatne obrate
	// Vrne vrednost: števila povečanih obratov
    public int povecajObrate(int dodatniObrati) throws Exception {
		
		System.out.println("Obrati pred dodajanjem " + obrati);
		
		// Če je turbo vključen , dodam obrate
		if(turbo) {
			
			// prištejemo dodatne obrate
			obrati += dodatniObrati;
			System.out.println("Obrati motorja " + ime + " so povečani na " + obrati);
			return obrati;
		}
			
		else {
			
			// vrnemo izjemo za neuspešno dodajanje obratov
			throw new Exception("Brez dodatnih obratov!");
		}
    }
		
	// Javna getter metoda, ki vrne število obratov
	// Vhodni parametri: /
	// Potek/opis: vrne vrednost
	// Vrne vrednost: število obratov
	public int getObrati() {
		return obrati;
	}
	
	// Javna getter metoda, ki vrne ime
	// Vhodni parametri: /
	// Potek/opis: vrne vrednost
	// Vrne vrednost: ime
	public String getIme() {
		return ime;
	}	
	// Javna getter metoda, ki vrne moč
	// Vhodni parametri: /
	// Potek/opis: vrne vrednost
	// Vrne vrednost: moč
	public int getMoc() {
		return moc;
	}
}
