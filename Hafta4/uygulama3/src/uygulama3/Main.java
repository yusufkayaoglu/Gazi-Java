package uygulama3;


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sayý = scanner.nextInt();
		int toplam = 0;
	
		for(int i = 0;i<=sayý;i++) {
		    toplam+=i;
			
		}
		System.out.println(toplam);
		

	}

}
