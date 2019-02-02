strings=list(input().split(" "))
newList=["".join(reversed(x)) for x in strings]
print(*newList,)
