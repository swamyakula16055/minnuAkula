package java_Basics.practiceMe1;

public class palindrome1 {
    public static void main(String[] args) {

        isPalindrome(1551);
        isPalindrome(155);

        isPalindrome(1557511);
        isPalindrome(234432);

        System.out.println("****************");

        palindrome(456547);

        palindrome(654456);
        palindrome(123321);



    }

    public static void isPalindrome(int num){
        System.out.println("number: "+num);
        int r=0;
        int sum=0;

        int t;

        t=num;
        while (num>0){
            r=num%10;
            sum=(sum*10)+r;
            num=num/10;
        }

        if (t==sum){
            System.out.println("It is Palindrome");
        }
        else {
            System.out.println("Not Palindrome");
        }

    }

    public static void palindrome(int n){
        System.out.println("the given number: "+n);
        int rem=0;
        int summ=0;
        int temp;

        temp=n;
        while (n>0){
            rem=n%10;
            summ=(summ*10)+rem;
            n=n/10;
        }

        if (temp==summ){
            System.out.println("Yes, its palindrome");
        }
        else {
            System.out.println("No, its not palindrome");
        }
    }
}
