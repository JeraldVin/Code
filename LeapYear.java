import java.util.Scanner;
class LeapYear
{
	public static void main (String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int year=0;
		if(sc.hasNextInt()){
			year=sc.nextInt();
			if((year%4==0)&&(year>0))
			System.out.print("yes");
			else if(year>0)
			System.out.print("no");
			else
			System.out.print("Invalid Input");
		}
		else
		System.out.print("Invalid Input");
		}
	}
