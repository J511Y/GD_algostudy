a=int(input())
b=int(input())
sum=0
for x in range(a):
    sum+=b%10
    b=b//10
print(sum)

// 이 풀이는 파이썬으로 작성된 풀이입니다.