import java.util.Scanner;
class Special
{
	public static void main (String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String special="~`!@#$%^&*()-_=+\\|[{]};:'\",<.>/?";
		int count=0;
		for(int i=0;i<s.length();i++){
			if(special.contains(Character.toString(s.charAt(i))))
			count++;
		}
		System.out.print(count);
	}
	
}
