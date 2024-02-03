package uygulama7;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Sayý giriniz : ");
		int sayý = scanner.nextInt();
		scanner.nextLine();
		
		for(int i=sayý;i>=0;i--) {
			System.out.println(" "+i);
			
		}

	}

}
