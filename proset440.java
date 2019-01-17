import java.util.Scanner;
import java.util.Arrays;

class Dhoni
{
	public static void main (String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		char[] c=str.toCharArray();
		Arrays.sort(c);
		String s=new String(c);
		if(s.equals("dhino"))
		System.out.print("yes");
		else
		System.out.print("no");
	}
}
