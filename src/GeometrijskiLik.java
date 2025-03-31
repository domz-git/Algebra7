public abstract class GeometrijskiLik {

    private String naziv;

    public abstract double Povrsina();

    public abstract double Opseg();

    public GeometrijskiLik(String naziv) {
        this.naziv = naziv;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    @Override
    public String toString(){
        return "Naziv: " + this.naziv + ", Opseg: " + Opseg() + ", Povrsina: " + Povrsina();
    }
}
