package DSA.Maths_for_dsa;

import java.util.*;

import java.util.ArrayList;

public class PrimeUsingSeive{
    private static boolean [] isPrime;

    public static List<Integer> allPrimeUptoGivenNum(int n){
        List<Integer> allPrimes = new ArrayList<>();
        isPrimeNum(n);
        for(int i=2 ; i <=n ;i++){
            if(isPrime[i]){
                allPrimes.add(i);
            }
        }
        return allPrimes;
    }

    public static boolean isPrimeNum(int n){
        isPrime = new boolean[n+1];
        for(int i=0 ; i <=n ;i++){
            isPrime[i] = true;
        }
        isPrime[0] = false;
        isPrime[1] = false;

        for(int i =2; i<=n ;i++){
            if(isPrime[i]){
                for(int j = i*i ; j<=n; j=j+i){
                isPrime[j]=false;
             }
            
            }
        }
        return isPrime[n];
    }
}