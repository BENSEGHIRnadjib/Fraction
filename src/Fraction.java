public class Fraction {

    private int numerateurQ;
    private int denominateurU;

    public Fraction(int numerateurQ, int denominateurU) {
        this.numerateurQ = numerateurQ;
        this.denominateurU = denominateurU;
    }
    public Fraction(int numerateurQ) {
        this.numerateurQ=numerateurQ;
        denominateurU=1;
    }
    public Fraction (){
        numerateurQ=0;
        denominateurU=1;
    }

    public int getNumerateurQ() {
        return numerateurQ;
    }

    public int getDenominateurU() {
        return denominateurU;
    }


    @Override
    public String toString() {
        return numerateurQ + "/" + denominateurU;
    }

    public static final Fraction Zero = new Fraction();
    public static final Fraction UN = new Fraction(1);
}