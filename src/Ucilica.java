import java.util.ArrayList;

public class Ucilica {

    ArrayList<GeometrijskiLik> likovi;

    public Ucilica() {
        likovi = new ArrayList<>();
    }

    public ArrayList<GeometrijskiLik> getLikovi() {
        return likovi;
    }

    public void setLikovi(ArrayList<GeometrijskiLik> likovi) {
        this.likovi = likovi;
    }
}
