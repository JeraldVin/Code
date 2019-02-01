n=int(input())
string=[]
flag=0
for i in range(0,n):
	string.append(input())
for i in range(0,len(string[0])):
	for j in range(0,len(string)-1):
		if len(string[j])<=i or len(string[j+1])<=i:
			flag=1
			break
		if(string[j][:i]==string[j+1][:i]):
			continue
		else:
			flag=1
			break
	if flag==1:
		break
print(string[0][:i-1])
