package uygulama12;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		while(true){
		System.out.println("E postan�z� giriniz : (kullan�c�ad�@gmail.com) ");
		String e_posta = scanner.nextLine();
		if(e_posta.endsWith(".com") && e_posta.contains("@"))
		{
			System.out.println("��lem ba�ar�l�");break;
		}
			
		else {
			System.out.println("��lem ba�ar�s�z..");
			
		}
		}

	}

}
