import java.util.Scanner;
public class Primefactorssum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int i = 2;
	    int sumOfPrimeFactors = 0;
	    boolean prime = true;
	    while(i <= n) {
	        if(n % i == 0) {
	            prime = isPrime(i);
	            if(prime)
	                sumOfPrimeFactors += i;
	        }
	        i++;
	    }
	    System.out.println(sumOfPrimeFactors);
	    
    }
	    public static boolean isPrime(int num) {
	    int i = 2;
	    boolean res = true;
	    
	    while (i <= num / 2) {
            if (num % i == 0) {
                res = false;
                break;
            }
            ++i;
        }
        
        return res;
	    }
    
}