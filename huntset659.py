n=int(input())
arr1=list(map(int,input().split()))
arr2=list(map(int,input().split()))
sums=[arr1[i]+arr2[i] for i in range(n)]
print(*sums,)
