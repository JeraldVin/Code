string=input()
for i in range(1,len(string)):
	if(string<string[i:]):
		print(string[i:])
		break
