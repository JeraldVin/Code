import java.util.Scanner;

class Encode
{
	public static void main (String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String str1=sc.next();
		String str2=sc.next();
		int x,y;
		StringBuilder s=new StringBuilder();
		for(int i=0;i<str1.length();i++){
			x=(int)str1.charAt(i)-96;
			y=(int)str2.charAt(i)-96;
			if(x+y<=26)
			s.append((char)(x+y+96));
			else if((x+y)%26==0)
			s.append(str1.charAt(i));
			else
			s.append((char)(((x+y)%26)+96));
		}
		System.out.print(s.toString());
	}
}
