import java.util.Scanner;
class Digits
{
	public static void main (String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int dig=0;
		while(num>0){
			dig++;
			num/=10;
		}
		System.out.print(dig);		}
	}
