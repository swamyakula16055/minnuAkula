package java_Basics;


public class stringReverse {
    public static void main(String[] args) {

        String s="Swamyshiva";
        int str=s.length()-1;
        String c="";
        for (int i=str;i>=0;i--){
            c=c+s.charAt(i);

        }
        System.out.println(c);


        StringBuilder sb =new StringBuilder(s);
        String rev= sb.reverse().toString();
        System.out.println(rev+" Hello");



    }
}
