import sys

def main():
    data=sys.stdin.readline().split()
    if not data:
        return
    n=int(data[0]); t=int(data[1])
    if t==10:
        if n==1:
            print(-1)
        else:
            print('1'+'0'*(n-2)+'0')
    else:
        print(str(t)+'0'*(n-1))

if __name__=='__main__':
    main()