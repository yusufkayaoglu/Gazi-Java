package uygulama11;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int toplam = 0;
		int sayaç = 0;
		
		System.out.println("Sayý giriniz : ");
		int sayý = scanner.nextInt();
		for(int i = 1;i<=sayý;i++) {
			if(sayý%i==0) {
				sayaç++;
				toplam+=i;
				System.out.println(i);
			}
			
		}
		double ort = toplam / sayaç;
		System.out.println("Tam bölenlerin toplamý "+toplam);
		System.out.println("Tam bölenlerin ortalamasý"+ort);
		
		
		
		
	}

}
