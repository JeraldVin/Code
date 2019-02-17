k=int(input())
arr=[]
for i in range(k):
	dup=[]
	dup=list(map(int,input().split()))
	arr.append(dup)
newArr=[]
for i in range(len(arr)):
	for j in range(len(arr[i])):
		newArr.append(arr[i][j])
newArr.sort()
print(*newArr,sep=" ")
