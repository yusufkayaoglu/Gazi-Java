package uygulama11;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int toplam = 0;
		int saya� = 0;
		
		System.out.println("Say� giriniz : ");
		int say� = scanner.nextInt();
		for(int i = 1;i<=say�;i++) {
			if(say�%i==0) {
				saya�++;
				toplam+=i;
				System.out.println(i);
			}
			
		}
		double ort = toplam / saya�;
		System.out.println("Tam b�lenlerin toplam� "+toplam);
		System.out.println("Tam b�lenlerin ortalamas�"+ort);
		
		
		
		
	}

}