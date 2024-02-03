
class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }

}


class Calculator {
    public static double divide(double a, double b) throws CustomException {
        if (b == 0) {
            throw new CustomException("Sıfıra bölme hatası: Payda sıfır olamaz.");
        }
        else {

            return a/b;
        }
    }
}

// Test
public class Main {
    public static void main(String[] args) {
        try {

            double result = Calculator.divide(20 , 2);
            System.out.println("Sonuç: " + result);

            result = Calculator.divide(5, 0);

        } catch (CustomException e) {

            System.err.println("Hata: " + e.getMessage());
        }
    }
}
