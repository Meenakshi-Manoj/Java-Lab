import java.util.Scanner;

public class Fibo {

	public static void main(String[] args) {
      int a=0,b=0,c=1,n,i;
      System.out.println("enter the number : " );
      Scanner sc =new Scanner(System.in);
      n=sc.nextInt();
      System.out.println("fibonacci of the number : ");
      for(i=1;i<=n;i++)
      {
    	  a=b;
    	  b=c;
    	  c=a+b;
     System.out.println(a+" ");
      }
	}

}
