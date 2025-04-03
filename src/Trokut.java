public class Trokut extends GeometrijskiLik{

    private double stranicaA;
    private double stranicaB;
    private double stranicaC;

    public Trokut(String naziv, double stranicaA, double stranicaB, double stranicaC) {
        super(naziv);
        this.stranicaA = stranicaA;
        this.stranicaB = stranicaB;
        this.stranicaC = stranicaC;
    }

    public double getStranicaA() {
        return stranicaA;
    }

    public void setStranicaA(double stranicaA) {
        this.stranicaA = stranicaA;
    }

    public double getStranicaB() {
        return stranicaB;
    }

    public void setStranicaB(double stranicaB) {
        this.stranicaB = stranicaB;
    }

    public double getStranicaC() {
        return stranicaC;
    }

    public void setStranicaC(double stranicaC) {
        this.stranicaC = stranicaC;
    }


    @Override
    public double Povrsina() {
        double polumjer = (stranicaA + stranicaB + stranicaC)/2;
        return Math.sqrt(polumjer*(polumjer-stranicaA)*(polumjer-stranicaB)*(polumjer-stranicaC));
    }

    @Override
    public double Opseg() {
        return stranicaA+stranicaB+stranicaC;
    }

    @Override
    public String crtaj() {
        return "";
    }
}
