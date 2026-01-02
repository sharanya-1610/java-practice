NOTES    ARRAYS
import java.util.*;
public class basicarray{
public static void main(String args[]){

 Scanner in=new Scanner(System.in);
     int n=in.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++){
a[i]=in.nextInt();
}
for(int i=0;i<n;i++){
System.out.println(a[i]+"  ");
}
}
}
---------------------------------------------------------------------------------------------------
import java.util.*;

public class Solution {

    public static void main(String[] args) {
      Scanner in=new Scanner(System.in);
      int a[]=new int[n];
    for(int i=0;i<n;i++){
      a[i]=in.nextInt();
    }
      int f=0;
      int ft=in.nextInt();
      for(int i=0;i<n-2;i++){
        for(int j=0;j<n-2;j++){
          for(int k=j+1;k<n;k++){
            if(a[i]+a[j]+a[k]==t){
              f=1;
              System.out.println(a[i]+"+"+a[j]+" + "+a[k]+" + "+t);
              
            }
          }
        }
      }
      if(f==0){
        System.out.println("No Triplets Found"); 
      }
    }
}
