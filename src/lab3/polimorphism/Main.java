package lab3.polimorphism;

import static lab3.polimorphism.Telefon.*;
import static lab3.polimorphism.Honor.*;
import static lab3.polimorphism.Huawei.*;
import static lab3.polimorphism.Xiaomi.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Telefon telefon = new Telefon("Lenovo", 4, "Atom", 16);
        Honor honor1 = new Honor(6, "Kirin 980", 128, "IPS");
        Xiaomi xiaomi = new Xiaomi(6, "Dragon", 128, "Negru");
        Huawei huawei = new Huawei(6, "Kirin 980", 128, "Dolby audio");
        Honor honor2 = new Honor(4, "Kirin 710", 64, "IPS");

        List<Telefon> Telefoane = new ArrayList<>();
        Telefoane.add(telefon);
        Telefoane.add(honor1);
        Telefoane.add(xiaomi);
        Telefoane.add(huawei);
        Telefoane.add(honor2);

        for (Telefon t : Telefoane) {
            System.out.println(t);
        }

        for (Telefon t : Telefoane) {
            System.out.println(t.functioneaza());
        }
    }
}