import java.util.*;
class Palindrome1
{ 
  public static void main(String args[])
{
Scanner sc=new Scanner(System.in);

int n,rem,rev=0,temp=0;
System.out.println("enter the n value");
n=sc.nextInt();
while(n!=0)
{
 rem=n%10;
rev=rev*10+rem;
n=n/10;
}
if(temp==rev)
System.out.println("palindrome");
else
System.out.println("is a not palindrome");
 
}
}
