n=int(input())
newList=list(map(int,input().split()))
newList.reverse()
for i in range(0,n-1):
	print(newList[i],end="->")
print(newList[n-1],end="")
