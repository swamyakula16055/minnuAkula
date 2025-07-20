package java_Basics.practiceMe1;

import org.apache.commons.math3.analysis.function.Sqrt;

public class prime1 {
    public static void main(String[] args) {
        int num = 50;
        System.out.println(isPrime(17));
        
        for (int n=2;n<=num;n++){
            if (isPrime(n)){
                System.out.println(n);
            }
            
        }

    }

    public static boolean isPrime(int num){
        if (num<=1){
            return false;
        }

        for (int i = 2; i<= Math.sqrt(num); i++){
            if (num%i==0){
                return false;
            }
        }
        return true;


    }

}
