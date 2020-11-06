package lab2APA.algorithm2;

import java.util.Arrays;

public class SieveOfEratosthenes
{
    public static void primePrint(int n) {
        int sum=0;
        int maxFactor= (int)Math.sqrt(n);
        boolean[] isPrime=new boolean[n + 1];
        int len=isPrime.length;
        Arrays.fill(isPrime,true);
        isPrime[0]=false;
        isPrime[1]=false;
        for(int i=0;i<=maxFactor;i++){
            if(isPrime[i]){
                for(int j=i+i;j<len;j+=i){
                    isPrime[j]=false;
                }
            }
        }
        for(int i=2;i<=n;i++){
            if(isPrime[i]){
                System.out.print(i + " ");
            }
        }
    }
}
