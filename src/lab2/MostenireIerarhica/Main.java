package lab2.MostenireIerarhica;

import static lab2.MostenireIerarhica.Huawei.*;
import static lab2.MostenireIerarhica.Xiaomi.*;
import static lab2.MostenireIerarhica.Lenovo.*;
import static lab2.MostenireIerarhica.Telefon.*;

public class Main
{
    public static void main(String[] args)
    {
        Telefon samsung = new Telefon("Samsung","Octa Core",6,"Negru");

        System.out.println(samsung.print());
        System.out.println(samsung.pret());
        System.out.println("-------------------");

        Huawei huawei = new Huawei("Kirin 980",6,"Albastru");

        System.out.println(huawei.print());
        System.out.println(huawei.pret());
        System.out.println("-------------------");

        Lenovo lenovo = new Lenovo("Atom",4,"Verde");

        System.out.println(lenovo.print());
        System.out.println(lenovo.pret());
        System.out.println("-------------------");

        Xiaomi xiaomi = new Xiaomi("Helio",6,"Rosu");

        System.out.println(xiaomi.print());
        System.out.println(xiaomi.pret());

    }
}
