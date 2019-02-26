import java.util.Scanner;

class SubStr
{
	public static void main (String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String p=sc.next();
		if(s.contains(p))
		System.out.print("yes");
		else
		System.out.print("no");
	}
}
