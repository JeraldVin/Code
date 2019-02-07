n=int(input())
arr=list(map(int,input().split()))
star=[]
for i in range(0,len(arr)-1):
	flag=0
	for j in range(i+1,len(arr)):
		if arr[i]>arr[j]:
			continue
		else:
			flag=1
			break
	if flag==0:
		star.append(arr[i])
star.append(arr[len(arr)-1])
print(*star,)
if((arr.count(max(arr)))==1):
	print(max(arr))
