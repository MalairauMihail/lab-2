package lab2APA.algorithm2;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int n = 10;

        System.out.println("Urmatoarele numere prime sunt mai mici sau egale ca " + n);

        long startTime = System.currentTimeMillis();

        SieveOfEratosthenes ciur = new SieveOfEratosthenes();
        ciur.primePrint(n);

        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;
        System.out.println(" ");
        System.out.println(elapsedTime + " millis second");
    }
}
