n=int(input())
num=list(map(int,input().split()))
num.sort(reverse=True)
for i in range(0,len(num)-1):
	if num[i]==0:
		num[i]="x"
	else:
		break
for i in range(0,len(num)):
	if num[i]!="x":
		print(num[i],sep="",end="")
