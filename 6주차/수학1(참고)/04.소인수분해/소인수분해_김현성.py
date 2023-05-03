def gcd(n):
    if n ==0:
        return 0
    else :
        for i in range(2,n+1):
            while n%i ==0:
                print(i)
                n=n//i

num = int(input())

gcd(num)