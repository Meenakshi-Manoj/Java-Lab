import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		int n,i;
		int f=0;
		System.out.println("enter the number : ");
		Scanner sc = new Scanner (System.in);
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			if(n%i==0)
				f=f+1;
		}
      if(f==2)
    	  System.out.println("number is prime");
      else
    	  System.out.println("number is not prime");
	}

}
OUTPUT

enter the number : 
17
number is prime

enter the number : 
45
number is not prime
