package java_Basics;

public class evenOddNumbers {

    public static void main(String[] args) {
        int num = 20;

        System.out.print("Even numbers are: ");

        for (int i = 0; i <= num; i++) {
            if (i % 2 == 0) {
                System.out.print(i+" ");
            }
        }

        System.out.println("\n*******************");

        System.out.print("Odd numbers are: ");

        for (int j=0;j<=num;j++){
            if (j % 2 != 0) {
                System.out.print(j+" ");

            }
        }

    }


}
