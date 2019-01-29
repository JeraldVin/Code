st,en=input().split(" ")
start=int(st)
end=int(en)
ans=[]
for i in range(start+1,end):
	if i==1:
		continue
	flag=0
	for j in range(2,int(i/2)+1):
		#print(i)
		#print(j)
		if i%j==0:
			flag=1
			break
	if flag==0:
		ans.append(i)
for i in range(0,len(ans)):
	if i==len(ans)-1:
		print(ans[i],end="")
	else:
		print(ans[i],end=" ")
