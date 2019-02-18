str1,str2=input().split()
i=0
flag=0
while i+2<=len(str1):
	if str1[i:i+2] in str2:
		flag=1
		print("yes")
		break
	i+=1
if flag==0:
	print("no")
