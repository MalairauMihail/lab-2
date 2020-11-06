package lab3.abstractizare.interfata;

import static lab3.abstractizare.interfata.Cilindru.*;
import static lab3.abstractizare.interfata.Cub.*;
import static lab3.abstractizare.interfata.Piramida.*;
import static lab3.abstractizare.interfata.Corp.*;

import java.util.ArrayList;
import java.util.List;

public class Main
{
    public static void main(String[] args) {
        Cilindru cilindru = new Cilindru(6, 12);
        Piramida piramida1 = new Piramida(3, 5, 2);
        Piramida piramida2 = new Piramida(5, 6, 9);
        Cub cub = new Cub(4);

        List<Corp> corpuri = new ArrayList<>();
        corpuri.add(cilindru);
        corpuri.add(piramida1);
        corpuri.add(piramida2);
        corpuri.add(cub);

        for (Corp c : corpuri) {
            System.out.println(c);

        }
    }
}