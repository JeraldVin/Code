import java.util.Scanner;

class Ideone
{
	public static void main (String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		if(s1.contains(s2))
		{
			for(int i=0;i<s1.length();i++){
				if(s1.charAt(i)==s2.charAt(0))
				{
				System.out.print(i);
				break;
				}
			}
		}
		else
		System.out.print("-1");
	}
}
