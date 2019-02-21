n=int(input())
arr=list(map(int,input().split()))
length=0
cur=1
for i in range(n-1):
	if arr[i]<arr[i+1]:
		cur+=1
		if i==n-2:
			if cur>length:
				length=cur
				
	else:
		if cur>length:
			length=cur
		cur=1
print(length)
