public class Fraction {

    private int numerateurQ;
    private int denominateurU;

    public Fraction(int numerateurQ, int denominateurU) {
        this.numerateurQ = numerateurQ;
        this.denominateurU = denominateurU;
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

    public String toString() {
        return "Je suis une fraction.";
    }
}

}


