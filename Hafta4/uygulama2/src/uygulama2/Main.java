package uygulama2;



import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int toplam = 0;
		int saya� = 0;
		double ort = 0;
		
		while(true) {
			System.out.println("S�cakl�k giriniz: ");
			int s�cakl�k = scanner.nextInt();
		
			
			saya� ++;
			
			
			if(s�cakl�k == -1) {
				
				
				break;
				
			}
			toplam+=s�cakl�k;
			ort = toplam /saya�;
			
		}
		System.out.println(ort);
		
		
		
		
		
		
		
		

	}

}

