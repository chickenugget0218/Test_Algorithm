def solution(num):
    answer = 0
    
    while(num != 1):
        if num == 1:
            return 0
        if answer == 500:
            return -1
        
        if num%2 == 0: #짝수 
            num = num / 2
            
        elif num%2 == 1: #홀수
            num = (num*3) + 1
        answer += 1
            
    return answer