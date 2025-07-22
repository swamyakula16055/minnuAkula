package java_Basics.practiceMe1;

public class duplicateChars {
    public static void main(String[] args) {
        String s="Swamy Nandini Charvitha Yashoda Narayana Akula";
         char arr[]=s.toLowerCase().toCharArray();
         int count;

         for (int i=0;i<arr.length;i++){
             count=1;
             if (arr[i]=='0'){
                 continue;
             }
             for (int j=i+1; j<arr.length;j++){
                 if (arr[i]==arr[j]&& arr[i]!=' ' && arr[j]!='0'){
                     count++;
                     arr[j]='0';
                 }
             }

             if (count>1&&arr[i]!='0'&& arr[i] != ' '){
                 System.out.println(arr[i]+"--"+count);
             }
         }

    }
}
