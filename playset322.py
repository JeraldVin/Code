def gcd(x,y):
	if x==0:
		return y
	else:
		return gcd(y%x,x)
n,k=map(int,input().split())
print(gcd(n,k))
