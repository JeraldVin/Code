num=int(input())
temp=num
sum=0
while temp>0:
	n=temp%10
	sum+=n**3
	temp/=10
	temp=int(temp)
if sum==num:
	print("yes")
else:
	print("no")
