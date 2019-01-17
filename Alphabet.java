import java.util.Scanner;
class Aplhabet
{
	public static void main (String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		if(str.length()==1)
    {
		char ch=str.charAt(0);
		String alphabet="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		if(alphabet.contains(Character.toString(ch)))
		System.out.print("Alphabet");
		else
		System.out.print("No");
		}
		else
		System.out.print("Invalid Input");
	}
}
