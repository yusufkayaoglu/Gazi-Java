package uygulama1;



import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int toplam = 0;
		Scanner scanner = new Scanner(System.in);
		for(int i=1;i<=10;i++) {
			System.out.println(" "+i+" ."+"say�y� giriniz: ");
			int say� = scanner.nextInt();
			toplam+=say�;
			
			
		}
		double ort = (double) toplam /10;
		System.out.println("Ortalama : "+ort);
		
		
		
		
		
		
		
		

	}

}