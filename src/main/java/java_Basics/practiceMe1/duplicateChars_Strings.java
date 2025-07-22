package java_Basics.practiceMe1;

public class duplicateChars_Strings {
    public static void main(String[] args) {

        //duplicate string
        String s="Swamy swamy shiva akula nandini charvitha charvitha amma amma amma bapu shiva shiva shiva";
        String[] arr =s.toLowerCase().split(" ");
        int count;

        for (int i=0; i< arr.length;i++){
            count=1;
            if (arr[i]=="0"){
                continue;
            }
            for (int j=i+1; j< arr.length; j++){
                if (arr[i].equals(arr[j])&& arr[i]!=" " && arr[i]!="0"){
                    count++;
                    arr[j]="0";
                }
            }
            if (count>=1&&arr[i]!="0"){
                System.out.println(arr[i]+"--"+count);
            }
        }


        System.out.println("*********************");

        char ch[]=s.toLowerCase().toCharArray();
        int count1;

        for (int a=0; a< ch.length;a++){
            count1=1;

            for (int b=a+1; b<ch.length;b++){
                if(ch[a]==ch[b]&&ch[a]!=' '&& ch[a]!='0'){
                    count1++;
                    ch[b]='0';
                }

            }
            if (ch[a]!='0' && ch[a]!=' '){
                System.out.println(count1+" --- "+ch[a]);
            }
        }


    }
}
