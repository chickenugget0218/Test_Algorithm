def solution(bin1, bin2):
    answer = ''
    num = int(bin1,2)+int(bin2,2)
    answer =str (bin(num)[2:])
    return answer