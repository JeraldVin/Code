import java.util.Scanner;

class Display
{
	public static void main (String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=4;i++)
		System.out.print(n*i+" ");
		System.out.print(n*5);
	}
}
