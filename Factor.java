import java.util.Scanner;

public class Factor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number : ");
		int n =sc.nextInt();
		System.out.println("factors of the number is: "+n);
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
				System.out.println(i+"   ");
		}

	}

}
OUTPUT
enter the number : 
6
factors of the number is: 6
1   
2   
3   
6   
	
