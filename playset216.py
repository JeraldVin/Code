n=int(input())
arr=list(map(int,input().split()))
for i in range(len(arr)):
	if arr.count(arr[i])==1:
		print(arr[i])
		break
