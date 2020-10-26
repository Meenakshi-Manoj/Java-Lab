import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int n,i,f=1;
		System.out.println("enter the number: ");
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			f=f*i;
		}
			System.out.println("factorial of the number is "+f);

	}

}
