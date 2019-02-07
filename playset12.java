import java.util.Scanner;

class Reverse
{
	public static void main (String[] args)
	{
		Scanner sc=new Scanner(System.in);
		long fact=1l;
		long n=sc.nextLong();
		for(int i=1;i<=n;i++){
			fact*=i;
		}
		System.out.print(fact);
	}
}
