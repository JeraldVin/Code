import java.util.Scanner;

class Pangram
{
	public static void main (String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int flag=0;
		String alphabet="abcdefghijklmnopqrstuvwxyz";
		String upper="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		for(int i=0;i<26;i++){
			if((s.contains(Character.toString(alphabet.charAt(i))))||(s.contains(Character.toString(upper.charAt(i)))))
			continue;
			else{
				flag=1;
				System.out.print("no");
				break;
			}
		}
		if(flag==0)
		System.out.print("yes");
	}
}
