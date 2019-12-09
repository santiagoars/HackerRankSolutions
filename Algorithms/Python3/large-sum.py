def aVeryBigSum(ar):
    sum = 0
    for i in ar:
        sum = sum + i
    return sum

a = [10000, 20000, 30000, 40000]
print(aVeryBigSum(a))