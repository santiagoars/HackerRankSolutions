def simpleArraySum(ar):
    if(len(ar) == 0):
        return 0
    else:
        sum = 0
        for i in ar:
            sum += i
        return sum

a = [6,7,9]

print(simpleArraySum(a))