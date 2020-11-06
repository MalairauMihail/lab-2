package lab2.MostenireSimpla;

import static lab2.MostenireSimpla.Huawei.*;
import static lab2.MostenireSimpla.Xiaomi.*;

public class Main
{
    public static void main(String[] args)
    {
        Huawei huawei = new Huawei("Huawei",6);
        Xiaomi xiaomi = new Xiaomi(6);

        System.out.println(huawei.printst());
        System.out.println(xiaomi.printst());
    }
}
