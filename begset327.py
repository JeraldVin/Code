string=input()
num=".0123456789"
flag=0
for i in range(0,len(string)):
	if string[i] not in num:
		flag=1
		break
if flag==0:
	print("Yes")
else:
	print("No")
