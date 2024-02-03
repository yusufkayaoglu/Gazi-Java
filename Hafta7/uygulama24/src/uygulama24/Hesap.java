package uygulama24;
public class Hesap {
	private String hesapNo;
	private String ad;
	private double bakiye;
	private static int hesap_sayisi;
	private static String hesaplar[]=new String[100];
	public Hesap(String hesapNo, String ad, double bakiye) {
		this.hesapNo = hesapNo;
		this.ad = ad;
		this.bakiye = bakiye;
		hesap_sayisi++;
        hesaplar[hesap_sayisi - 1] = hesapNo;
		
	}

	public void paraYatır(int tutar){
	     bakiye +=tutar;
	     System.out.println("Yeni bakiyeniz: "+bakiye );
		
	}
	public void paracek(int tutar) {
		if((bakiye - tutar ) < 0) {
			System.out.println("Yeterli bakiyeniz yok....");
		}
		else {
		    bakiye-=tutar;
			System.out.println("Yeni bakiyeniz : "+bakiye );
			
		}
		
	}	
	public void paraYatır(double tutar){
	     bakiye +=tutar;
	     System.out.println("Yeni bakiyeniz: "+bakiye );
		
	}
	public void paracek(double tutar) {
		if((bakiye - tutar ) < 0) {
			System.out.println("Yeterli bakiyeniz yok....");
		}
		else {
			bakiye-=tutar;
			System.out.println("Yeni bakiyeniz : "+bakiye );
			
		}
		
	}
	public void bilgileri_goster() {
		System.out.println("Ad: "+ad);
		System.out.println("Hesap no: "+hesaplar[hesap_sayisi-1]);
		System.out.println("Bakiye: "+bakiye);
	}
	public static void hesapSayacı() {
		System.out.println("Toplam oluşturulan hesap sayısı: "+hesap_sayisi);
		
	}
}
