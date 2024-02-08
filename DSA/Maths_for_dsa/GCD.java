package DSA.Maths_for_dsa;
public class GCD{

    public static int getGcd( int a , int b ){
        if ( b == 0){
            return a;
        }
        // using Euclidean Algorithm that says gcd (a,b) =  gcd (b,r) where r is remainder when a is divide by b i.e a%b 
        return getGcd(b,a%b);
    }
    
}