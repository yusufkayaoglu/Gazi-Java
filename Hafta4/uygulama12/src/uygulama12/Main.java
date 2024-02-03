package uygulama12;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		while(true){
		System.out.println("E postanýzý giriniz : (kullanýcýadý@gmail.com) ");
		String e_posta = scanner.nextLine();
		if(e_posta.endsWith(".com") && e_posta.contains("@"))
		{
			System.out.println("Ýþlem baþarýlý");break;
		}
			
		else {
			System.out.println("Ýþlem baþarýsýz..");
			
		}
		}

	}

}
