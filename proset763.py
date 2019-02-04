def unique(s):
	for i in range(0,len(s)):
		if s.count(s[i])!=1:
			return -1
	return 1
string=input()
j=0
k=1
length=0
while(True):
	ss=string[j:k]
	res=unique(ss)
	if(res>0):
		if(len(ss)>length):
			length=len(ss)
		k+=1
	else:
		j+=1
		k=j+1
	if k>len(string) or j>len(string):
		break
print(length)
