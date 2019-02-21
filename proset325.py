n=int(input())
arr=list(map(int,input().split()))
length=0
cur=0
for i in range(n-1):
	if arr[i]<arr[i+1]:
		cur+=1
		if i==n-2:
			if cur+1>length:
				length=cur+1
				
	else:
		if cur+1>length:
			length=cur+1
		cur=0
print(length)
