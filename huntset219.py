n,k=map(int,input().split())
newList=[]
for i in range(n):
	List1=list(map(int,input().split()))
	newList.append(set(List1))
setEx=set.intersection(*newList)
print(*setEx,)
