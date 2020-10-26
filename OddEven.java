import java.util.Scanner;
public class OddEven {

	public static void main(String[] args) {
		int n;
		System.out.println("enter the number : ");
		Scanner sc =new Scanner(System.in);
        n=sc.nextInt();
		
		if(n%2==0)
		{
			System.out.println("number is even");
		}
		else
		{
			System.out.println("number is odd");
		}
	}

}

OUTPUT
enter the number : 
5
number is odd

enter the number : 
8
number is even


