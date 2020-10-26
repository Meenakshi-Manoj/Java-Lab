import java.util.Scanner;

public class Armstong {

	public static void main(String[] args) {
	int s=0,r,n,n1;
	System.out.println("enter the number:");
	Scanner sc = new Scanner(System.in);
	n=sc.nextInt();
	n1=n;
	while(n!=0)
	{
		r=n%10;
		s+=(r*r*r);
		n=n/10;
	}
   if(s==n1)
   {
	   System.out.println("the given number is armstrong");
   }
   else
   {
	   System.out.println("the given number is not armstrong");
   }
	}

}
OUTPUT
enter the number:
371
the given number is armstrong
enter the number:
141
the given number is not armstrong
