public abstract class GeometrijskiLik implements Comparable<GeometrijskiLik>, Crtanje, Draw{

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

    @Override
    public int compareTo(GeometrijskiLik drugi){
        return Double.valueOf(this.Povrsina()).compareTo(Double.valueOf(drugi.Povrsina()));
    }
}
