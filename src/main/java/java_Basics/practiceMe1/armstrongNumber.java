package java_Basics.practiceMe1;

public class armstrongNumber {
    public static void main(String[] args) {
        isArmstrong(153);
        isArmstrong(407);
        isArmstrong(13234);


    }
     public static void isArmstrong(int num){
         System.out.println("the given number :"+ num);
        int cube=0;
        int r;
        int t;

        t=num;
        while (num>0){
            r=num%10;
            num=num/10;
            cube=cube+(r*r*r);
        }
        if (t==cube){
            System.out.println("Its Armstrong number");
        }
        else {
            System.out.println("Its not a Armstrong number");

        }

     }

}
