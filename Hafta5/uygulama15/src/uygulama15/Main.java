package uygulama15;

import java.util.Scanner;


public class Main {
	public static String palindrom(String metin) {
		String ters_metin="";
		metin = metin.toLowerCase();
		for(int i=metin.length()-1; i>=0; i--){
			ters_metin+=metin.charAt(i);
		}
		if(ters_metin.equals(metin)) {
			return metin+" Palindromdur";
		}
		else {
			return metin+" Palindrom de�ildir";
		}	
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
		System.out.println("En az 5 en fazla 7 harften olu�an bir kelime giriniz: ");
		String yaz� = scanner.nextLine();
		int uzunluk = yaz�.length();
		if(uzunluk >=5 && uzunluk <=7) {
			System.out.println(palindrom(yaz�));
			break;
		}
	}
	}
}
