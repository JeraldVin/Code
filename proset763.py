def unique(s):
	for i in range(0,len(s)):
		if s.count(s[i])!=1:
			return -1
	return 1
string=input()
k=1
length=0
while(True):
	ss=string[0:k]
	res=unique(ss)
	if(res>0):
		length+=1
		k+=1
	else:
		break
	if k>len(string):
		break
print(length)
