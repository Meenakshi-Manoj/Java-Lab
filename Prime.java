import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		int n,i;
		int f=0;
		System.out.println("enter the numbers : ");
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
