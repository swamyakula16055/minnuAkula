package java_Basics.practiceMe1;

public class factorialNumber {
    public static void main(String[] args) {
      //  int k=isFactorial(6);
        System.out.println(isFactorial(6));
        System.out.println(isFactorial(4));

        System.out.println(isFactNumber(5));

    }

    public static int isFactorial(int num){
        int fact=1;
        if(num==0){
            return 1;
        }

        for (int i=1;i<=num;i++){
            fact=fact*i;
        }
        return fact;
    }

    //With Recursive function
    public static int isFactNumber(int num){
       // int fact=1;
        if (num==0){
            return 1;
        }
        else {
            return  (num*isFactNumber(num-1));
        }
    }

}

