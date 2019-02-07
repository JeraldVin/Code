import java.util.Scanner;

class FullStop
{
	public static void main (String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		StringBuilder str=new StringBuilder(s);
		System.out.print(str.append(".").toString());
	}
}
