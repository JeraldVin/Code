start,end=map(int,input().split(" "))
ans=[]
for num in range(start+1,end):
	temp=num
	sum=0
	while temp>0:
		n=temp%10
		sum+=n**3
		temp/=10
		temp=int(temp)
	if sum==num:
		ans.append(num)
for i in range(0,len(ans)):
	if i==len(ans)-1:
		print(ans[i],end="")
	else:
		print(ans[i],end=" ")
