import java.util.Scanner;

class Groups
{
	public static void main (String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=sc.nextInt();
		int b=sc.nextInt();
		if(a!=b){
			if(n%(2*(a+b))==0)
			System.out.print("YES");
			else
			System.out.print("NO");
		}
		else{
			if(n%(a+b)==0)
			System.out.print("YES");
			else
			System.out.print("NO");
		}
	}
}
