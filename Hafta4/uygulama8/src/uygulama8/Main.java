package uygulama8;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Hangi tur grubuyla ilgileniyorsunuz ? ");
			System.out.println("(1.Amerika,2.Avrupa,3.Asya)");
			String tur = scanner.nextLine();
			while(true) {
			switch(tur) {
			case "1": 
				System.out.println("Amerika Birle�ik Devletleri'nin New York �ehri'nde 5 g�nl�k bir tatil: ");
				System.out.println("G�nl�k konaklama 300 USD");
				
				break;
			case "2": 
				System.out.println("�spanya'n�n Barselona �ehri'nde 3 g�nl�k bir tatil: ");
				System.out.println("G�nl�k konaklama 600 Euro");
				
				break;
			case "3": 
				System.out.println("Tayland'�n Bangkok �ehri'nde 4 g�nl�k bir tatil: ");
				System.out.println("G�nl�k konaklama 400 USD");
				
				break;
			
			}
			
			System.out.println("Sat�n almak istiyor musunuz(e/h) ? ");
			String se�im = scanner.nextLine();
			if(se�im.equals("h")) {
				System.out.println("Sistemden ��k�� yap�l�yor...");
				break;
				
			}
			else if(se�im.equals("e")) {
				System.out.println("�cret kart�n�zdan �ekilmi�tir..");
				break;
			
			}
			else {
				System.out.println("yanl�� giri� yapt�n�z...");
			}
			
	
			}
	
	}

	}

