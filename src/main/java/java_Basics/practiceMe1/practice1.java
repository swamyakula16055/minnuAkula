package java_Basics.practiceMe1;

import java.lang.reflect.Array;

public class practice1 {
    public static void main(String[] args) {

       int i[]=new int[4];
       i[0]=10;
        i[1]=11;
        i[2]=12;
        i[3]=13;

        System.out.println(i[3]);

        for(int j=0; j<i.length;j++){
            System.out.print(" "+i[j]);
      //      System.out.println("\n");


        }

        System.out.println("****************");

        char[] ch={'a', 'b', 'c', 'd'};
        System.out.println(ch[3]);

        int a=0;
        while(a<ch.length){
            System.out.print(ch[a]);
            a++;
        }

        System.out.println("****************");

        Object ob[]={"Swamy", 'A',143, true};
        for (int b=0;b< ob.length;b++){
            System.out.println(ob[b]);

        }
    }
}
