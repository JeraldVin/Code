str1=input()
str2=input()
arr1=[]
arr2=[]
flag=0
for i in range(1,len(str1)+1):
	s=str1[:i]
	dup=s
	j=0
	while True:
		if s*j==str1:
			flag=1
			break
		if len(s*j)>=len(str1):
			break
		j+=1
	if flag==1:
		break
j=1
while True:
	if len(str1)%j==0:
		arr1.append(dup*j)
	if j>=int(len(str1)/len(dup)):
		break
	j+=1
flag=0
for i in range(1,len(str2)+1):
	s2=str1[:i]
	dup2=s2
	j=0
	while True:
		if s2*j==str2:
			flag=1
			break
		if len(s2*j)>=len(str2):
			break
		j+=1
	if flag==1:
		break
j=1
while True:
	if len(str2)%j==0:
		arr2.append(dup2*j)
	if j>=int(len(str2)/len(dup2)):
		break
	j+=1
print(len(set(arr1)&set(arr2)))
