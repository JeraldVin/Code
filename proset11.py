n=int(input())
string=[]
flag=0
for i in range(0,n):
	string.append(input())
for i in range(1,len(string[0])):
	for j in range(0,len(string)-1):
		if len(string[j])<=i or len(string[j+1])<=i      :
			flag=2
			break
		if(string[j][:i+1]==string[j+1][:i+1]):
			continue
		else:
			flag=1
			break
	if flag==1 or flag==2:
		break
if flag==2 or flag==1:
	print(string[0][:i])
elif flag==0:
	print(string[0])
