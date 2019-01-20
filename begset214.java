import java.util.Scanner;

class Display
{
	public static void main (String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int q=sc.nextInt();
		n++;
		q--;
		if(n%2==0)
		n++;
		if(q%2==0)
		q--;
		for(int i=n;i<=q;i+=2)
		{
		if(i<q)
		System.out.print(i+" ");
		else
		System.out.print(i);
		}
	}
}
