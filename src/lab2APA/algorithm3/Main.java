package lab2APA.algorithm3;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {

        int n = 10;
        long startTime = System.currentTimeMillis();
        SieveOfEratosthenes ciur = new SieveOfEratosthenes();

        System.out.println("Urmatoarele numere prime sunt mai mici sau egale ca " + n);

        ciur.getTheNumber(n);

        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;

        System.out.println(" ");
        System.out.println(elapsedTime + " millis second");
    }
}