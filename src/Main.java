public class Main {
    public static void main(String[] args) {
        test();
    }

    public static void test() {
        Fraction fraction1 = new Fraction(1, 0);

        assert fraction1.getDenominateurU() != 0 : "Fraction incorrecte ";
    }
}