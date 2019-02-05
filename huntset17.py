n=int(input())
arr=list(map(int,input().split(" ")))
res=[]
for i in range(0,n):
	if (i%2==0 and arr[i]%2!=0) or (i%2!=0 and arr[i]%2==0):
		res.append(arr[i])
for i in range(0,len(res)):
	if i==len(res)-1:
		print(res[i],end="")
	else:
		print(res[i],end=" ")
