string=input()
count=[string.count(string[x]) for x in range(len(string))]
print(string[count.index(max(count))])
