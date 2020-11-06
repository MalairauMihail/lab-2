package lab3.abstractizare.clasa;

import java.util.ArrayList;
import java.util.List;

public class Main
{
    public static void main(String[] args) {
        Castravete castravete1 = new Castravete(0.1, "Herman");
        Castravete castravete2 = new Castravete(0.08, "Connie");
        Varza varza = new Varza(2.5, "China");
        Rosii rosie = new Rosii(0.15, "rotunda");

        List<Legume> legume = new ArrayList<>();
        legume.add(castravete1);
        legume.add(castravete2);
        legume.add(varza);
        legume.add(rosie);

        for (Legume f : legume) {
            System.out.println(f);
        }

        for (Legume f : legume) {
            System.out.println(f.ambalare());

        }
    }
}
