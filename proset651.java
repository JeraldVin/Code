import java.util.Scanner;

class Alternate
{
	public static void main (String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		arr[i]=sc.nextInt();
		int count,flag;
		for(int i=0;i<n;i++){
			count=1;
			if(arr[i]>0)
			flag=0;
			else
			flag=1;
			for(int j=i+1;j<n;j++){
				if(flag==0){
					if(arr[j]<0)
					{
						flag=1;
						count++;
					}
					else
					break;
				}
				else{
					if(arr[j]>0)
					{
						flag=0;
						count++;
					}
					else
					break;
				}
			}
			arr[i]=count;
		}
		for(int i=0;i<n;i++)
		System.out.print(arr[i]+" ");
	}
}
