public class Student {
    private String isim;
    private int ogrenciNo;
    private double notOrtalamasi;


    public Student(String isim, int ogrenciNo, double notOrtalamasi) {

        if (notOrtalamasi < 0) {
            throw new IllegalArgumentException("Hata: Not ortalaması negatif olamaz.");
        }


        if (containsDigit(isim)){
            throw new IllegalArgumentException("Hata: İsim kısmına sayı giremezsiniz.");
        }


        this.isim= isim;
        this.ogrenciNo = ogrenciNo;
        this.notOrtalamasi=notOrtalamasi;
    }


    private boolean containsDigit(String s) {
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }

        }
        return false;
    }


    public void displayInfo() {
        System.out.println("Öğrenci Bilgileri:");
        System.out.println("İsim: " + isim);
        System.out.println("Öğrenci No: " + ogrenciNo);
        System.out.println("Not Ortalaması: " + notOrtalamasi);
    }

    // Test
    public static void main(String[] args) {
        try {

            Student student1 = new Student("Yusuf", 123456, 72.5);
            student1.displayInfo();

            Student student2 = new Student("Burak", 78910, -53.0);
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }
}


