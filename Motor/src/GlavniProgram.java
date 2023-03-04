//vključimo paket za delo z  V/I napravami
import java.io.*;
import java.util.*;

/* 	Avtor: Domen Koprivnik
	Ime datoteke: GlavniProgram.java

*/	

//	Deklariramo javni razred
public class GlavniProgram {
	
	//Deklariramo lastnosti za vnos iz konzole
	private static BufferedReader in;
	
	// Deklariramo statično lastnost s seznamom motorjev
	private static ArrayList<BencinskiMotor> motor;
	
	// Deklariramo javno statično metodo, ki se izvede ob zagonu programa
    public static void main(String[] args) {
		
		// Inicializiramo  statično lastnosti za vnos iz konzole
		in = new BufferedReader(new InputStreamReader(System.in));
		
		// Inicializiramo seznam motorjev
		motor = new ArrayList<BencinskiMotor>();
		
		//Spremenljivka z imenom  motorja
		String ime = "";
		
		// Deklariramo objekt tipa Motor
        Motor motor1 = new Motor(ime, 200);
		
		// Deklariramo objekt tipa ElektricniMotor
        ElektricniMotor elektricniMotor = new ElektricniMotor(ime, 300, 24, 1); 
		
		// Ustvarimo nov motor
		BencinskiMotor Corsa = new BencinskiMotor("Corsa", 30, 40, 5);
		
		// Motor dodamo na seznam
		motor.add(Corsa);
		
		// Na seznam dodamo še tri druge motorje
		motor.add(new BencinskiMotor("Fičo",10, 30, 10));
		motor.add(new BencinskiMotor("PešHonda", 0, 40, 36));
		motor.add(new BencinskiMotor("Maibach", 330, 70, 13));
		
		// Preverimo koliko motorjev je v seznamu
		System.out.println("Na seznamu je " + motor.size() + " bencinskih avtomobilov. ");
		
		// Izpišemo vse motorje v seznamu
		for (int c=0; c<motor.size(); c++) {
		
			System.out.println(c + ". Motor: " + motor.get(c).getImeObrati() +  motor.get(c).getStarostMotorja() + " let.");
		}
        
		// Skušamo vprašati uporabnika, katere znamke električnega motorja naj ustvarimo
		
		try {
			System.out.print("Vnesi ime Električnega motorja: ");
			ime= in.readLine();
		}
		// Če je bila sporočena izjema
		catch(Exception e) {
			System.out.print("Napaka pri vnosu: " + e);
			System.out.print("Napaka pri vnosu: " + e);
		}
		
		// Uporabnika vprašamo na katero napetost želimo menjati napetost el. motorja
        
		try {	
			System.out.print("Na katero napetost želimo spremeniti napetost: ");
			int napetost = Integer.parseInt(in.readLine());	
			
			// Menjamo napetost el. motorja
			elektricniMotor.zamenjajNapetost(napetost);
		}
		// Če je bila sporočena izjema		
		catch (Exception e) {
			System.out.print("Napaka pri menjavi napetosti: " + e);
			
		} 
        
		// Električnemu motorju skušamo povečati obrate
		
		try {
			System.out.print("Za katero število želimo povečati obrate: ");
			int obrat = Integer.parseInt(in.readLine());
				
			//Povečamo obrate el. motorja
			elektricniMotor.povecajObrate(obrat);
		}  
		
		// Če je bila sporočena izjema
		catch (Exception e) {
			System.out.print("Napaka pri povečevanju obratov: " + e);
		}   
		
		// Skušamo vprašati uporabnika,  s kakšnim imenom Bencinski motor naj ustvarimo
		
		try {
			System.out.print("Vnesi ime Bencinskega motorja: ");
			ime= in.readLine();
		}
		// Če je bila sporočena izjema
		
		catch(Exception e) {
			System.out.print("Napaka pri vnosu: " + e);
		}
		
		// Deklariramo objekt tipa Bencinski motor
        BencinskiMotor bencinskiMotor = new BencinskiMotor(ime, 250, 1500, 15);
		
		// Motorju skušamo dodati bencin
		try {
			
				System.out.print("Koliko bencina želimo dodati?: ");
				int bencin = Integer.parseInt(in.readLine());
				//Motorju dodamo bencin
			    bencinskiMotor.dodajBencin(bencin);
		}
		
		// Če je bila sporočena izjema
		catch (Exception e) {
			System.out.print("Napaka pri dodajanju bencina: " + e);
			
		} 
		
		// Motorju skušamo povečati obrate
		
		try {
				System.out.print("Za katero število želimo povečati obrate: ");
				int obrat1 = Integer.parseInt(in.readLine());
			
				//Povečamo obrate ben. motorja
			    bencinskiMotor.povecajObrate(obrat1);
			
		} 
		
		// Če je bila sporočena izjema
		catch (Exception e) {
			System.out.print("Napaka pri povečevanju obratov: " + e);	
		} 
	}	
}