import java.util.Scanner;

class Ideone
{
	public static void main (String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		int x=0,flag=0;
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
			x=arr[i];
			for(int j=0;j<i;j++){
				if(arr[j]!=x)
				continue;
				else{
				flag=1;
				break;
				}
			}
			if(flag==1)
			break;
		}
		System.out.print(x);
		
	}
}
