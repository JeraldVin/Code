n=int(input())
num=list(map(int,input().split(" ")))
pos=[]
neg=[]
for i in range(0,len(num)):
	if num[i]>0:
		pos.append(num[i])
	elif num[i]<0:
		neg.append(num[i])
count=0
if len(neg)%2!=0:
	count=len(neg)-1
else:
	count=len(neg)
prod=1
ne=0
for i in range(0,len(num)):
	if num[i]<0:
		ne+=1
	if num[i]!=0 and ne<=count:
		prod*=num[i]
	else:
		break
print(prod)
