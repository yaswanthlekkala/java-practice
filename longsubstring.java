import java.util.*;
public class Main {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int max=0;
        String temp="";
        for(int i=0;i<s.length();i++){
            
            for(int j=i;j<s.length();j++){
                char ch=s.charAt(j);
                if(temp.indexOf(ch)!=-1){
                    break;
                }
                temp+=ch;
                max=Math.max(max,temp.length());
            }
        }
        System.out.println(temp);
    }
}