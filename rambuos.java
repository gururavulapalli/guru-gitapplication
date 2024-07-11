import java.util.*;
class Rambuos
{
   public static void main(String args[])
    {
     Scanner sc=new Scanner(System.in);
      int i,n,j;
     System.out.println("enter the n value");
      n=sc.nextInt();
      for(i=1;i<=n;i++)
       {
       for(j=i;j<=n;j++)
       System.out.print("*");
        for(j=1;j<i;j++)
        System.out.print(" "+" ");
       for(j=i;j<=n;j++)
       System.out.print("*");
       System.out.println(" ");
       }
         for(i=2;i<=n;i++)
         {
          for(j=1;j<=i;j++)
           System.out.print("*");
          for(j=i;j<n;j++)
          System.out.print(" "+" ");
           for(j=1;j<=i;j++)
          System.out.print("*");
          System.out.println("");
          }
        }
}