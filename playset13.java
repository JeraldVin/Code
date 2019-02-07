import java.util.Scanner;

class Reverse
{
	public static void main (String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String num=sc.next();
		StringBuilder str=new StringBuilder(num);
		System.out.print(str.reverse().toString());
	}
}
