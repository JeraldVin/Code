n=int(input())
arr=list(map(int,input().split(" ")))
res=[]
for i in range(0,n):
	if (i%2==0 and arr[i]%2!=0) or (i%2!=0 and arr[i]%2==0):
		res.append(arr[i])
print(*res,end="",sep=" ")
