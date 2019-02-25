string=list(input().split())
rev=[]
for i in range(len(string)):
	rev.append("".join(reversed(string[i])))
print(*rev,)
