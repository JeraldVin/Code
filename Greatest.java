import java.util.Scanner;
class Greatest
{
	public static void main (String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int flag=0,a=0,b=0,c=0;
		if(sc.hasNextInt())
		a=sc.nextInt();
		else
		flag=1;
		if(sc.hasNextInt())
		b=sc.nextInt();
		else
		flag=1;
		if(sc.hasNextInt())
		c=sc.nextInt();
		else
		flag=1;
		if(flag==0)
		{
		if((a>=b)&&(a>=c))
		System.out.print(a);
		else if((b>=a)&&(b>=c))
		System.out.print(b);
		else
		System.out.print(c);
		}
		else
		System.out.print("Invalid Input");
	}
}
