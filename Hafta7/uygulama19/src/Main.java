
public class Main {
    public static void main(String[] args) {
    Araba araba1 = new Araba("Togg ","E3",2022);
    System.out.println("Marka: "+araba1.marka+"\nModel: "+araba1.model+"\nUretim Yılı: "+ araba1.uretimYili);
    System.out.println(Araba.sayac+"."+" Nesne oluşturuldu");
    System.out.println("****************************************");
    Araba araba2 = new Araba("Tesla ","Model 3",2023);
    System.out.println("Marka: "+araba2.marka+"\nModel: "+araba2.model+"\nUretim Yılı: "+ araba2.uretimYili);
    System.out.println(Araba.sayac+"."+" Nesne oluşturuldu");
    System.out.println("****************************************");
    Araba araba3 = new Araba("Ford","Mustang Match-E",2023);
    System.out.println("Marka: "+araba3.marka+"\nModel: "+araba3.model+"\nUretim Yılı: "+ araba3.uretimYili);
    System.out.println(Araba.sayac+"."+" Nesne oluşturuldu");
    System.out.println("****************************************");
    System.out.println(Araba.sayac+" kez nesne oluşturuldu");

    }
}