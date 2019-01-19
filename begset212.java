import java.util.Scanner;
class Palindrome
{
	public static void main (String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		StringBuilder s=new StringBuilder(str);
		s=s.reverse();
		if(str.equals(s.toString()))
		System.out.print("yes");
		else
		System.out.print("no");
	}
}
