public class Main {
    public static void main(String[] args) {
        test();
    }

    public static void test() {
        Fraction fraction1 = new Fraction(1, 0);
        Fraction fraction1 = new Fraction(1, 1);

        assert fraction1.getDenominatorU() != 0 : "Fraction incorrect !!! ";
    }
}