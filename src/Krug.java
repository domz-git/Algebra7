public class Krug extends GeometrijskiLik{

    private double radius;

    public Krug(String naziv, double radius) {
        super(naziv);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double Povrsina() {
        return (Math.PI * Math.pow(radius, 2));
    }

    @Override
    public double Opseg() {
        return 2*Math.PI*radius;
    }
}
