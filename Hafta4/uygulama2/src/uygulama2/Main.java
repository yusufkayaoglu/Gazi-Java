package uygulama2;



import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int toplam = 0;
		int sayaç = 0;
		double ort = 0;
		
		while(true) {
			System.out.println("Sýcaklýk giriniz: ");
			int sýcaklýk = scanner.nextInt();
		
			
			sayaç ++;
			
			
			if(sýcaklýk == -1) {
				
				
				break;
				
			}
			toplam+=sýcaklýk;
			ort = toplam /sayaç;
			
		}
		System.out.println(ort);
		
		
		
		
		
		
		
		

	}

}

