package java_Basics.practiceMe1;

public class reverseString {
    public static void main(String[] args) {
        String s="Charvithamma Akula";
        int length=s.length();
        String r="";

        for (int i=length-1; i>=0; i--){
            r=r+s.charAt(i);
        }
        System.out.println(r);
        System.out.println("____________");
        reverseString();
        System.out.println("____________");

        stringBuilderBuffer();
    }

    public static void reverseString(){
        String str="Swamyshiva";
        int l=str.length();
        String rev="";
        for (int j=l-1; j>=0; j--){
            rev=rev+str.charAt(j);
        }
        System.out.println(rev);
    }

    public static void stringBuilderBuffer(){
        String n= "Nandini Akula";
        String y= "Yashoda Akula";

        StringBuilder sbd=new StringBuilder(n);
        System.out.println(sbd.reverse());

        StringBuffer sbf=new StringBuffer(y);
        System.out.println(sbf.reverse());

    }
}
