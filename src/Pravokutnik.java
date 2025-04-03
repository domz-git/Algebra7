import javax.swing.*;

public class Pravokutnik extends GeometrijskiLik{

    private double stranicaA;
    private double stranicaB;

    public Pravokutnik(String naziv, double stranicaA, double stranicaB) {
        super(naziv);
        this.stranicaA = stranicaA;
        this.stranicaB = stranicaB;
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


    @Override
    public double Povrsina() {
        return stranicaA*stranicaB;
    }

    @Override
    public double Opseg() {
        return 2*(stranicaA+stranicaB);
    }

    @Override
    public String crtaj() {
        return "";
    }
}
