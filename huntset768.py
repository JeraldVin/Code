n=int(input())
arr=list(map(int,input().split()))
m1=max(arr)
m2=min(arr)
print(arr.index(m2)+1,arr.index(m1)+1)
