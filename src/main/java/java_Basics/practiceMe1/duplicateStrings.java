package java_Basics.practiceMe1;

public class duplicateStrings {
    public static void main(String[] args) {

        String s="Swamy Nandini Charvitha Charvitha Charvitha Charvitha Yashoda Narayana Akula akula swamy nandini nandini yashoda yashoda";
        String arr[]=s.toLowerCase().split(" ");
        int count;

        for (int i=0; i< arr.length;i++){
            count=1;
            if (arr[i]=="0"){
                continue;
            }
            for (int j=i+1; j< arr.length;j++){
                if (arr[i].equals(arr[j])&& arr[i]!="0"){
                    count++;
                    arr[j]="0";
                }
            }

            if (arr[i]!="0"){
                System.out.println(arr[i]+"--"+count);
            }
        }

    }
}
