import java.util.Scanner;

class Differe
{
	public static void main (String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		int k=sc.nextInt();
		int count=0,diff;
		for(int i=0;i<s1.length();i++)
		{
			if(i>=s2.length())
			break;
			if(s1.charAt(i)!=s2.charAt(i))
			count++;
		}
		diff=s1.length()-s2.length();
		if(diff<0)
		diff=-diff;
		count+=diff;
		if(count==k)
		System.out.print("yes");
		else
		System.out.print("no");
	}
}
