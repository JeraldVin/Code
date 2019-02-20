n,k=map(int,input().split())
a=1
while True:
	if k**a==n:
		print("yes")
		break
	elif k**a>n:
		print("no")
		break
	a+=1
