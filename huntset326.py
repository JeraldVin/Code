n=int(input())
newList=list(map(int,input().split()))
newList.reverse()
print(*newList,sep="->")
