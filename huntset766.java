import java.util.Scanner;

class Prefix
{
	public static void main (String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String[] arr=new String[n];
		for(int i=0;i<n;i++)
		arr[i]=sc.next();
		String s=sc.next();
		int count=0,len=s.length();
		for(int i=0;i<n;i++){
			if(arr[i].length()>=len)
			if(arr[i].substring(0,len).contains(s))
			count++;
		}
		System.out.print(count);
	}
}
