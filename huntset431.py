n=int(input())
num=list(map(int,input().split(" ")))
j=0
ans=1
for i in range(0,n):
	prod=1
	for j in range(i,n):
		if num[j]!=0:
			prod*=num[j]
			if prod>ans:
				ans=prod
		else:
			break
print(ans)
