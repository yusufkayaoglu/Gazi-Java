package uygulama14;

import java.util.Scanner;

public class Main {
	/*public static int   en_büyük(int a,int b,int c) {  //Soru1
		int max = a;
		if(b>max) {
			max =b;
		}
		if(c>max) {
			max = c;
		}
		
		
		return max;
	}*/
	/*public static double ortalama(int a,int b,int c) {  //Soru2
	double toplam = a+b+c;
	double ortalama = toplam/3;
	return ortalama;
	
	
    }*/
	public static String ortadaki_karakteri_döndür(String yazý ) { //Soru3
		int uzunluk = yazý.length();
		if(uzunluk %2 ==0) {
			 int ortadaki_index = uzunluk/2;
			 

			 return yazý.substring(ortadaki_index-1,ortadaki_index+1);
			
			
		}
		else {
			
			int ortadaki_index=(yazý.length()/2);
			return yazý.substring(ortadaki_index,ortadaki_index+1);
			
			
			
			
			
		}
		
		
		
	}
	
	/*public static int kelime_sayýsý_döndür(String metin) { //Soru4
		 if (metin == null || metin.isEmpty()) {
        return 0; 
    }

    String[] kelimeler = metin.split(" "); 

    return kelimeler.length;
		
		
		
		
		
	}*/
	/*public static int basamaklarýn_toplamý(int sayý) { //Soru5
		int yüzler = sayý/100;
		int onlar = (sayý - (100*yüzler))/10;
		int birler=(sayý - (100*yüzler)-(10*onlar));
		int toplam = yüzler+onlar+birler;
		return toplam;
		
		
		
		
		
		
	}*/
	public static boolean ikinci_deðer_ortalamamý(double a ,double b,double c) { //Soru6
		if(b==(a+c)/2) {
			return true;
		}
		else {
			return false;
		}
		
		
	}
	
	

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);  
		/*System.out.println("Sayý giriniz:  "); //Soru1
		int sayý1=scanner.nextInt();
		System.out.println("Sayý giriniz:  ");
		int sayý2=scanner.nextInt();
		System.out.println("Sayý giriniz:  ");
		int sayý3=scanner.nextInt();
		System.out.println("En büyük sayý: "+en_büyük(sayý1,sayý2,sayý3));*/
		
		/*System.out.println("Sayý giriniz:  "); //Soru2
		int sayý1=scanner.nextInt();
		System.out.println("Sayý giriniz:  ");
		int sayý2=scanner.nextInt();
		System.out.println("Sayý giriniz:  ");
		int sayý3=scanner.nextInt();
		System.out.println("ortalama: "+ortalama(sayý1,sayý2,sayý3));*/
		
		System.out.println("Bir string giriniz : ");    //Soru3
		String s = scanner.nextLine();
		System.out.println(ortadaki_karakteri_döndür(s));
		
		/*System.out.println("Bir String Giriniz: "); //Soru4
		String s = scanner.nextLine();
		System.out.println(kelime_sayýsý_döndür(s));
		
		
		/*System.out.println("Basamak sayýsý giriniz : ");
		System.out.println("En fazla 3 basamaklý bir sayý giriniz : "); //Soru5
		int a = scanner.nextInt();
		System.out.println(basamaklarýn_toplamý(a));*/
		
		/*
		System.out.println("Sayý giriniz:  "); 
		int sayý1=scanner.nextInt();
		System.out.println("Sayý giriniz:  ");
		int sayý2=scanner.nextInt();
		System.out.println("Sayý giriniz:  ");
		int sayý3=scanner.nextInt();
		System.out.println(ikinci_deðer_ortalamamý(sayý1, sayý2, sayý3));
		
		*/
		
		
		
		
		
		
		
		

	}

}
