package lab2APA.algorithm3;

import java.util.Arrays;

public class SieveOfEratosthenes
{



    int MAXSIZE = 501;
    boolean[] p = new boolean[MAXSIZE];

    public void getTheNumber(int n) {
        int i, j, nr = 0;
        for (i = 2; i <= n; ++i) {
            if (p[i] == false) {
                nr++;
                for (j = i + i; j <= n; j += i) {
                    p[j] = true;
                }
            }
        }

        for( i=2;i<=n;i++){
            if(p[i] == false){
                System.out.print(i + " ");
            }
        }
    }

}
