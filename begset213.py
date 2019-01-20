num=int(input())
flag=0
if num==1:
	print("no")
else:
	for i in range(2,int(num/2)+1):
		if num%i==0:
			flag=1
			break
	if flag==0:
		print("yes")
	else:
		print("no")
