package lab2APA.algorithm1;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int n = 10;

        System.out.println("Urmatoarele numere prime sunt mai mici sau egale ca " + n);

        long startTime = System.currentTimeMillis();

        long total = 0;

        SieveOfEratosthenes ciur = new SieveOfEratosthenes();
        ciur.sieveOfEratosthenes(n);

        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;
        System.out.println(elapsedTime + " millis second");
    }

}
