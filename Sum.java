import java.util.Scanner;
public class Sum {

	public static void main(String[] args) {
		int n,i,s=0;
		System.out.println("enter the number : ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(i=0;i<n;i++)
		{
			s=s+i;
		}
       System.out.println("sum of the number is "+s);
	}

}
