N = int(input())
ans = ''
if N == 0:
    print(0)
    exit() #프로그램 실행을 종료하는 함수로 숫자 0을 입력받으면 0을 출력하고 실행을 종료한다 .

while N != 0:
    if N % -2: # N % -2로 나누었을때 값이 0이 아니면 작동
        N = N // -2 + 1
        ans = '1' + ans
    else: # 0이면 작동
        N = N // -2
        ans = '0' + ans

print(int(ans))