string=input()
num="0123456789"
count=0
for i in range(0,len(string)):
	if string[i] in num:
		count+=1
print(count)
