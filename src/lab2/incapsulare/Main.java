package lab2.incapsulare;

import static lab2.incapsulare.Telefon.*;
import static lab2.incapsulare.Laptop.*;

public class Main
{
    public static void main(String[] args)
    {
        Telefon huawei = new Telefon("Huawei","Kirin 980",6);
        Laptop asus= new Laptop("Asus","i5 8300h",8);
            System.out.println(huawei.printst());
            System.out.println(asus.printst());
    }
}
