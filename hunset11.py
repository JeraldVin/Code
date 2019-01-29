n=int(input())
l=list(map(int,input().split(" ")))
flag=0
ans=[]
for i in range(0,len(l)):
	if l.count(l[i])==1:
		continue
	else:
		ans.append(l[i])
		flag=1
res=list(set(ans))
res.sort()
for i in range(0,len(res)):
	if i==len(res)-1:
		print(res[i],end="")
	else:
		print(res[i],end=" ")
if flag==0:
	print("unique")
