import java.util.*;
public class Main {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int [] arr=new int[n];
      for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
      }int [] brr=new int[n];
      int p=0;
      for(int i=0;i<n;i++){
         System.out.print(arr[i]+" ");
      }
      for(int i=n-1;i>=0;i--){
         brr[p]=arr[i];
         p++;
      }
      for (int i = 0; i < n; i++) {
         System.out.print(brr[i] + " ");
      }
    }
}
