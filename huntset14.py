#new
n=input()
arr=list(map(int,input().split(" ")))
for i in range(0,len(arr)):
	if arr.count(arr[i])==1:
		break
print(arr[i])
