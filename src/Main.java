import java.util.Collections;

public class Main {
    public static void main (String[] args){

        Trokut trokut = new Trokut("gospon trokut",3.4,2.7,5.5);
        Krug krug = new Krug("gospon krug", 8.1);
        Pravokutnik pravokutnik = new Pravokutnik("gospon pravokutnik", 6.3,9.7);

        //if (trokut instanceof Trokut){
        //    System.out.println("Naziv: " + trokut.getNaziv() + " StranicaA: "+ trokut.getStranicaA() + " StranicaB: " + trokut.getStranicaB() + " StranicaC: " + trokut.getStranicaC());
        //}
        //if (krug instanceof Krug){
        //    System.out.println("Naziv: " + krug.getNaziv() + " Radius: " + krug.getRadius());
        //}
        //if (pravokutnik instanceof Pravokutnik){
        //    System.out.println("Naziv: " + pravokutnik.getNaziv() + " StranicaA: " + pravokutnik.getStranicaA() + " StranicaB: " + pravokutnik.getStranicaB());
        //}

        //System.out.println("Zadatak 2: ");
        //System.out.println(trokut.toString());
        //System.out.println(krug.toString());
        //System.out.println(pravokutnik.toString());

        Ucilica ucilica = new Ucilica();

        ucilica.getLikovi().add(trokut);
        ucilica.getLikovi().add(krug);
        ucilica.getLikovi().add(pravokutnik);

        Collections.sort(ucilica.getLikovi());

        for (GeometrijskiLik lik: ucilica.getLikovi()){
            System.out.println(lik.toString());
        }
    }
}
