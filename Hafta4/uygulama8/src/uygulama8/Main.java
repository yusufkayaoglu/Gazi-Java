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
				System.out.println("Amerika Birleþik Devletleri'nin New York Þehri'nde 5 günlük bir tatil: ");
				System.out.println("Günlük konaklama 300 USD");
				
				break;
			case "2": 
				System.out.println("Ýspanya'nýn Barselona Þehri'nde 3 günlük bir tatil: ");
				System.out.println("Günlük konaklama 600 Euro");
				
				break;
			case "3": 
				System.out.println("Tayland'ýn Bangkok Þehri'nde 4 günlük bir tatil: ");
				System.out.println("Günlük konaklama 400 USD");
				
				break;
			
			}
			
			System.out.println("Satýn almak istiyor musunuz(e/h) ? ");
			String seçim = scanner.nextLine();
			if(seçim.equals("h")) {
				System.out.println("Sistemden çýkýþ yapýlýyor...");
				break;
				
			}
			else if(seçim.equals("e")) {
				System.out.println("Ücret kartýnýzdan çekilmiþtir..");
				break;
			
			}
			else {
				System.out.println("yanlýþ giriþ yaptýnýz...");
			}
			
	
			}
	
	}

	}

