n=int(input())
num=list(map(int,input().split()))
equal=[]
for i in range(0,len(num)):
	if i==num[i]:
		equal.append(num[i])
if len(equal)>0:
	print(*equal,)
else:
	print("-1")
